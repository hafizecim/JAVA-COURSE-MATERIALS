// 008_DahaGercekciSinifYapisi.java

class Kitap {
    // 1. Özellikler (Fields)
    String baslik;
    String yazar;
    int sayfaSayisi;
    boolean okunmaDurumu = false; // Varsayılan değer atama

    // 2. Metot: Kitabı okundu olarak işaretleme
    void okunduIsaretle() {
        this.okunmaDurumu = true; // Bu nesnenin 'okunmaDurumu' özelliğini değiştirir.
        System.out.println("-> " + baslik + " okundu olarak işaretlendi.");
    }
    
    // 3. Metot: Kitapla ilgili detayları döndürme
    String detaylariGetir() {
        String durum = okunmaDurumu ? "Okunmuş" : "Okunmadı"; // Ternary operatör
        return baslik + " (Yazar: " + yazar + ", Sayfa: " + sayfaSayisi + ", Durum: " + durum + ")";
    }
}

public class DahaGercekciSinifYapisi {
    public static void main(String[] args) {
        // Yeni bir Kitap nesnesi oluşturma
        Kitap kitap1 = new Kitap();
        kitap1.baslik = "Sefiller";
        kitap1.yazar = "Victor Hugo";
        kitap1.sayfaSayisi = 1456;

        Kitap kitap2 = new Kitap();
        kitap2.baslik = "Beyaz Gemi";
        kitap2.yazar = "Cengiz Aytmatov";
        kitap2.sayfaSayisi = 184;

        System.out.println("--- Kütüphane Durumu (Başlangıç) ---");
        System.out.println(kitap1.detaylariGetir());
        System.out.println(kitap2.detaylariGetir());

        // Metotları kullanarak nesnelerin durumunu değiştirme
        System.out.println("\n--- İşlemler ---");
        kitap1.okunduIsaretle();
        // kitap2 okunmadı olarak kalıyor

        System.out.println("\n--- Kütüphane Durumu (Son) ---");
        System.out.println(kitap1.detaylariGetir()); // Durumu "Okunmuş"
        System.out.println(kitap2.detaylariGetir()); // Durumu "Okunmadı"
    }
}