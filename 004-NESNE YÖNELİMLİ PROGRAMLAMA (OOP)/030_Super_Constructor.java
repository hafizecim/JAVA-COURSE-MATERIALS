// Dosya Adı: 030_Super_Constructor.java
package com.kalitim.constructor;

/**
 * Üst Sınıf: Parametreli yapıcı (constructor) içerir.
 */
class Personel {
    private int sicilNo;

    public Personel(int sicilNo) {
        System.out.println("1. Personel Yapıcısı (Üst Sınıf) çağrıldı: Sicil No = " + sicilNo);
        this.sicilNo = sicilNo;
    }

    public int getSicilNo() {
        return sicilNo;
    }
}

/**
 * Alt Sınıf: Üst sınıfa veri göndermek için super() kullanmak ZORUNDADIR.
 */
class Mudur extends Personel {
    
    private String departman;
    
    public Mudur(int sicilNo, String departman) {
        // super() kullanımı ZORUNLUDUR, aksi takdirde derleme hatası oluşur,
        // çünkü üst sınıfın varsayılan (parametresiz) bir yapıcısı yoktur.
        // Bu, üst sınıfın gerektirdiği verinin (sicilNo) başlatılmasını sağlar.
        super(sicilNo); 
        
        System.out.println("2. Mudur Yapıcısı (Alt Sınıf) çağrıldı: Departman = " + departman);
        this.departman = departman;
    }

    public void bilgileriGoster() {
        // getSicilNo() metodu miras alınmıştır.
        System.out.println("Müdür Bilgisi: Sicil No: " + getSicilNo() + ", Departman: " + departman);
    }
}

public class TestSuper {
    public static void main(String[] args) {
        System.out.println("--- 030_Super_Constructor Testi ---");
        
        // Bir Mudur nesnesi yaratıldığında, önce üst sınıf (Personel) yapıcısı çağrılır.
        Mudur mudur1 = new Mudur(500, "Yazılım");
        mudur1.bilgileriGoster();
    }
}