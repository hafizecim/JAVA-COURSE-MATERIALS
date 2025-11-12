// Dosya Adı: Calisan.java
package com.sirket.model; // Örnek paket adı

/**
 * Kapsülleme (Encapsulation) kavramını uygulayan sınıf.
 * Sınıfın içindeki veriler (alanlar) 'private' yapılarak dışarıdan doğrudan erişime kapatılır.
 * Bu verilere erişim ve onları değiştirme, 'public' 'Getter' ve 'Setter' metotları aracılığıyla kontrol edilir.
 */
public class Calisan {

    // 1. Veri Gizleme: Alanları 'private' yaparak dışarıdan doğrudan erişimi engelliyoruz.
    private String ad;
    private int yas;
    private double maas; // Sadece 'Setter' ile belirli kontrollerden sonra değişebilir.

    // Yapıcı (Constructor) metot
    public Calisan(String ad, int yas) {
        this.ad = ad;
        // 'Setter' metodunu kullanarak veriye bir kontrol uygulayabiliriz.
        setYas(yas); 
    }

    // --- GETTER METOTLARI (Veri Okuma) ---

    /**
     * Çalışanın adını döndürür.
     * @return Çalışanın adı.
     */
    public String getAd() {
        return ad;
    }

    /**
     * Çalışanın yaşını döndürür.
     * @return Çalışanın yaşı.
     */
    public int getYas() {
        return yas;
    }

    // Maaş bilgisini dışarıya sızdırmak istemiyorsak Getter metodunu hiç yazmayabiliriz!
    // Veya sadece yetkili kullanıcıların görmesini sağlayacak bir kontrol ekleyebiliriz.
    public double getMaas() {
        // Burada bir yetki kontrolü (örneğin: if (kullanici.isAdmin())) yapılabilir.
        return maas;
    }

    // --- SETTER METOTLARI (Veri Güncelleme) ---

    /**
     * Çalışanın adını ayarlar/günceller.
     * Setter metotları, veri üzerinde geçerlilik kontrolü yapmamızı sağlar.
     * @param ad Yeni ad.
     */
    public void setAd(String ad) {
        if (ad == null || ad.trim().isEmpty()) {
            System.out.println("Hata: Çalışan adı boş olamaz!");
            // set etme işlemini durdurabiliriz.
            return; 
        }
        this.ad = ad;
    }

    /**
     * Çalışanın yaşını ayarlar/günceller.
     * Yaş için mantıksal bir kısıtlama koyabiliriz.
     * @param yas Yeni yaş.
     */
    public void setYas(int yas) {
        if (yas < 18 || yas > 65) {
            System.out.println("Uyarı: Yaş 18-65 aralığında olmalıdır. Geçersiz yaş: " + yas);
            // Geçersiz bir değer geldiğinde eski değeri koruyabiliriz.
        } else {
            this.yas = yas;
        }
    }
    
    /**
     * Çalışanın maaşını ayarlar/günceller.
     * Negatif maaş girişi gibi hatalı durumları engeller.
     * @param maas Yeni maaş.
     */
    public void setMaas(double maas) {
        if (maas <= 0) {
            System.out.println("Hata: Maaş pozitif bir değer olmalıdır!");
            return;
        }
        this.maas = maas;
    }

    // toString metodu, nesneyi string olarak temsil etmek için kullanılır.
    @Override
    public String toString() {
        return "Çalışan [Ad=" + ad + ", Yaş=" + yas + ", Maaş=" + maas + "]";
    }
}