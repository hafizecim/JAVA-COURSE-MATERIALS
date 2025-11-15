// ----------------------------------------------------
// Dosya Adı: 044_TemelSinifVeNesne.java
// ----------------------------------------------------

/**
 * Ogrenci sınıfı, nesne yönelimli programlamanın temelini oluşturur.
 * Bir öğrenciye ait bilgileri (özellikleri) ve yapabileceği eylemleri (metotları) içerir.
 */
class Ogrenci {
    
    // 1. Özellikler (Fields): Sınıfın verileri
    String ad;
    String soyad;
    int ogrenciNo;
    double ortalama;

    // 2. Yapıcılar (Constructors)
    
    // a) Default (Parametresiz) Yapıcı: Nesne, başlangıç değerleriyle oluşturulur.
    public Ogrenci() {
        this.ad = "Belirtilmedi";
        this.soyad = "Belirtilmedi";
        this.ogrenciNo = 0;
        this.ortalama = 0.0;
        System.out.println("-> Varsayılan (default) yapıcı çağrıldı. (Boş bir öğrenci nesnesi oluştu)");
    }

    // b) Parametreli Yapıcı: Nesne, dışarıdan verilen değerlerle oluşturulur.
    public Ogrenci(String ad, String soyad, int ogrenciNo, double ortalama) {
        // Bu örnekte, parametre adları ile alan (field) adları aynı olduğu için 
        // sınıf özelliğini işaret etmek üzere 'this' anahtar kelimesi kullanılmıştır.
        this.ad = ad;
        this.soyad = soyad;
        this.ogrenciNo = ogrenciNo;
        this.ortalama = ortalama;
        System.out.println("-> Parametreli yapıcı çağrıldı. Yeni öğrenci oluşturuldu: " + ad);
    }

    // 3. Metot: Öğrenci bilgilerini ekrana yazdırma eylemi
    public void bilgileriGoster() {
        System.out.println("================ ÖĞRENCİ BİLGİLERİ ================");
        System.out.println("Adı Soyadı: " + ad + " " + soyad);
        System.out.println("Numara: " + ogrenciNo);
        System.out.println("Ortalama: " + ortalama);
        System.out.println("=================================================");
    }
}

/**
 * Ana Uygulama Sınıfı: Programın çalıştığı (main metodu içeren) yer.
 * Bu sınıfta Ogrenci sınıfının nesneleri oluşturulur ve kullanılır.
 */
public class Uygulama044 {
    public static void main(String[] args) {
        
        System.out.println("--- Nesne Oluşturma Başladı ---\n");
        
        // NESNE 1: Parametreli yapıcıyı kullanarak Ogrenci nesnesi oluşturma
        // (Bu işlem, new anahtar kelimesiyle bir nesne örneği (instance) yaratır.)
        Ogrenci ogrenci1 = new Ogrenci("Ali", "Demir", 2024001, 88.75);
        
        // NESNE 2: Varsayılan (default) yapıcıyı kullanarak Ogrenci nesnesi oluşturma
        Ogrenci ogrenci2 = new Ogrenci();
        
        System.out.println("\n--- Bilgileri Görüntüleme ---\n");
        
        // Ogrenci1 nesnesinin metodunu çağırarak bilgileri gösterme
        System.out.println(">> Ogrenci 1 (Parametreli Yapıcı ile oluşturulan):");
        ogrenci1.bilgileriGoster();

        // Ogrenci2 nesnesinin metodunu çağırarak bilgileri gösterme
        System.out.println(">> Ogrenci 2 (Default Yapıcı ile oluşturulan - Başlangıç değerleri):");
        ogrenci2.bilgileriGoster();

        // Nesnenin özelliklerini dışarıdan direkt olarak değiştirme (Kapsülleme öncesi hali)
        System.out.println("\n>> Ogrenci 2'nin bilgilerini güncelliyoruz...");
        ogrenci2.ad = "Elif";
        ogrenci2.soyad = "Güneş";
        ogrenci2.ogrenciNo = 2024002;
        ogrenci2.ortalama = 95.0;

        // Güncellenmiş bilgileri tekrar gösterme
        System.out.println("\n>> Ogrenci 2 (Güncel):");
        ogrenci2.bilgileriGoster();
    }
}