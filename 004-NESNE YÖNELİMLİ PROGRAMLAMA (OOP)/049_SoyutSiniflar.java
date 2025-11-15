// ----------------------------------------------------
// Dosya Adı: 049_SoyutSiniflar.java
// ----------------------------------------------------

/**
 * Sekil Sınıfı: Soyut Sınıf (Abstract Class)
 * Sekil sınıfından doğrudan nesne üretilemez.
 * Bu sınıf, tüm alt sınıflar için ortak bir yapı ve zorunlu metotlar tanımlar.
 */
abstract class Sekil {
    
    // Tüm şekillerin bir ismi (türü) olsun.
    String isim;
    
    // Yapıcı metot (Soyut sınıfların da yapıcısı olabilir).
    public Sekil(String isim) {
        this.isim = isim;
        System.out.println("-> " + isim + " nesnesi için Sekil yapıcı çağrıldı.");
    }

    // Soyut Metotlar (Abstract Methods): Gövdesi yoktur.
    // Alt sınıflar bu metotları zorunlu olarak uygulamalıdır (implement etmelidir).
    public abstract double alanHesapla();
    public abstract double cevreHesapla();
    
    // Soyut olmayan (somut) metotlar da bulunabilir.
    public void bilgileriYazdir() {
        System.out.println("Şekil Tipi: " + isim);
        System.out.println("Alan: " + alanHesapla());
        System.out.println("Çevre: " + cevreHesapla());
        System.out.println("-------------------------------------");
    }
}

/**
 * Daire Sınıfı: Somut Alt Sınıf
 * Sekil sınıfını miras alır ve tüm soyut metotları uygulamak zorundadır.
 */
class Daire extends Sekil {
    
    double yaricap;
    
    public Daire(double yaricap) {
        super("Daire"); // Üst sınıfın yapıcısını çağırır
        this.yaricap = yaricap;
    }

    // Soyut metotların zorunlu uygulaması (implementasyonu)
    @Override
    public double alanHesapla() {
        // Alan = pi * r * r
        return Math.PI * yaricap * yaricap;
    }

    @Override
    public double cevreHesapla() {
        // Çevre = 2 * pi * r
        return 2 * Math.PI * yaricap;
    }
}

/**
 * Dikdortgen Sınıfı: Somut Alt Sınıf
 * Sekil sınıfını miras alır ve tüm soyut metotları uygulamak zorundadır.
 */
class Dikdortgen extends Sekil {
    
    double en;
    double boy;
    
    public Dikdortgen(double en, double boy) {
        super("Dikdörtgen"); // Üst sınıfın yapıcısını çağırır
        this.en = en;
        this.boy = boy;
    }

    // Soyut metotların zorunlu uygulaması (implementasyonu)
    @Override
    public double alanHesapla() {
        // Alan = en * boy
        return en * boy;
    }

    @Override
    public double cevreHesapla() {
        // Çevre = 2 * (en + boy)
        return 2 * (en + boy);
    }
}

/**
 * Ana Uygulama Sınıfı
 */
public class Uygulama049 {
    public static void main(String[] args) {
        
        // HATA DENEMESİ: Soyut sınıflardan nesne oluşturulamaz!
        // Sekil s1 = new Sekil("Genel Şekil"); // <- Bu satır derleme hatası verir.
        System.out.println("Soyut sınıftan (Sekil) doğrudan nesne oluşturulamadı.");
        
        System.out.println("\n--- Somut Nesneler Oluşturuluyor ---");
        
        // 1. Daire nesnesi oluşturma
        Daire daire1 = new Daire(5.0);
        
        // 2. Dikdörtgen nesnesi oluşturma
        Dikdortgen d1 = new Dikdortgen(4.0, 6.0);
        
        System.out.println("\n--- Polymorphism ve Ortak Metot Çağrımı ---");
        
        // Polymorphism (Çok Biçimlilik) sayesinde, 
        // Sekil tipinde referanslar ile alt sınıf nesnelerini tutabiliriz.
        Sekil[] sekiller = {daire1, d1};
        
        for (Sekil s : sekiller) {
            // Hangi nesneyi işaret ederse etsin, metotlar doğru şekilde çalışır.
            s.bilgileriYazdir();
        }
    }
}