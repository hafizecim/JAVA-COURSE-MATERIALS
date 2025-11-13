// Dosya Adı: 026_Kapsul_Sinif_Factory.java
package com.kapsul.factory;

/**
 * Kapsüllü Sınıf: Nesnenin nasıl oluşturulacağını dışarıdan gizler.
 * Yapıcı metodu 'private' yaparak, nesne oluşturmayı sadece Fabrika (Factory) metodu üzerinden mümkün kılar.
 */
class VeritabaniBaglantisi {
    
    // Private ve final alanlar
    private final String url;
    
    // Yapıcı metot private: Dışarıdan 'new VeritabaniBaglantisi()' yapılamaz.
    private VeritabaniBaglantisi(String url) {
        this.url = url;
    }
    
    // Public statik Factory metot: Nesne oluşturma sürecini kontrol eder.
    public static VeritabaniBaglantisi baglantiOlustur(String tip) {
        System.out.println("Fabrika: " + tip + " tipinde bağlantı nesnesi yaratılıyor...");
        
        if ("MySQL".equalsIgnoreCase(tip)) {
            return new VeritabaniBaglantisi("jdbc:mysql://localhost:3306/db");
        } else if ("PostgreSQL".equalsIgnoreCase(tip)) {
            return new VeritabaniBaglantisi("jdbc:postgresql://localhost:5432/db");
        } else {
            throw new IllegalArgumentException("Hata: Desteklenmeyen veritabanı tipi.");
        }
    }

    public String getUrl() {
        return url;
    }
}

/**
 * Fabrika metodu kullanımı.
 */
public class TestFactory {
    public static void main(String[] args) {
        System.out.println("--- 026_Kapsul_Sinif_Factory Testi ---");
        
        // Nesne oluşturma, Fabrika metodu üzerinden kontrol edilir.
        VeritabaniBaglantisi mysqlBaglanti = VeritabaniBaglantisi.baglantiOlustur("MySQL");
        System.out.println("Bağlantı URL: " + mysqlBaglanti.getUrl());
        
        // VeritabaniBaglantisi baglanti = new VeritabaniBaglantisi("..."); 
        // HATA! Yapıcı 'private' olduğu için bu satır çalışmaz.
    }
}