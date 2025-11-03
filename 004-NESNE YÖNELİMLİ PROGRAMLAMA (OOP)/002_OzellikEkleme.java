// 002_OzellikEkleme.java

class Ogrenci {
    // Özellikler (Fields / Alanlar): Öğrencinin durumunu tutan değişkenler.
    String ad;
    int ogrenciNo;
    double notOrtalamasi;
}

public class OzellikEkleme {
    public static void main(String[] args) {
        // Ogrenci sınıfından iki farklı nesne oluşturuyoruz.
        Ogrenci ogrenci1 = new Ogrenci();
        Ogrenci ogrenci2 = new Ogrenci();

        // Nesne 1'in özelliklerine değer atama (. (dot) operatörü kullanılır):
        ogrenci1.ad = "Ayşe Yılmaz";
        ogrenci1.ogrenciNo = 101;
        ogrenci1.notOrtalamasi = 3.55;

        // Nesne 2'nin özelliklerine değer atama:
        ogrenci2.ad = "Mehmet Kaya";
        ogrenci2.ogrenciNo = 102;
        ogrenci2.notOrtalamasi = 2.80;

        // Nesnelerin özellik değerlerini ekrana yazdırma:
        System.out.println("--- Öğrenci 1 Bilgileri ---");
        System.out.println("Ad: " + ogrenci1.ad);
        System.out.println("Numara: " + ogrenci1.ogrenciNo);
        System.out.println("Ortalama: " + ogrenci1.notOrtalamasi);

        System.out.println("\n--- Öğrenci 2 Bilgileri ---");
        System.out.println("Ad: " + ogrenci2.ad);
        System.out.println("Numara: " + ogrenci2.ogrenciNo);
        System.out.println("Ortalama: " + ogrenci2.notOrtalamasi);
        
        // Önemli Not: Her nesnenin kendi özellik değerleri vardır.
    }
}