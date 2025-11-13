// Dosya Adı: 028_Getter_Return_Klonlama.java
package com.kapsul.guvenlik;

import java.util.Date; // Değiştirilebilir (Mutable) bir nesne örneği

/**
 * Kapsülleme Kırılması ve Önlenmesi.
 * Eğer bir Getter metodu, değiştirilebilir bir nesneyi doğrudan döndürürse, 
 * o nesnenin dışarıdan değiştirilmesiyle Kapsülleme BOZULUR.
 */
class Randevu {
    
    // private alan (Değiştirilebilir Nesne)
    private Date randevuTarihi;

    public Randevu(Date tarih) {
        // Yapıcıda bile klonlama yapılmalı, referans kaçırılmamalı.
        this.randevuTarihi = (Date) tarih.clone(); 
    }

    // --- Kapsüllemeyi BOZAN YANLIŞ GETTER ---
    /*
    public Date getRandevuTarihiYanlis() {
        return randevuTarihi; // Doğrudan referansı döndürür.
    }
    */
    
    // --- Kapsüllemeyi KORUYAN DOĞRU GETTER ---
    /**
     * Randevu tarihini döndürürken, nesnenin bir kopyasını (klonunu) döndürerek
     * orijinal 'private' alana erişimi ve değişikliği engeller.
     * @return Randevu tarihinin klonlanmış kopyası.
     */
    public Date getRandevuTarihi() {
        return (Date) randevuTarihi.clone(); 
    }
    
    public void randevuDurumu() {
        System.out.println("Randevu Tarihi (İÇERİDE): " + randevuTarihi);
    }
}

public class TestKapsulKirilmasi {
    public static void main(String[] args) {
        System.out.println("--- 028_Getter_Return_Klonlama Testi ---");
        
        Date orijinalTarih = new Date();
        Randevu r = new Randevu(orijinalTarih);
        r.randevuDurumu();

        // 1. Randevu Tarihinin Referansını Kopyala (Getter ile)
        Date disariCikanTarih = r.getRandevuTarihi();
        
        // 2. Dışarıdaki (Klonlanmış) Tarihi Değiştir.
        long birGunMilis = 24 * 60 * 60 * 1000;
        disariCikanTarih.setTime(disariCikanTarih.getTime() + birGunMilis); // Tarihi bir gün ileri al.
        System.out.println("Dışarıdaki Değişiklik: " + disariCikanTarih);
        
        // 3. Orijinal Randevunun Değişip Değişmediğini Kontrol Et.
        // Eğer klonlama yapılmasaydı, r.randevuTarihi de değişirdi (Kapsülleme BOZULURDU).
        // Klonlama yapıldığı için, r.randevuTarihi değişmez (Kapsülleme KORUNUR).
        System.out.print("Orijinal Randevu: ");
        r.randevuDurumu(); 
        
        // Sonuç: İçerideki veri güvenli bir şekilde ilk değerini korudu.
    }
}