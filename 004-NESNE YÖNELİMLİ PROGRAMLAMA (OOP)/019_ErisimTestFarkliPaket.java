// Dosya Adı: ErisimTestFarkliPaket.java
package com.sirket.test; // Önceki sınıflardan FARKLI BİR PAKET

import com.sirket.model.ErisimBelirtecleri; // Sınıfı kullanmak için import etmeliyiz.

/**
 * ErisimBelirtecleri sınıfının farklı bir paketteki alt sınıfı (child class).
 * 'protected' alanlara sadece kalıtım yoluyla erişim imkanı sunar.
 */
class AltSinif extends ErisimBelirtecleri {
    
    public void protectedAlanTesti() {
        System.out.println("--- Alt Sınıf (Farklı Paket) Erişim Testi ---");
        
        // System.out.println(privateAlan); // HATA: 'private' her zaman gizlidir.
        
        // System.out.println(defaultAlan); // HATA: 'default' farklı paketten erişilemez.
        
        // Başarılı: 'protected' alanlara Alt Sınıf, Kalıtım Yoluyla erişebilir.
        System.out.println(protectedAlan);
        
        // Başarılı: 'public' her zaman erişilebilir.
        System.out.println(publicAlan);
    }
}


/**
 * Farklı bir paketteki bağımsız test sınıfı.
 */
public class ErisimTestFarkliPaket {

    public static void main(String[] args) {
        
        ErisimBelirtecleri eb = new ErisimBelirtecleri();
        
        System.out.println("\n--- Bağımsız Sınıf (Farklı Paket) Erişim Testi ---");
        
        // System.out.println(eb.privateAlan); // HATA
        
        // System.out.println(eb.defaultAlan); 
        // HATA: Farklı paketteki bağımsız sınıftan erişilemez.
        
        // System.out.println(eb.protectedAlan); 
        // HATA: Farklı paketteki bağımsız sınıftan erişilemez. Sadece AltSınıf içinden (kalıtım yoluyla) erişilebilirdi.

        System.out.println(eb.publicAlan); // Başarılı: Her yerden erişilebilir.
        
        System.out.println("-------------------------------------------------");
        
        // Alt Sınıf örneği üzerinden protected erişimi kontrol edelim.
        AltSinif alt = new AltSinif();
        alt.protectedAlanTesti();

        // alt.protectedAlan; // HATA! protected alana dışarıdan (AltSınıf nesnesi üzerinden) yine erişilemez.
        // protected erişimi sadece alt sınıfın kendi metotları içinden (örnek: protectedAlanTesti) mümkündür.
    }
}