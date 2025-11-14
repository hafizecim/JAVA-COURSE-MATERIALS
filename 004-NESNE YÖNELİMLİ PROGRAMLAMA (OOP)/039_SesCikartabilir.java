// 039_SesCikartabilir.java
/**
 * ARAYÜZ (INTERFACE) ÖRNEĞİ
 * * 'interface' anahtar kelimesi ile tanımlanır.
 * 1. Arayüzler, sınıflar arasında bir "sözleşme" (contract) tanımlar.
 * 2. Bir sınıf birden fazla arayüzü uygulayabilir (**Çoklu Kalıtım**).
 * 3. Java 8 öncesinde, metotların hepsi otomatik olarak 'public abstract' idi 
 * ve gövdesi olamazdı.
 * 4. Java 8'den itibaren 'default' ve 'static' metotlar eklenebilmiştir.
 */
public interface O39_SesCikartabilir {

    // Bir arayüzdeki metot, Java 8 öncesinde otomatik olarak 'public abstract'tır.
    // Uygulayan sınıflar (implementing classes) bu metodu uygulamak zorundadır.
    void sesCikart();
    
    // Arayüzlerde tanımlanan değişkenler otomatik olarak 'public static final'dır (sabit).
    String TUR_ACIKLAMASI = "Bu arayüz, ses çıkarma yeteneğini tanımlar.";
}