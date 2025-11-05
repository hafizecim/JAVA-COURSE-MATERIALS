// 009_GelistirilmisArabaSinifi.java

// Bir 'Araba' sınıfı tanımlıyoruz. Artık özelliklere (verilere) ve
// davranışlara (metotlara) sahip.
class Araba {
    // === Özellikler (Fields / Üye Değişkenler) ===
    String marka;
    String model;
    int mevcutHiz = 0; // Başlangıç hızı 0 olarak ayarlandı

    // === Davranışlar (Methods / Metotlar) ===

    // Arabanın mevcut hızını artıran bir metot
    public void hizlan(int artisMiktari) {
        mevcutHiz = mevcutHiz + artisMiktari;
        System.out.println(marka + " " + model + " hızı " + mevcutHiz + " km/s'e çıktı.");
    }

    // Arabanın mevcut bilgilerini yazdıran bir metot
    public void bilgileriGoster() {
        System.out.println("--- Araba Bilgileri ---");
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Anlık Hız: " + mevcutHiz + " km/s");
    }
}

public class GelistirilmisArabaSinifi {
    public static void main(String[] args) {
        System.out.println("### 1. Nesne Oluşturma ###");

        // 'Araba' sınıfından ilk nesnemizi (audi) oluşturuyoruz
        Araba audi = new Araba();

        // Oluşturulan nesnenin özelliklerine değer atıyoruz
        audi.marka = "Audi";
        audi.model = "A4";

        // Nesnenin bir metodunu çağırarak mevcut durumunu gösteriyoruz
        audi.bilgileriGoster();

        System.out.println("\n### 2. Nesne Davranışı ###");
        // Nesnenin 'hizlan' metodunu çağırarak davranışını tetikliyoruz
        audi.hizlan(50);
        audi.hizlan(30);

        // Hızlandıktan sonra tekrar bilgileri gösteriyoruz
        audi.bilgileriGoster();

        System.out.println("\n--- İkinci Bir Nesne Oluşturma ---");

        // Aynı 'Araba' sınıfından ikinci bir nesne (bmw) oluşturuyoruz
        // Her nesnenin kendine ait özellikleri vardır.
        Araba bmw = new Araba();
        bmw.marka = "BMW";
        bmw.model = "3 Serisi";

        // İkinci nesnenin durumunu gösteriyoruz
        bmw.bilgileriGoster();

        // İkinci nesne hızlanıyor. Bu, ilk nesneyi (audi) etkilemez.
        bmw.hizlan(100);
        bmw.bilgileriGoster();
    }
}