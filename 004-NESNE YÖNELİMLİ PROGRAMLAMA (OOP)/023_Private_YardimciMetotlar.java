// Dosya Adı: 023_Private_YardimciMetotlar.java
package com.kapsul.metotlar;

/**
 * Kapsüllemenin metotlara uygulanması: Sınıfın iç mantığını dışarıdan gizlemek.
 * 'public' metotlar arayüzü oluşturur, 'private' metotlar ise iç işleyişi yürütür.
 */
public class Hesaplayici {

    // Ana hesaplama arayüzü: Dışarıdan çağrılacak public metot.
    public double buyukHesaplamaYap(double girdi) {
        System.out.println("Hesaplayıcı: Büyük hesaplama başlatıldı...");
        
        // 1. Adım: Ön işlem (private)
        double araDeger1 = onIslem(girdi);
        
        // 2. Adım: Çekirdek hesaplama (private)
        double araDeger2 = cekirdekHesaplama(araDeger1);
        
        // 3. Adım: Son kontrol ve formatlama (private)
        double sonuc = sonlandir(araDeger2);
        
        System.out.println("Hesaplayıcı: Büyük hesaplama tamamlandı. Sonuç: " + sonuc);
        return sonuc;
    }

    // --- PRIVATE YARDIMCI (HELPER) METOTLAR ---

    // Dışarıdan erişilemez. Sadece 'buyukHesaplamaYap' metodu tarafından çağrılabilir.
    // Bu, sınıfın iç mantığının (nasıl hesapladığının) dışarıdan gizlenmesini sağlar.
    
    private double onIslem(double deger) {
        System.out.println("-> [Private] Ön işlem adımı (değer 2 ile çarpıldı).");
        return deger * 2.0;
    }

    private double cekirdekHesaplama(double deger) {
        System.out.println("-> [Private] Çekirdek hesaplama adımı (değerin karekökü alındı).");
        return Math.sqrt(deger);
    }
    
    private double sonlandir(double deger) {
        System.out.println("-> [Private] Sonlandırma adımı (değer yuvarlandı).");
        return Math.round(deger * 100.0) / 100.0; // İki ondalık basamağa yuvarlama
    }
}

class TestHesaplayici {
    public static void main(String[] args) {
        System.out.println("--- 020_Private_YardimciMetotlar Testi ---");
        
        Hesaplayici h = new Hesaplayici();
        
        // Sadece public arayüz çağrılır. İçerideki private metotlar görünmez.
        h.buyukHesaplamaYap(50.0);
        
        // h.onIslem(10.0); 
        // HATA! 'onIslem' metodu private olduğu için dışarıdan çağrılamaz.
    }
}