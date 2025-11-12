// Dosya Adı: 020_DataKontrolu_SetterKullanimi.java
package com.kapsul.kontroller; // Paket ismi rastgele seçilmiştir.

/**
 * Kapsüllemenin temel faydası olan VERİ BÜTÜNLÜĞÜNÜ vurgular.
 * Setter metotları sayesinde alana atanacak değer üzerinde kontrol mekanizması kurulur.
 */
public class Ogrenci {

    // Alanlar private tanımlanarak doğrudan dış erişime kapatılır.
    private String ogrenciNo;
    private int not; // Notun 0 ile 100 arasında olması beklenir.

    // Yapıcı (Constructor) metot
    public Ogrenci(String ogrenciNo, int not) {
        this.ogrenciNo = ogrenciNo;
        // Yapıcı içinde bile kontrolü sağlamak için Setter kullanılır.
        setNot(not); 
    }

    // --- GETTER (Okuma) ---

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public int getNot() {
        return not;
    }

    // --- SETTER (Güncelleme ve Kontrol) ---

    /**
     * Öğrencinin notunu ayarlar. Notun geçerliliğini (0-100) kontrol eder.
     * Geçersiz not girişini engeller ve veri bütünlüğünü korur.
     * @param not Atanacak yeni not değeri.
     */
    public void setNot(int not) {
        if (not < 0 || not > 100) {
            // Kontrol: Geçersiz bir değer geldi.
            System.out.println("HATA: " + ogrenciNo + " numaralı öğrenciye " + not + " notu atanamadı. Not 0-100 aralığında olmalıdır.");
            // Eğer not daha önce atanmışsa, eski değerini koruruz. İlk atamada 0 veya default kalır.
        } else {
            // Kontrol başarılı: Değer güvenle atanabilir.
            this.not = not;
            System.out.println(ogrenciNo + " numaralı öğrencinin yeni notu: " + this.not);
        }
    }
}

class TestOgrenci {
    public static void main(String[] args) {
        System.out.println("--- 020_DataKontrolu_SetterKullanimi Testi ---");
        
        Ogrenci ogrenci1 = new Ogrenci("101", 75);
        
        // Geçerli Setter kullanımı
        ogrenci1.setNot(90);
        
        // Geçersiz Setter kullanımı - Hata mesajı dönecek ve not değişmeyecek.
        ogrenci1.setNot(105);
        
        System.out.println("Sonuç: Öğrenci 101'in güncel notu (Getter ile okundu): " + ogrenci1.getNot());
    }
}