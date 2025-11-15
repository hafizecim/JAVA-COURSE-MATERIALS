// ----------------------------------------------------
// Dosya Adı: 051_IcSiniflar.java
// ----------------------------------------------------

/**
 * Bilgisayar Sınıfı: Dış Sınıf (Outer Class)
 */
class Bilgisayar {
    
    // Dış sınıfa ait özellik
    private String marka; 

    public Bilgisayar(String marka) {
        this.marka = marka;
    }
    
    // Dış sınıfın bir metodu
    public void bilgisayariBaslat() {
        System.out.println(marka + " bilgisayar başlatılıyor...");
        // Dış sınıf, iç sınıfları kullanabilir
        Islemci islemci = new Islemci();
        EkranKarti.modeliGoster();
        islemci.islemciyiCalistir();
    }
    
    // 1. Non-Static (Member) İç Sınıf: Islemci
    // Bu sınıf, dış sınıfa (Bilgisayar) ait bir nesne olmadan var olamaz.
    // Dış sınıfın PRIVATE özelliklerine doğrudan erişebilir.
    class Islemci {
        
        public void islemciyiCalistir() {
            // Dış sınıfın private özelliğine erişim
            System.out.println("-> İşlemci: " + marka + " markasının performansını analiz ediyor.");
        }
    }
    
    // 2. Static İç Sınıf: EkranKarti
    // Bu sınıf, dış sınıftan bağımsızdır. Dış sınıfın statik olmayan (marka gibi)
    // özelliklerine doğrudan erişemez. Kendi başına nesne oluşturulabilir.
    static class EkranKarti {
        
        static String model = "RTX 4090"; // Statik iç sınıfın kendi statik özelliği
        
        public static void modeliGoster() {
            System.out.println("-> Ekran Kartı Modeli (Static): " + model);
        }
        
        public void gucTuketimi() {
             System.out.println("-> Ekran Kartı: Yüksek güç tüketimi modunda.");
             // System.out.println(marka); // <- HATA! Statik iç sınıf, dış sınıfın statik olmayan alanlarına erişemez.
        }
    }
}

/**
 * Ana Uygulama Sınıfı
 */
public class Uygulama051 {
    public static void main(String[] args) {
        
        System.out.println("--- 1. Static İç Sınıf Kullanımı (EkranKarti) ---");
        
        // Static İç Sınıf (EkranKarti) için, dış sınıf nesnesine ihtiyaç yoktur.
        Bilgisayar.EkranKarti.modeliGoster(); 
        
        // Static İç Sınıf nesnesi oluşturma
        Bilgisayar.EkranKarti ekranKarti = new Bilgisayar.EkranKarti();
        ekranKarti.gucTuketimi();
        
        System.out.println("\n--- 2. Non-Static İç Sınıf Kullanımı (Islemci) ---");
        
        // Non-Static İç Sınıf (Islemci) için, önce dış sınıf (Bilgisayar) nesnesi oluşturulmalıdır.
        Bilgisayar hpBilgisayar = new Bilgisayar("HP");
        hpBilgisayar.bilgisayariBaslat();

        System.out.println("\n--- Non-Static İç Sınıfı Dışarıdan Oluşturma Yöntemi ---");
        
        // Non-Static İç Sınıf nesnesi oluşturma sintaksı:
        // DışSınıf.İçSınıf içNesne = DışNesne.new İçSınıf();
        Bilgisayar.Islemci hpIslemci = hpBilgisayar.new Islemci();
        hpIslemci.islemciyiCalistir();
        
        // Bilgisayar.Islemci lenovoIslemci = new Bilgisayar.Islemci(); // <- HATA verir. Dış nesne olmadan oluşturulamaz.
    }
}