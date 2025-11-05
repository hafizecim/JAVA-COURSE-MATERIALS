// 016_KitapKapsullemeVeConstructor.java

class Kitap {
    // === 1. Kapsülleme: Özellikler private yapıldı ===
    private String baslik;
    private String yazar;
    private int sayfaSayisi;
    private boolean okunmaDurumu; // Constructor tarafından ayarlanacak

    // === 2. Yapıcı Metot (Constructor) ===
    // Nesne oluşturulurken temel verilerin atanmasını zorunlu kılar.
    public Kitap(String baslik, String yazar, int sayfaSayisi) {
        this.baslik = baslik;
        this.yazar = yazar;
        // Sayfa sayısını kontrol edebiliriz.
        this.sayfaSayisi = (sayfaSayisi > 0) ? sayfaSayisi : 1; 
        this.okunmaDurumu = false; // Başlangıç durumu varsayılan olarak okunmadı.
        System.out.println("Yeni Kitap oluşturuldu: " + baslik);
    }
    
    // === 3. Metotlar (Davranışlar) ===

    // Durum değiştirici (Setter) metot, private özelliği günceller
    public void okunduIsaretle() {
        if (!this.okunmaDurumu) { // Zaten okunmadıysa işaretle
            this.okunmaDurumu = true; 
            System.out.println("-> " + baslik + " okundu olarak işaretlendi.");
        } else {
            System.out.println("-> " + baslik + " zaten okunmuş durumda.");
        }
    }
    
    // Veri okuyucu (Getter) metot, private özellikleri döndürür
    public String getBaslik() {
        return baslik;
    }
    
    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    // Detayları döndüren metot (Getter metotlarını da kullanabilir)
    public String detaylariGetir() {
        String durum = okunmaDurumu ? "Okunmuş" : "Okunmadı";
        return baslik + " (Yazar: " + yazar + ", Sayfa: " + sayfaSayisi + ", Durum: " + durum + ")";
    }
}

public class KitapKapsullemeVeConstructor {
    public static void main(String[] args) {
        
        // Constructor ile nesne oluşturma (veri zorunluluğu)
        Kitap kitap1 = new Kitap("Sefiller", "Victor Hugo", 1456);
        Kitap kitap2 = new Kitap("Beyaz Gemi", "Cengiz Aytmatov", 184);

        System.out.println("\n--- Kütüphane Durumu (Başlangıç) ---");
        System.out.println(kitap1.detaylariGetir());
        System.out.println(kitap2.detaylariGetir());
        
        // Okuma durumu değiştirme
        System.out.println("\n--- İşlemler ---");
        kitap1.okunduIsaretle();
        kitap1.okunduIsaretle(); // Tekrar işaretleme denemesi
        
        // Kapsülleme örneği: Başlık bilgisine Getter ile erişim
        System.out.println("Okunan Kitap Başlığı: " + kitap1.getBaslik());

        System.out.println("\n--- Kütüphane Durumu (Son) ---");
        System.out.println(kitap1.detaylariGetir());
        System.out.println(kitap2.detaylariGetir()); 
    }
}