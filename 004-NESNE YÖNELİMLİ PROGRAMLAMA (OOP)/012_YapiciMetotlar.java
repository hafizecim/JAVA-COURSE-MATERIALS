// 012_YapiciMetotlar.java

// Sınıf adı ile aynı isme sahip özel bir metottur.
class Kitap {
    // === Özellikler ===
    String baslik;
    String yazar;
    int sayfaSayisi;
    boolean yayindaMi = false; // Başlangıçta false olarak ayarladık

    // === 1. Varsayılan (Parametresiz) Yapıcı Metot ===
    // 'new Kitap()' çağrıldığında çalışır. Eğer biz yazmazsak Java otomatik ekler.
    public Kitap() {
        // Bu yapıcı metot sadece bir mesaj yazdırıyor.
        System.out.println("-> Yeni, boş bir Kitap nesnesi oluşturuluyor.");
        // Özelliklere başlangıç değerleri burada atanabilir.
    }

    // === 2. Parametreli Yapıcı Metot (Constructor) ===
    // 'new Kitap(..., ..., ...)' şeklinde çağrılır.
    // Nesne oluşturulurken özelliklere doğrudan değer atamamızı sağlar.
    public Kitap(String baslik, String yazar, int sayfaSayisi) {
        System.out.println("-> Yeni, parametreli Kitap nesnesi oluşturuluyor.");
        // Parametre olarak gelen değerleri nesnenin özelliklerine atıyoruz.
        this.baslik = baslik; // 'this' anahtar kelimesi, sınıfın özelliğini ifade eder.
        this.yazar = yazar;
        this.sayfaSayisi = sayfaSayisi;
        this.yayindaMi = true; // Bu kitap nesne oluşturulurken yayınlanmış kabul edilebilir.
    }

    // === Davranış (Metot) ===
    public void bilgileriGoster() {
        System.out.println("\n--- Kitap Bilgileri ---");
        System.out.println("Başlık: " + baslik);
        System.out.println("Yazar: " + yazar);
        System.out.println("Sayfa Sayısı: " + sayfaSayisi);
        System.out.println("Yayında: " + (yayindaMi ? "Evet" : "Hayır"));
    }
}

public class YapiciMetotlar {
    public static void main(String[] args) {
        
        System.out.println("### 1. Varsayılan Constructor Kullanımı ###");
        // Varsayılan (parametresiz) constructor çağrılır.
        Kitap denemeKitabi = new Kitap();
        denemeKitabi.baslik = "OOP'ye Giriş"; // Değerler sonradan manuel atanır.
        
        denemeKitabi.bilgileriGoster();

        System.out.println("\n### 2. Parametreli Constructor Kullanımı ###");
        // Parametreli constructor çağrılır. Özellikler direkt atanır.
        Kitap maceraKitabi = new Kitap("Hazine Adası", "Robert Louis Stevenson", 350);
        
        maceraKitabi.bilgileriGoster();
        
        System.out.println("\n--- İki Farklı Nesne Durumu ---");
        // maceraKitabi nesnesi yayindaMi=true, denemeKitabi nesnesi yayindaMi=false (default değer) kaldı.
    }
}