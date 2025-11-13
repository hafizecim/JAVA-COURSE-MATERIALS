// Dosya Adı: 033_Protected_Overriding_Test.java
package com.kalitim.protectedtest;

/**
 * Üst Sınıf
 */
class Raporlayici {
    
    // Protected metot: Alt sınıfların iç mantıkta kullanması için tasarlanmıştır.
    protected void veriyiOnIsle() {
        System.out.println("Raporlayıcı: Veri, raporlama için ön işlendi (Protected).");
    }
    
    public void raporOlustur() {
        System.out.println("Raporlayıcı: Rapor oluşturuluyor...");
        veriyiOnIsle(); 
    }
}

/**
 * Alt Sınıf: Protected metodu override ederek erişim belirtecini genişletir (public yapar).
 */
class OzetRaporlayici extends Raporlayici {
    
    /**
     * Kural 2: Overriding sırasında erişim belirteci, 
     * üst sınıftaki metottan daha AZ KISITLAYICI (daha geniş) OLABİLİR.
     * * Üstteki metot protected iken, alttaki metot public yapılabilir.
     */
    @Override 
    public void veriyiOnIsle() { // Protected -> Public (Başarılı)
        System.out.println("ÖzetRaporlayıcı: Veri, özet tablo için özelleştirilmiş şekilde ön işlendi (Public Override).");
    }
    
    // Yeni bir metot
    public void ozelRaporYap() {
        super.raporOlustur(); // Üst sınıfın public metodunu çağırır.
    }
}

public class TestProtectedOverride {
    public static void main(String[] args) {
        System.out.println("--- 033_Protected_Overriding_Test Testi ---");
        
        OzetRaporlayici or = new OzetRaporlayici();
        or.raporOlustur(); // Çalışan metot: OzetRaporlayici'daki Override edilmiş metot.
        
        // Üst sınıftaki metot protected olmasına rağmen,
        // Alt sınıfta public olarak override edildiği için dışarıdan çağrılabilir hale geldi.
        or.veriyiOnIsle(); 
    }
}