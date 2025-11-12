// Dosya Adı: ErisimTest.java
package com.sirket.model; // Calisan.java ile AYNI PAKET

/**
 * Dört erişim belirtecinin davranışını test eden yardımcı sınıf.
 */
class ErisimBelirtecleri { // Sınıfın kendisi 'default' erişimli

    // 1. private: Sadece bu sınıf içinde erişilebilir.
    private String privateAlan = "Private: Sadece kendi sınıfımdan erişebilirim.";

    // 2. default (belirteç yok): Aynı paket içindeki tüm sınıflardan erişilebilir.
    String defaultAlan = "Default: Aynı paket içindeki herkes erişebilir.";

    // 3. protected: Aynı paket içinden ve farklı paketteki alt sınıflardan erişilebilir.
    protected String protectedAlan = "Protected: Aynı paket ve alt sınıflar erişebilir.";

    // 4. public: Her yerden erişilebilir.
    public String publicAlan = "Public: Herkes erişebilir.";
}


/**
 * Test sınıfı. Aynı paket içindeki erişimleri kontrol eder.
 */
public class ErisimTest {

    public static void main(String[] args) {
        
        // Çalışan sınıfı örneği
        Calisan c = new Calisan("Ayşe Yılmaz", 30);
        c.setMaas(50000.0);
        
        System.out.println("--- Çalışan Sınıfı Kapsülleme Testi ---");
        System.out.println("Ad: " + c.getAd()); // getAd() metodu public olduğu için erişilebilir.
        System.out.println("Maaş: " + c.getMaas()); 

        // c.yas = 25; // HATA! 'yas' alanı Calisan sınıfında 'private' olduğu için doğrudan erişilemez.
        
        System.out.println("\n--- Aynı Paket İçi Erişim Belirteçleri Testi ---");
        
        ErisimBelirtecleri eb = new ErisimBelirtecleri();

        // System.out.println(eb.privateAlan); 
        // HATA: 'privateAlan' alanına erişilemez. Sadece ErisimBelirtecleri sınıfı içinden erişilebilir.

        System.out.println(eb.defaultAlan);  // Başarılı: Aynı paketteyiz.
        System.out.println(eb.protectedAlan); // Başarılı: Aynı paketteyiz.
        System.out.println(eb.publicAlan);   // Başarılı: Her yerden erişilebilir.
    }
}