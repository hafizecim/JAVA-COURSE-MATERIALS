// ----------------------------------------------------
// Dosya Adı: 048_PolymorphismUygulama.java
// ----------------------------------------------------
import java.util.ArrayList;

/**
 * Hayvan Sınıfı: Üst Sınıf (Superclass)
 * Genel bir davranış (sesCikar) tanımlar.
 */
class Hayvan {
    String tur;
    
    public Hayvan(String tur) {
        this.tur = tur;
    }
    
    // Geçersiz kılınacak (override edilecek) genel metot
    public void sesCikar() {
        System.out.println("-> " + tur + " genel bir ses çıkarıyor.");
    }
}

/**
 * Kopek Sınıfı: Alt Sınıf (Subclass)
 */
class Kopek extends Hayvan {
    
    public Kopek() {
        super("Köpek"); // Üst sınıf yapıcısını çağır
    }
    
    // Metodu kendisine özel olarak geçersiz kılar.
    @Override
    public void sesCikar() {
        System.out.println("Köpek: Hav hav!");
    }
}

/**
 * Kedi Sınıfı: Alt Sınıf (Subclass)
 */
class Kedi extends Hayvan {
    
    public Kedi() {
        super("Kedi"); // Üst sınıf yapıcısını çağır
    }
    
    // Metodu kendisine özel olarak geçersiz kılar.
    @Override
    public void sesCikar() {
        System.out.println("Kedi: Miyav miyav...");
    }
}

/**
 * Ana Uygulama Sınıfı
 * Çok biçimliliği ve Dinamik Bağlamayı gösterir.
 */
public class Uygulama048 {
    public static void main(String[] args) {
        
        // --- 1. Dinamik Bağlama Gösterimi ---
        
        // Üst sınıf (Hayvan) referansı ile alt sınıf (Kopek) nesnesi oluşturuluyor.
        Hayvan h1 = new Kopek();
        // Üst sınıf (Hayvan) referansı ile alt sınıf (Kedi) nesnesi oluşturuluyor.
        Hayvan h2 = new Kedi();
        
        System.out.println("--- Dinamik Bağlama (Polymorphism) ---");
        
        // Her iki referans da Hayvan türünde olmasına rağmen,
        // çağrılan sesCikar() metodu nesnenin GERÇEK türüne (Kopek veya Kedi) göre belirlenir.
        h1.sesCikar(); // Köpeğin sesi çıkar
        h2.sesCikar(); // Kedinin sesi çıkar

        System.out.println("\n--- Çok Biçimli Dizi (Array/List) Kullanımı ---");
        
        // --- 2. Çok Biçimli Koleksiyon Kullanımı ---
        
        // Hayvan türünden bir liste oluşturuyoruz. 
        // Bu liste, Hayvan sınıfından türeyen tüm nesneleri (Kopek, Kedi) tutabilir.
        ArrayList<Hayvan> hayvanlar = new ArrayList<>();
        hayvanlar.add(new Kopek());
        hayvanlar.add(new Kedi());
        hayvanlar.add(new Hayvan("Kuş")); // Orijinal Hayvan sınıfı nesnesi
        
        // Listedeki her öğeyi döngü ile geziyoruz.
        for (Hayvan h : hayvanlar) {
            System.out.print(h.tur + " sesi: ");
            // Döngü içinde, h referansı sırasıyla Kopek, Kedi ve Hayvan nesnelerine işaret eder.
            // Çalıştırılacak metot (sesCikar) çalışma anında (runtime) belirlenir (Dinamik Bağlama).
            h.sesCikar();
        }
    }
}