// Dosya Adı: 024_Default_PaketIciIslemler.java
package com.servis.data; // Veri Servisi Paketi

/**
 * 1. Sınıf: Veritabanı bağlantı bilgilerini tutar.
 */
class VeritabaniBaglantisi { // Sınıfın kendisi 'default' erişimli

    // default (Paket Kapsamlı) alan: Sadece 'com.servis.data' paketi içinden erişilebilir.
    String baglantiStringi = "jdbc:postgresql://db.com/prod";
    
    // default metot: Sadece 'com.servis.data' paketi içinden çağrılabilir.
    void baglantiKontroluYap() {
        System.out.println("VeritabaniBaglantisi: Bağlantı kontrolü başarılı (default metot).");
    }

    // public metot
    public void baglantiAc() {
        System.out.println("VeritabaniBaglantisi: Gerçek bağlantı açıldı.");
    }
}

/**
 * 2. Sınıf: Aynı paketteki veritabanı işlemlerini yürütür.
 */
class VeritabaniIslemleri { // Sınıfın kendisi 'default' erişimli
    
    public void veriCek() {
        VeritabaniBaglantisi baglanti = new VeritabaniBaglantisi();
        
        // Başarılı: Aynı pakette olduğumuz için default alana erişebiliriz.
        System.out.println("VeritabaniIslemleri: Bağlantı dizesi alındı: " + baglanti.baglantiStringi);
        
        // Başarılı: Aynı pakette olduğumuz için default metoda erişebiliriz.
        baglanti.baglantiKontroluYap(); 
        
        baglanti.baglantiAc();
    }
}

// --- FARKLI PAKET SIMÜLASYONU ---
package com.uygulama.test;

import com.servis.data.VeritabaniIslemleri; // İşlemler sınıfı public olmadığı için HATA verecektir.
// Not: Default sınıflar farklı paketten import edilemez.
// Simülasyon için VeritabaniIslemleri sınıfını public yapalım.

// public class VeritabaniIslemleri { ... } olsaydı:

// class TestDefaultErisim {
//     public static void main(String[] args) {
//         VeritabaniIslemleri islem = new VeritabaniIslemleri();
//         // islem.baglanti.baglantiStringi; // HATA! Farklı paketten default alana erişilemez.
//     }
// }