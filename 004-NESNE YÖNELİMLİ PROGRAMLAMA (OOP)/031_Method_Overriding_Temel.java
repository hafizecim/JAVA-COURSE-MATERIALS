// Dosya Adı: 031_Method_Overriding_Temel.java
package com.kalitim.override;

/**
 * Üst Sınıf: Ortak (Genel) bir işlem tanımlar.
 */
class Sekil {
    
    public double alanHesapla() {
        System.out.println("Şekil: Alan hesaplama genel metodu çalıştı.");
        return 0.0; // Genel şekil için varsayılan değer
    }
}

/**
 * Alt Sınıf: Üst sınıftaki metodu kendi ihtiyaçlarına göre özelleştirir.
 */
class Dikdortgen extends Sekil {
    
    private double genislik;
    private double yukseklik;

    public Dikdortgen(double genislik, double yukseklik) {
        this.genislik = genislik;
        this.yukseklik = yukseklik;
    }

    /**
     * @Override: Metot Ezme (Overriding).
     * Üst sınıftaki metot imzasıyla (isim, parametreler) aynı olmalıdır.
     * Bu etiket (@Override) bir hata kontrolüdür, zorunlu değildir ama önerilir.
     */
    @Override 
    public double alanHesapla() {
        // super.alanHesapla(); // Üst sınıf metodunu çağırmaya gerek yok.
        double alan = genislik * yukseklik;
        System.out.println("Dikdörtgen: Alan hesaplama özelleştirildi. Sonuç: " + alan);
        return alan;
    }
}

public class TestOverrideTemel {
    public static void main(String[] args) {
        System.out.println("--- 031_Method_Overriding_Temel Testi ---");
        
        Sekil s = new Sekil();
        s.alanHesapla(); // Sekil metodunu çağırır.
        
        Dikdortgen d = new Dikdortgen(10.0, 5.0);
        d.alanHesapla(); // Override edilmiş Dikdortgen metodunu çağırır.
    }
}