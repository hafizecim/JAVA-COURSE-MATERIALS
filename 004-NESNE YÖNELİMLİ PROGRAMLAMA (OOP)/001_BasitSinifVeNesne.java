// 001_BasitSinifVeNesne.java

// Bir 'Araba' sınıfı tanımlıyoruz. Sınıflar, nesnelerin şablonudur (planıdır).
class Araba {
    // Sınıfın herhangi bir özelliği (field) veya metodu (method) yok.
    // Sadece varlığını gösteriyoruz.
}

public class BasitSinifVeNesne {
    public static void main(String[] args) {
        // 1. Sınıf Adı (Araba) kullanılır.
        // 2. Nesneye bir isim verilir (benimAraba).
        // 3. 'new' anahtar kelimesi ile nesne oluşturulur ve bellekte yer ayrılır.
        // 4. 'Araba()' yapıcı metodu (constructor) çağrılır.
        Araba benimAraba = new Araba();

        // Nesnenin başarıyla oluşturulduğunu belirten bir mesaj yazdıralım.
        System.out.println("Araba sınıfından bir nesne başarıyla oluşturuldu.");
        // Oluşturulan nesnenin bellekteki adresini de (hashCode) yazdırabiliriz.
        System.out.println("Nesne referansı: " + benimAraba);
    }
}