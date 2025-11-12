// Dosya Adı: 022_Protected_KalitimTesti.java
package com.ana.model; // Birinci Paket

/**
 * Üst Sınıf (Base Class). Protected ve Public metotları içerir.
 */
class AnaMakine {

    // Protected Metot: Aynı paket ve farklı paketteki alt sınıflar erişebilir.
    protected void logGiris() {
        System.out.println("AnaMakine: Sisteme giriş loglandı (Protected Metot).");
    }

    // Public Metot: Her yerden erişilebilir.
    public void sistemDurumuGoster() {
        System.out.println("AnaMakine: Sistem genel durumu çalışıyor (Public Metot).");
    }
}


// --- FARKLI PAKET SIMÜLASYONU ---

package com.farkli.test; // İkinci (Farklı) Paket

import com.ana.model.AnaMakine; // Üst sınıfı import etmeliyiz.

/**
 * Alt Sınıf (Sub Class): AnaMakine'den kalıtım alır. 
 * Protected erişimin kalıtım yoluyla kullanımını test eder.
 */
class Sunucu extends AnaMakine {

    public void baslat() {
        System.out.println("\nSunucu (Alt Sınıf) başlatılıyor...");
        
        // Başarılı: Farklı pakette olmamıza rağmen 'protected' metoda erişebiliriz,
        // çünkü 'Sunucu' sınıfı 'AnaMakine' sınıfından KALITIM almaktadır.
        logGiris(); 
        
        // Başarılı: Public metoda her zaman erişilebilir.
        sistemDurumuGoster(); 
        
        System.out.println("Sunucu başlatma tamamlandı.");
    }
}

class TestProtectedErisim {
    public static void main(String[] args) {
        System.out.println("--- 020_Protected_KalitimTesti ---");
        
        Sunucu sunucu = new Sunucu();
        sunucu.baslat();

        AnaMakine makine = new AnaMakine();

        System.out.println("\n--- Farklı Paketten Bağımsız Erişim Testi ---");
        // makine.logGiris(); 
        // HATA! Farklı paketteki BAĞIMSIZ sınıftan (kalıtım almayan) protected metoda erişilemez.
        
        // Başarılı: Public metot her yerden erişilebilir.
        makine.sistemDurumuGoster();
    }
}