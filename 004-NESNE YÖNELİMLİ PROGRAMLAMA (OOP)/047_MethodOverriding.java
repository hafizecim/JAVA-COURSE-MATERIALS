// ----------------------------------------------------
// Dosya Adı: 047_MethodOverriding.java
// ----------------------------------------------------

/**
 * Personel Sınıfı: Üst sınıf (Superclass)
 * Ortak bir eylem tanımlar (calis()).
 */
class Personel {
    
    String ad;
    String soyad;
    
    public Personel(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }
    
    // Üst sınıfta tanımlanan genel metot
    public void calis() {
        System.out.println(ad + " " + soyad + " genel iş görevlerini yerine getiriyor.");
    }

    // Üst sınıfta tanımlanan başka bir metot
    public void bilgileriGoster() {
        System.out.println("-------------------------------------");
        System.out.println("Pozisyon: Genel Personel");
        System.out.println("Ad Soyad: " + ad + " " + soyad);
    }
}

/**
 * Yazilimci Sınıfı: Alt sınıf (Subclass)
 * calis() metodunu kendisine özel olarak geçersiz kılar.
 */
class Yazilimci extends Personel {
    
    String uzmanlikAlani;
    
    public Yazilimci(String ad, String soyad, String uzmanlikAlani) {
        // Üst sınıfın yapıcısını çağırıyoruz
        super(ad, soyad); 
        this.uzmanlikAlani = uzmanlikAlani;
    }
    
    // Metot Geçersiz Kılma (Method Overriding): 
    // Üst sınıftaki metot imzası (isim ve parametreler) aynı olmalıdır.
    @Override 
    public void calis() {
        // Alt sınıf, kendi çalışma şeklini tanımlıyor.
        System.out.println(ad + " " + soyad + " yazılım geliştirme ve kodlama yapıyor. (" + uzmanlikAlani + " uzmanlığı)");
    }

    @Override
    public void bilgileriGoster() {
        // super.metotAdı() ile üst sınıfın aynı isimdeki metodunu çağırabiliriz.
        super.bilgileriGoster(); 
        System.out.println("Pozisyon: Yazılımcı");
        System.out.println("Uzmanlık Alanı: " + uzmanlikAlani);
        System.out.println("-------------------------------------");
    }
}

/**
 * Yonetici Sınıfı: Alt sınıf (Subclass)
 * calis() metodunu kendisine özel olarak geçersiz kılar.
 */
class Yonetici extends Personel {
    
    public Yonetici(String ad, String soyad) {
        super(ad, soyad);
    }
    
    @Override 
    public void calis() {
        // Yöneticinin çalışma şekli, Yazılımcıdan farklıdır.
        System.out.println(ad + " " + soyad + " toplantıları yönetiyor ve stratejik kararlar alıyor.");
    }
    
    // bilgileriGoster() metodunu bu sınıfta geçersiz kılmıyoruz, 
    // dolayısıyla üst sınıftaki (Personel'deki) metot çalışacaktır.
}

/**
 * Ana Uygulama Sınıfı
 */
public class Uygulama047 {
    public static void main(String[] args) {
        
        // 1. Yazılımcı nesnesi
        Yazilimci y1 = new Yazilimci("Bora", "Ergül", "Backend");
        
        // 2. Yönetici nesnesi
        Yonetici yonetici1 = new Yonetici("Seda", "Mutlu");

        // 3. Genel Personel nesnesi
        Personel p1 = new Personel("Kemal", "Öztürk");
        
        System.out.println("--- Çalışma Metotları Çağrılıyor (Overriding) ---\n");
        
        // y1.calis(): Yazilimci sınıfındaki geçersiz kılınmış metot çalışır.
        y1.calis(); 
        
        // yonetici1.calis(): Yonetici sınıfındaki geçersiz kılınmış metot çalışır.
        yonetici1.calis();
        
        // p1.calis(): Personel sınıfındaki orijinal metot çalışır.
        p1.calis(); 

        System.out.println("\n--- Bilgiler Görüntüleniyor ---\n");
        
        // y1.bilgileriGoster(): Üst metodu çağırıp üzerine ekleme yapar.
        y1.bilgileriGoster(); 

        // yonetici1.bilgileriGoster(): Yönetici sınıfında override edilmediği için Personel sınıfındaki metot çalışır.
        yonetici1.bilgileriGoster();
        
        // p1.bilgileriGoster(): Orijinal metot çalışır.
        p1.bilgileriGoster();
    }
}