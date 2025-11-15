// ----------------------------------------------------
// Dosya Adı: 045_KapsullemeVeThis.java
// ----------------------------------------------------

/**
 * BankaHesabi sınıfı, kapsülleme prensibini uygulayarak
 * hesap verilerini dış dünyadan korur ve kontrollü erişim sağlar.
 */
class BankaHesabi {
    
    // 1. Özellikler (Fields): PRIVATE yaparak kapsüllemeyi sağlıyoruz.
    // Bu verilere sadece bu sınıf içindeki metotlar erişebilir.
    private String hesapNo;
    private double bakiye;

    /**
     * Parametreli Yapıcı (Constructor).
     * Parametre olarak gelen değişkenleri sınıfın özelliklerine atarken 
     * isim karışıklığını önlemek için 'this' kullanılır.
     */
    public BankaHesabi(String hesapNo, double bakiye) {
        // Parametre (hesapNo) ile sınıf özelliği (this.hesapNo) ayırt ediliyor.
        this.hesapNo = hesapNo;
        // Bakiye ataması yaparken bile, kontrol mekanizması olan Setter metodunu kullanmak iyi bir pratik.
        setBakiye(bakiye); 
        System.out.println("Hesap No " + this.hesapNo + " ile yeni hesap oluşturuldu.");
    }
    
    // 2. Getter Metotları (Veriyi Okuma)
    
    // bakiye'yi dışarıya okumak için public bir erişim noktası.
    public double getBakiye() {
        return this.bakiye;
    }

    // hesapNo'yu dışarıya okumak için public bir erişim noktası.
    public String getHesapNo() {
        return this.hesapNo;
    }

    // 3. Setter Metodu (Veriyi Kontrollü Değiştirme)
    
    // bakiye'yi dışarıdan değiştirmek için public bir erişim noktası.
    // Setter içinde kontrol mekanizması kurarak veri bütünlüğünü sağlıyoruz.
    public void setBakiye(double miktar) {
        if (miktar >= 0) {
            this.bakiye = miktar;
            System.out.println("Bilgilendirme: Yeni bakiye ataması başarılı.");
        } else {
            // Hatalı veya geçersiz bir işlem denemesi engellendi.
            System.err.println("HATA: Bakiye değeri negatif olamaz! İşlem iptal edildi.");
        }
    }
    
    // Ek Metot: Hesaba para yatırma işlemi
    public void paraYatir(double miktar) {
        if (miktar > 0) {
            this.bakiye += miktar;
            System.out.println(miktar + " TL yatırıldı. Yeni Bakiye: " + getBakiye());
        } else {
            System.err.println("HATA: Yatırılan miktar pozitif olmalıdır.");
        }
    }
}

/**
 * Ana Uygulama Sınıfı.
 * Kapsülleme sayesinde, bakiye bilgisine sadece Getter/Setter ile erişebildiğimizi gösterir.
 */
public class Uygulama045 {
    public static void main(String[] args) {
        
        // 1. Nesne oluşturma
        BankaHesabi hesapA = new BankaHesabi("TR001", 1000.0);
        
        System.out.println("\n--- Kontrollü Erişim Denemeleri ---");
        
        // 2. Veriye Erişim (Getter ile Okuma): Başarılı
        // Private bakiye bilgisine getBakiye() metodu ile erişiyoruz.
        System.out.println("Hesap A'nın Şu Anki Bakiyesi: " + hesapA.getBakiye() + " TL"); 
        
        // 3. Veriyi Değiştirme (Setter ile Kontrol): Başarılı
        System.out.println("\n200 TL Yatırma İşlemi:");
        hesapA.paraYatir(200.0);
        
        System.out.println("Yeni Bakiye: " + hesapA.getBakiye() + " TL");
        
        // 4. Hatalı Erişim Denemesi (Kapsüllemenin Önemi): Engellendi
        System.out.println("\nDoğrudan Negatif Bakiye Atama Denemesi:");
        // Bu kod satırı derleme hatası verir, çünkü 'bakiye' private'tır.
        // hesapA.bakiye = -500; // <- Bu satır HATA verir (Erişim kısıtlaması nedeniyle)
        
        // Setter Metodu ile Kontrollü Hata Denemesi: Engellendi
        System.out.println("\nSetter Metodu ile Negatif Değer Atama Denemesi:");
        hesapA.setBakiye(-500.0); 
        
        System.out.println("İşlem Sonrası Bakiye (Değişmedi): " + hesapA.getBakiye() + " TL");
    }
}