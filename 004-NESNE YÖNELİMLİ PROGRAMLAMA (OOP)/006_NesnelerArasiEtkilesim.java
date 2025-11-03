// 006_NesnelerArasiEtkilesim.java

class Urun {
    String ad;
    double fiyat;

    void urunBilgisiYazdir() {
        System.out.println(ad + " (Fiyat: " + fiyat + " TL)");
    }
}

class Sepet {
    // Metot, parametre olarak bir 'Urun' nesnesi alıyor.
    void urunEkle(Urun eklenecekUrun) {
        System.out.print("-> Sepete eklendi: ");
        // Parametre olarak gelen nesnenin metodunu çağırıyoruz.
        eklenecekUrun.urunBilgisiYazdir();
    }
    
    // Metot, bir urunun fiyatını güncelleyebilir.
    void fiyatGuncelle(Urun urun, double yeniFiyat) {
        System.out.println("\n--- Fiyat Güncelleme ---");
        System.out.println("Eski Fiyat: " + urun.fiyat + " TL");
        // Parametre olarak gelen nesnenin özelliğini değiştiriyoruz.
        urun.fiyat = yeniFiyat;
        System.out.println("Yeni Fiyat: " + urun.fiyat + " TL");
    }
}

public class NesnelerArasiEtkilesim {
    public static void main(String[] args) {
        Urun laptop = new Urun();
        laptop.ad = "Dizüstü Bilgisayar";
        laptop.fiyat = 25000.0;

        Urun fare = new Urun();
        fare.ad = "Kablosuz Mouse";
        fare.fiyat = 450.0;

        Sepet alisverisSepeti = new Sepet();

        // Sepet metotlarını çağırırken, Urun nesnelerini argüman olarak gönderiyoruz.
        alisverisSepeti.urunEkle(laptop);
        alisverisSepeti.urunEkle(fare);

        // Fiyat güncelleme
        alisverisSepeti.fiyatGuncelle(laptop, 23999.0);
        
        // Güncellenmiş bilgiyi tekrar yazdır
        System.out.print("-> Güncel Durum: ");
        laptop.urunBilgisiYazdir();
    }
}