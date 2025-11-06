// 014_ErisimBelirleyicilerVeKapsulleme.java

class Urun {
    // === Özellikler (Private yapıldı) ===
    // 'private' sayesinde bu özelliklere sadece Urun sınıfının kendi metotları erişebilir.
    private String ad;
    private double fiyat;

    // YENİ: Yapıcı Metot (Constructor) - Nesne oluşturulurken veri atamasını zorunlu kılar.
    public Urun(String ad, double fiyat) {
        this.ad = ad;
        // Fiyatın sıfırdan küçük olmamasını garantileyen bir kontrol ekleyebiliriz (Kapsülleme).
        this.fiyat = (fiyat > 0) ? fiyat : 0.0;
        System.out.println(ad + " ürünü oluşturuldu.");
    }
    
    // === Public Getter (Erişici) Metotları ===
    // Dış dünyanın 'ad' ve 'fiyat' değerlerini okumasını sağlar.
    public String getAd() {
        return ad;
    }

    public double getFiyat() {
        return fiyat;
    }

    // === Public Setter (Değiştirici) Metotları ===
    // Dış dünyanın 'fiyat' özelliğini kontrollü bir şekilde değiştirmesini sağlar.
    public void setFiyat(double yeniFiyat) {
        // Kontrol mekanizması: Negatif fiyat girişini engelle.
        if (yeniFiyat >= 0) {
            this.fiyat = yeniFiyat;
            System.out.println(ad + " fiyatı " + yeniFiyat + " TL olarak güncellendi.");
        } else {
            System.out.println("HATA: Fiyat negatif olamaz.");
        }
    }
    
    // Urun bilgisi yazdırma metodu, artık private verilere erişmek için get metotlarına ihtiyaç duymaz.
    public void urunBilgisiYazdir() {
        System.out.println(ad + " (Fiyat: " + fiyat + " TL)");
    }
}

class Sepet {
    // Metot, parametre olarak bir 'Urun' nesnesi alıyor.
    public void urunEkle(Urun eklenecekUrun) {
        System.out.print("-> Sepete eklendi: ");
        // Parametre olarak gelen nesnenin metodunu çağırıyoruz.
        eklenecekUrun.urunBilgisiYazdir();
    }
    
    // YENİ: Fiyat güncelleme metodunda Setter kullanılıyor.
    public void fiyatGuncelle(Urun urun, double yeniFiyat) {
        System.out.println("\n--- Fiyat Güncelleme Girişimi ---");
        System.out.println("Eski Fiyat: " + urun.getFiyat() + " TL");
        
        // Nesnenin özelliğini değiştirmek için Setter metodu çağrılır.
        urun.setFiyat(yeniFiyat); 
    }
}

public class ErisimBelirleyicilerVeKapsulleme {
    public static void main(String[] args) {
        // Urun nesneleri artık Constructor ile oluşturuluyor.
        Urun laptop = new Urun("Dizüstü Bilgisayar", 25000.0);
        Urun fare = new Urun("Kablosuz Mouse", 450.0);
        
        Sepet alisverisSepeti = new Sepet();

        alisverisSepeti.urunEkle(laptop);
        
        // KAPSÜLLEME GÖSTERİMİ:
        // System.out.println(laptop.fiyat); // HATA! 'fiyat' private olduğu için erişilemez.
        System.out.println("Laptop'un fiyatını oku (Getter): " + laptop.getFiyat() + " TL");

        // Fiyat güncelleme denemesi (Setter ile)
        alisverisSepeti.fiyatGuncelle(laptop, 23999.0);
        
        // Negatif fiyat denemesi (Setter'daki kontrol mekanizması çalışacak)
        alisverisSepeti.fiyatGuncelle(fare, -100.0); 

        // Güncel durumu yazdır
        System.out.print("-> Laptop'un güncel son durumu: ");
        laptop.urunBilgisiYazdir();
        
        System.out.print("-> Fiyatı güncellenemeyen Mouse'un son durumu: ");
        fare.urunBilgisiYazdir();
    }
}