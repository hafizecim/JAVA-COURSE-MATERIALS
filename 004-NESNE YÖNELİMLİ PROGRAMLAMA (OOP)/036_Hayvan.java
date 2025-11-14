// 036_Hayvan.java
/**
 * ABSTRACT SINIF ÖRNEĞİ
 * * 'abstract' anahtar kelimesi ile tanımlanan bir sınıftır.
 * 1. Bu sınıflardan doğrudan nesne (instance) **oluşturulamaz**.
 * 2. Hem normal (somut) metotları hem de 'abstract' metotları içerebilir.
 * 3. Abstract metot: Gövdesi (body) olmayan metottur. Alt sınıflar (subclasses)
 * tarafından **zorunlu olarak** uygulanmalıdır (override).
 * 4. Tek kalıtım (inheritance) sağlar (bir sınıf sadece bir abstract sınıftan miras alabilir).
 */
public abstract class O36_Hayvan {
    
    private String isim;

    // Somut (Concrete) Metot: Gövdesi vardır.
    public O36_Hayvan(String isim) {
        this.isim = isim;
        System.out.println("Hayvan sınıfı oluşturuldu: " + this.isim);
    }
    
    // Abstract Metot: Gövdesi yoktur. Türeyen sınıflar tarafından uygulanmalıdır.
    // Bu, tüm hayvanların ses çıkarttığı, ancak nasıl çıkarttığının farklı olduğu 
    // gerçeğinin soyutlanmasıdır.
    public abstract void sesCikar();
    
    // Somut Metot: Miras alınır ve tüm alt sınıflarda aynı şekilde çalışır.
    public void yemekYe() {
        System.out.println(isim + " yemek yiyor.");
    }
}