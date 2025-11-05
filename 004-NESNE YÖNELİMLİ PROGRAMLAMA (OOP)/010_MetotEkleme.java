// 010_MetotEkleme.java

class Ogrenci {
    // === Özellikler (Fields / Alanlar) ===
    String ad;
    int ogrenciNo;
    double notOrtalamasi;

    // === Davranışlar (Methods / Metotlar) ===

    // 1. Öğrenci bilgilerini düzenli bir formatta gösteren metot
    public void bilgileriYazdir() {
        System.out.println("-------------------------");
        System.out.println("Öğrenci Adı: " + ad);
        System.out.println("Numarası: " + ogrenciNo);
        // Ortalamayı iki ondalık basamakla göstermek için formatlama yapabiliriz.
        System.out.printf("Not Ortalaması: %.2f%n", notOrtalamasi);
    }

    // 2. Öğrencinin başarılı olup olmadığını kontrol eden metot
    public void basariliMi(double gecmeNotu) {
        System.out.print(ad + " (" + ogrenciNo + ") için sonuç: ");
        if (notOrtalamasi >= gecmeNotu) {
            System.out.println("**BAŞARILI!** Tebrikler.");
        } else {
            System.out.println("Başarısız. Daha çok çalışmalısın.");
        }
    }
}

public class MetotEkleme {
    public static void main(String[] args) {
        // Geçme notunu belirleyelim.
        final double GECME_NOTU = 2.50;

        // --- Öğrenci 1 Oluşturma ---
        Ogrenci ogrenci1 = new Ogrenci();
        ogrenci1.ad = "Ayşe Yılmaz";
        ogrenci1.ogrenciNo = 101;
        ogrenci1.notOrtalamasi = 3.55;

        // Nesnenin metotlarını çağırıyoruz
        ogrenci1.bilgileriYazdir(); // Bilgi gösterimini metot yapıyor
        ogrenci1.basariliMi(GECME_NOTU);


        // --- Öğrenci 2 Oluşturma ---
        Ogrenci ogrenci2 = new Ogrenci();
        ogrenci2.ad = "Mehmet Kaya";
        ogrenci2.ogrenciNo = 102;
        ogrenci2.notOrtalamasi = 2.45; // Geçme notunun altında bir ortalama

        // İkinci nesnenin metotlarını çağırıyoruz
        ogrenci2.bilgileriYazdir();
        ogrenci2.basariliMi(GECME_NOTU);

        System.out.println("-------------------------");
        // Dikkat: Her nesne (ogrenci1 ve ogrenci2), basariliMi() metodunu
        // çağırırken kendi 'notOrtalamasi' değerini kullanır.
    }
}