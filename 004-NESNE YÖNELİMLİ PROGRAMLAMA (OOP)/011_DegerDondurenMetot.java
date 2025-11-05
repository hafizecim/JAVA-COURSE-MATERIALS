// 011_DegerDondurenMetot.java

class Kedi {
    String isim;
    String renk;
    int dogumYili; // Yeni özellik: Kedinin doğum yılı

    // Metot (Davranış): Kedinin ne yaptığını tanımlar.
    void miyavla() {
        System.out.println(isim + " miyavlıyor: MİYAV! MİYAV!");
    }

    // Parametre alan metot: Dışarıdan bilgi kabul eder.
    void yemekYe(String yemekTuru) {
        System.out.println(isim + " (" + renk + " renkli) " + yemekTuru + " yiyor. Lezzetli!");
    }
    
    // YENİ METOT: Değer Döndüren Metot
    // Metot imzasında 'void' yerine döndürülecek veri tipini (int) belirtiyoruz.
    int kediYasiHesapla() {
        // Mevcut yıl bilgisini basitçe 2025 kabul edelim.
        final int MEVCUT_YIL = 2025;
        int yas = MEVCUT_YIL - dogumYili;
        
        // Hesaplanan 'yas' değerini metodun çağrıldığı yere geri gönderiyoruz.
        return yas; 
    }
}

public class DegerDondurenMetot {
    public static void main(String[] args) {
        
        // --- Kedi 1 (Pamuk) ---
        Kedi pamuk = new Kedi();
        pamuk.isim = "Pamuk";
        pamuk.renk = "Beyaz";
        pamuk.dogumYili = 2023; // Doğum yılını atıyoruz

        // --- Kedi 2 (Tekir) ---
        Kedi tekir = new Kedi();
        tekir.isim = "Tekir";
        tekir.renk = "Gri";
        tekir.dogumYili = 2020; // Doğum yılını atıyoruz
        
        // Değer döndüren metodu çağırıyoruz ve sonucu bir değişkene atıyoruz:
        int pamukYasi = pamuk.kediYasiHesapla(); 

        System.out.println("--- Pamuk'un Bilgileri ve Davranışları ---");
        System.out.println(pamuk.isim + " tahmini " + pamukYasi + " yaşında.");
        
        // Döndürülen değeri doğrudan System.out.println içinde kullanabiliriz:
        System.out.println("Tekir tahmini " + tekir.kediYasiHesapla() + " yaşında.");
        
        System.out.println("\n--- Ek Davranışlar ---");
        pamuk.miyavla();
        tekir.yemekYe("Yaş Mama");
    }
}