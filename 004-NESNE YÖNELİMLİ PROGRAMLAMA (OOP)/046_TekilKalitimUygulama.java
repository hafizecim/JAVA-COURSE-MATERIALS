// ----------------------------------------------------
// Dosya Adı: 046_TekilKalitimUygulama.java
// ----------------------------------------------------

/**
 * Personel Sınıfı: Üst sınıf (Superclass)
 * Tüm personel türlerinin ortak özelliklerini barındırır.
 */
class Personel {
    
    // Ortak Özellikler
    String ad;
    String soyad;
    double maas;
    
    // Yapıcı: Alt sınıfların bu yapıcıyı super() ile çağırması gerekecektir.
    public Personel(String ad, String soyad, double maas) {
        this.ad = ad;
        this.soyad = soyad;
        this.maas = maas;
        System.out.println("-> Personel yapıcı çalıştı. (" + ad + " oluşturuluyor)");
    }
    
    // Ortak Metot
    public void bilgileriYazdir() {
        System.out.println("-------------------------------------");
        System.out.println("Ad Soyad: " + ad + " " + soyad);
        System.out.println("Maaş: " + maas + " TL");
    }
}

/**
 * Yazilimci Sınıfı: Alt sınıf (Subclass)
 * Personel sınıfından kalıtım alır ve kendisine ait ekstra bir özelliğe sahiptir.
 */
class Yazilimci extends Personel {
    
    // Yazılımcıya özel özellik
    String programlamaDili;
    
    // Yapıcı: super() kullanarak üst sınıfın yapıcı metodunu çağırıyoruz.
    public Yazilimci(String ad, String soyad, double maas, String programlamaDili) {
        // Bu, Personel sınıfının parametreli yapıcısını çağırır.
        super(ad, soyad, maas); 
        this.programlamaDili = programlamaDili;
        System.out.println("-> Yazılımcı yapıcı tamamlandı.");
    }
    
    // Yazılımcıya özel metot
    @Override // Bu metot 047'de detaylı işlenecek, burada da kullanabiliriz.
    public void bilgileriYazdir() {
        super.bilgileriYazdir(); // Üst sınıfın temel bilgilerini yazdıran metodu çağır
        System.out.println("Uzmanlık Alanı: Yazılımcı");
        System.out.println("Programlama Dili: " + programlamaDili);
        System.out.println("-------------------------------------");
    }
}

/**
 * Yonetici Sınıfı: Alt sınıf (Subclass)
 * Personel sınıfından kalıtım alır ve kendisine ait ekstra bir özelliğe sahiptir.
 */
class Yonetici extends Personel {
    
    // Yöneticiye özel özellik
    String departman;
    
    // Yapıcı: super() kullanarak üst sınıfın yapıcı metodunu çağırıyoruz.
    public Yonetici(String ad, String soyad, double maas, String departman) {
        // Personel sınıfının yapıcı metodu çağrılıyor.
        super(ad, soyad, maas);
        this.departman = departman;
        System.out.println("-> Yönetici yapıcı tamamlandı.");
    }
    
    @Override
    public void bilgileriYazdir() {
        super.bilgileriYazdir();
        System.out.println("Uzmanlık Alanı: Yönetici");
        System.out.println("Yönettiği Departman: " + departman);
        System.out.println("-------------------------------------");
    }
}

/**
 * Ana Uygulama Sınıfı
 */
public class Uygulama046 {
    public static void main(String[] args) {
        
        System.out.println("--- Yazılımcı Nesnesi Oluşturuluyor ---");
        // Yazılımcı nesnesi oluşturulurken hem Yazılımcı hem de Personel yapıcıları çalışır.
        Yazilimci y1 = new Yazilimci("Mehmet", "Kaya", 35000.0, "Java");
        
        System.out.println("\n--- Yönetici Nesnesi Oluşturuluyor ---");
        // Yönetici nesnesi oluşturulurken hem Yönetici hem de Personel yapıcıları çalışır.
        Yonetici yonetici1 = new Yonetici("Zeynep", "Aydın", 50000.0, "İnsan Kaynakları");
        
        System.out.println("\n--- Bilgileri Görüntüleme ---");
        
        y1.bilgileriYazdir();
        yonetici1.bilgileriYazdir();
        
        // Mehmet Kaya'nın maas özelliğine, Personel sınıfından miras aldığı için erişebiliyoruz.
        System.out.println("\nMehmet'in maaşına doğrudan erişim (miras): " + y1.maas + " TL");
        // Zeynep Aydın'ın sadece Yönetici sınıfına ait özelliğine erişim:
        System.out.println("Zeynep'in departmanı: " + yonetici1.departman);
    }
}