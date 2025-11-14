// 043_SoyutlamaFarki.java
/**
 * ABSTRACT SINIF ve ARAYÜZ KARŞILAŞTIRMASI
 * * Her ikisi de soyutlama sağlasa da, kullanım amaçları farklıdır.
 */
public class O43_SoyutlamaFarki {

    /**
     * ABSTRACT SINIFLAR (When to Use?)
     * -----------------------------
     * 1. Ortak Kod Paylaşımı: Hem abstract hem de somut (concrete) metotlara sahip olabilir.
     * Ortak uygulama detaylarını alt sınıflarla paylaşmak istediğinizde kullanın (örn: O36_Hayvan'daki yemekYe()).
     * 2. Sıkı Bağlantı (Is-A Relationship): Bir nesne diğerinin "bir türüdür" (is-a) ilişkisini 
     * tanımlamak için kullanılır (örn: Kedi, Hayvan'dır).
     * 3. Tek Kalıtım: Sadece tek bir abstract sınıftan miras alınabilir.
     * 4. Alanlar (Fields): Normal alanlara sahip olabilir (final, non-final, static, non-static).
     */
    public abstract class AbstractOrnek {
        int ortakDeger; // Normal alan
        public abstract void zorunluMetot();
        public void ortakMetot() { /* uygulama */ }
    }
    
    /**
     * ARAYÜZLER (INTERFACES) (When to Use?)
     * -----------------------------
     * 1. Yetenek Tanımlama: Bir nesnenin **ne yapabileceğini** (can-do / capability) tanımlar.
     * Sınıflar arasında ortak olmayan davranışlar için idealdir (örn: Uçmak, Yüzmek).
     * 2. Sözleşme Tanımlama: Uygulayan sınıflar için bir dizi zorunlu metot tanımlar.
     * 3. Çoklu Kalıtım: Bir sınıf birden fazla arayüzü uygulayabilir (implements).
     * 4. Alanlar (Fields): Sadece 'public static final' sabit değişkenlere izin verir.
     */
    public interface InterfaceOrnek {
        String SABIT_VERI = "Sabit"; // Otomatik public static final
        void zorunluEylem(); // Otomatik public abstract
        default void istegeBagliEylem() { /* uygulama */ } // Java 8+
    }
    
    public static void main(String[] args) {
        System.out.println("Abstract Sınıf: Hiyerarşi içinde 'is-a' ilişkisi ve kod paylaşımı için.");
        System.out.println("Arayüz: Farklı sınıflar arasında 'can-do' yeteneği ve çoklu kalıtım sağlamak için.");
    }
}