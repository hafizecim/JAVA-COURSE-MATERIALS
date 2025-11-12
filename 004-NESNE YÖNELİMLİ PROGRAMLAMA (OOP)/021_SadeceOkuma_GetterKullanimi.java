// Dosya Adı: 021_SadeceOkuma_GetterKullanimi.java
package com.kapsul.kontrol;

/**
 * Sadece Okunabilir (Read-Only) Nesne örneği.
 * Veri alanları 'private' ve 'final' olarak tanımlanır. Sadece yapıcı metotta ayarlanır.
 * Sadece GETTER metotları sunularak dışarıdan değiştirilemezlik sağlanır.
 */
public class UygulamaAyarlari {

    // 1. private ve final: Değiştirilemez alanlar.
    private final String veritabaniAdresi;
    private final int port;
    private final boolean debugModu;

    /**
     * Yapıcı metot (Constructor): Değerler sadece nesne yaratılırken atanır.
     */
    public UygulamaAyarlari(String veritabaniAdresi, int port, boolean debugModu) {
        // Burada kontrol yapma imkanımız yine vardır.
        if (port < 1024) {
            throw new IllegalArgumentException("Port numarası 1024'ten küçük olamaz.");
        }
        this.veritabaniAdresi = veritabaniAdresi;
        this.port = port;
        this.debugModu = debugModu;
    }

    // --- SADECE GETTER METOTLARI (Okuma) ---

    // SETTER metotları BİLİNÇLİ OLARAK yazılmamıştır.
    // Bu, dışarıdan bu nesnenin alanlarının değiştirilmesini engeller.
    
    public String getVeritabaniAdresi() {
        return veritabaniAdresi;
    }

    public int getPort() {
        return port;
    }

    public boolean isDebugModu() { // boolean alanlar için 'is' kullanılır.
        return debugModu;
    }
}

class TestAyarlar {
    public static void main(String[] args) {
        System.out.println("--- 020_SadeceOkuma_GetterKullanimi Testi ---");

        UygulamaAyarlari ayar = new UygulamaAyarlari("localhost", 5432, true);
        
        System.out.println("Veritabanı Portu: " + ayar.getPort());

        // ayar.port = 8080; // HATA! Alan 'private' olduğu için erişilemez.
        // ayar.setPort(8080); // HATA! 'setPort' metodu yok, nesne değiştirilemez.
        
        System.out.println("Ayarlar oluşturulduktan sonra değiştirilemez.");
    }
}