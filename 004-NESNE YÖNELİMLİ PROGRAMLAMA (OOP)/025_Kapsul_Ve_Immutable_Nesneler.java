// Dosya Adı: 025_Kapsul_Ve_Immutable_Nesneler.java
package com.kapsul.immutable;

/**
 * Değiştirilemez (Immutable) Nesne örneği. 
 * Kapsüllemenin en katı hali: Nesne yaratıldıktan sonra asla değiştirilemez.
 * * 1. Tüm alanlar private ve final olmalıdır.
 * 2. Setter metotları olmamalıdır.
 * 3. Sadece yapıcı metotta değer atanmalıdır.
 */
public final class Adres { // Sınıfın kendisi de final olabilir.

    // 1. Alanlar private ve final
    private final String sehir;
    private final String ilce;
    private final String postaKodu;

    /**
     * 3. Sadece yapıcı metotta (Constructor) değer atanır.
     */
    public Adres(String sehir, String ilce, String postaKodu) {
        this.sehir = sehir;
        this.ilce = ilce;
        this.postaKodu = postaKodu;
        System.out.println("Adres nesnesi oluşturuldu ve DEĞİŞTİRİLEMEZ hale geldi.");
    }

    // --- SADECE GETTER METOTLARI (Okuma) ---

    // 2. Setter metotları YAZILMAZ.
    
    public String getSehir() {
        return sehir;
    }

    public String getIlce() {
        return ilce;
    }

    public String getPostaKodu() {
        return postaKodu;
    }
    
    // Nesneyi bir String olarak temsil etmek için
    @Override
    public String toString() {
        return "Adres [Şehir: " + sehir + ", İlçe: " + ilce + ", Posta Kodu: " + postaKodu + "]";
    }
}

class TestImmutable {
    public static void main(String[] args) {
        System.out.println("--- 020_Kapsul_Ve_Immutable_Nesneler Testi ---");
        
        Adres eskiAdres = new Adres("Ankara", "Çankaya", "06680");
        System.out.println("Eski Adres: " + eskiAdres);
        
        // eskiAdres.sehir = "İstanbul"; // HATA: Private/Final
        // eskiAdres.setSehir("İstanbul"); // HATA: Setter metodu yok.

        System.out.println("Immutable nesneler güvenlidir. Değiştirmek için yeni bir nesne oluşturmalıyız.");
        
        // Değişiklik yapmak istiyorsak, yeni bir nesne oluşturmalıyız:
        Adres yeniAdres = new Adres("İstanbul", "Kadıköy", "34710");
        System.out.println("Yeni Adres: " + yeniAdres);
    }
}