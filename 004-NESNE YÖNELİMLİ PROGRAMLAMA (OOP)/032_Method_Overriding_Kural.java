// Dosya Adı: 032_Method_Overriding_Kural.java
package com.kalitim.kurallar;

/**
 * Üst Sınıf
 */
class Arac {
    
    // public metot: Her yerden erişilebilir.
    public void calistir() { 
        System.out.println("Araç çalıştırıldı.");
    }
}

/**
 * Alt Sınıf: Overriding kurallarını test eder.
 */
class Otobus extends Arac {
    
    /**
     * Kural 1: Overriding sırasında erişim belirteci, 
     * üst sınıftaki metottan DAHA KISITLAYICI OLAMAZ.
     * * Üstteki metot public ise, alttaki metot public, protected veya default yapılamaz.
     *
     * HATA ÖRNEĞİ (Yorum Satırında Tutuldu):
     * protected void calistir() { ... } // HATA: Üstteki public'ten daha kısıtlayıcıdır.
     * void calistir() { ... } // HATA: Üstteki public'ten daha kısıtlayıcıdır (default).
     */
     
    // BAŞARILI: public metot, public olarak override edildi.
    @Override 
    public void calistir() { 
        System.out.println("Otobüs çalıştırıldı ve klima açıldı.");
    }
}

public class TestOverrideKural {
    public static void main(String[] args) {
        System.out.println("--- 032_Method_Overriding_Kural Testi ---");
        
        Otobus o = new Otobus();
        o.calistir();
        
        System.out.println("Not: calistir() metodu protected veya default yapılsaydı derleme hatası alırdık.");
    }
}