// Dosya Adı: 029_Temel_Kalıtım.java
package com.kalitim.temel;

/**
 * Üst Sınıf (Parent Class): Tüm hayvanların sahip olduğu ortak özellikleri ve davranışları tanımlar.
 */
class Hayvan {
    
    private String ad;

    public Hayvan(String ad) {
        this.ad = ad;
    }

    public void yemekYe() {
        System.out.println(ad + " yemek yiyor.");
    }
    
    public String getAd() {
        return ad;
    }
    
    public void sesCikar() {
        System.out.println(ad + " bilinmeyen bir ses çıkarıyor.");
    }
}

/**
 * Alt Sınıf (Child Class): Hayvan sınıfından 'extends' anahtar kelimesiyle türetilir.
 * Artık Hayvan'ın tüm public ve protected alan/metotlarına sahiptir.
 */
class Kopek extends Hayvan {
    
    // Kopek sınıfına özgü alan
    private String irk;

    public Kopek(String ad, String irk) {
        // İlk satırda ZORUNLU olarak üst sınıfın yapıcısı (constructor) çağrılmalıdır.
        super(ad); 
        this.irk = irk;
    }

    // Kopek sınıfına özgü metot
    public void kos() {
        System.out.println(getAd() + " hızla koşuyor.");
    }

    // Üst sınıftan miras alınan metodu override (ezme) işlemi.
    @Override 
    public void sesCikar() {
        // super.sesCikar(); // İstenirse üst sınıf metodu da çağrılabilir.
        System.out.println(getAd() + " hav hav diyor.");
    }
}

public class TestKalıtım {
    public static void main(String[] args) {
        System.out.println("--- 029_Temel_Kalıtım Testi ---");
        
        Kopek kopek1 = new Kopek("Karabaş", "Kangal");
        
        // Üst sınıftan (Hayvan) miras alınan metotlar:
        kopek1.yemekYe(); 
        
        // Kendi sınıfına özgü metot:
        kopek1.kos();
        
        // Override edilmiş metot: Kopek sınıfındaki davranış çalışır.
        kopek1.sesCikar(); 
        
        // Üst sınıfı direkt kullanma:
        Hayvan hayvan1 = new Hayvan("Mırnav");
        hayvan1.sesCikar(); // Hayvan sınıfındaki orijinal metot çalışır.
    }
}