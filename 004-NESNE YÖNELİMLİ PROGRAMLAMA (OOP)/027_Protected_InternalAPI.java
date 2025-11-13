// Dosya Adı: 027_Protected_InternalAPI.java
package com.modul.temel; // Temel Paket (Parent)

/**
 * Üst Sınıf: Modülün Dahili API'sini 'protected' ile sunar.
 */
class DahiliIsleyici {
    
    // protected metot: Sadece aynı paketteki ve farklı paketteki alt sınıflar erişebilir.
    // Bu, modül içindeki alt işleyicilerin kullanması için tasarlanmış bir "iç API"dir.
    protected void veriyiFormatla(String veri) {
        System.out.println("DahiliIsleyici: Veri formatlanıyor: " + veri.toUpperCase());
    }

    // public metot: Dışarıya sunulan resmi arayüz.
    public void islemBaslat(String girdi) {
        System.out.println("DahiliIsleyici: İşlem başladı.");
        veriyiFormatla(girdi); // İç API'yi kullanır.
    }
}

package com.modul.eklenti; // Eklenti Paketi (Child) - Farklı Paket

import com.modul.temel.DahiliIsleyici;

/**
 * Alt Sınıf (Eklenti): Temel modülün protected API'sini kullanarak işlevselliği genişletir.
 */
class EklentiIsleyici extends DahiliIsleyici {
    
    public void ozelIslem(String veri) {
        System.out.println("\nEklentiIsleyici: Özel işlem başlatılıyor.");
        
        // BAŞARILI: protected metot, farklı paketteki alt sınıf içinden çağrılabilir.
        // Eklenti, Temel Modülün dahili fonksiyonlarını kullanır.
        super.veriyiFormatla(veri + " [Eklenti Eklendi]"); 
        
        // Ayrıca public metodu da kullanabilir.
        super.islemBaslat(veri);
    }
}

public class TestProtected {
    public static void main(String[] args) {
        System.out.println("--- 027_Protected_InternalAPI Testi ---");
        
        EklentiIsleyici eklenti = new EklentiIsleyici();
        eklenti.ozelIslem("Ham Veri");
        
        // DahiliIsleyici isleyici = new DahiliIsleyici();
        // isleyici.veriyiFormatla("Test"); 
        // HATA! Farklı paketteki bağımsız sınıftan 'protected' metoda erişilemez.
    }
}