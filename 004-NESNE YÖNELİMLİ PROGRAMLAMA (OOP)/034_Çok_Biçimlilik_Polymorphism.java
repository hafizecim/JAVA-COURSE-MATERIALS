// Dosya Adı: 034_Çok_Biçimlilik_Polymorphism.java
package com.kalitim.polymorphism;

import java.util.ArrayList;
import java.util.List;

/**
 * Üst Sınıf: Ortak arayüzü sağlar.
 */
class Cihaz {
    
    private String ad;

    public Cihaz(String ad) {
        this.ad = ad;
    }

    public void baslat() { // Override edilecek ortak metot
        System.out.println(ad + ": Varsayılan başlatma prosedürü.");
    }
}

class Telefon extends Cihaz {
    public Telefon() {
        super("Telefon");
    }

    @Override
    public void baslat() {
        System.out.println("Telefon: Hızlı başlatma ve şebeke bağlantısı kontrolü.");
    }
}

class Bilgisayar extends Cihaz {
    public Bilgisayar() {
        super("Bilgisayar");
    }

    @Override
    public void baslat() {
        System.out.println("Bilgisayar: BIOS kontrolü ve işletim sistemi yükleniyor.");
    }
}

/**
 * Çok Biçimlilik (Polymorphism) Test Sınıfı.
 */
public class TestPolymorphism {
    public static void main(String[] args) {
        System.out.println("--- 034_Çok_Biçimlilik_Polymorphism Testi ---");
        
        // 1. Üst sınıf tipiyle alt sınıf nesnelerini tutma.
        // Listede her nesne Cihaz tipinde görünür, ama gerçekte kendi tipindedir.
        List<Cihaz> cihazListesi = new ArrayList<>();
        cihazListesi.add(new Telefon());
        cihazListesi.add(new Bilgisayar());
        cihazListesi.add(new Cihaz("Akıllı Saat"));
        
        System.out.println("Tüm cihazları aynı arayüzle başlatma:");

        // 2. Polymorphism: Döngüde her nesneyi Cihaz olarak ele alıyoruz,
        // ancak çağırdığımız 'baslat()' metodu, nesnenin gerçek tipine göre çalışıyor.
        for (Cihaz c : cihazListesi) {
            // Dinamik bağlama (Dynamic Binding): Hangi 'baslat()' metodunun çağrılacağına,
            // nesnenin çalışma zamanındaki (runtime) gerçek tipi karar verir.
            c.baslat(); 
        }
        
        System.out.println("Polymorphism sayesinde, tek bir metot çağrısı farklı davranışlar sergiledi.");
    }
}