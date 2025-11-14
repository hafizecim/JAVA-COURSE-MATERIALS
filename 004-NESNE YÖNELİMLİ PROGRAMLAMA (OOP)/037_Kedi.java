// 037_Kedi.java
/**
 * ABSTRACT SINIF UYGULAMASI (Kalıtım)
 * * 'extends' anahtar kelimesi ile O36_Hayvan abstract sınıfından miras alınmıştır.
 * Miras alan somut (concrete) bir sınıfın, ata sınıftaki tüm abstract metotları 
 * **mutlaka** uygulaması (override etmesi) gerekir. Aksi takdirde, bu sınıfın da
 * 'abstract' olarak işaretlenmesi gerekir.
 */
public class O37_Kedi extends O36_Hayvan {

    // Kedi sınıfı, Hayvan sınıfının kurucusunu çağırmak zorundadır.
    public O37_Kedi(String isim) {
        super(isim); 
    }

    /**
     * O36_Hayvan sınıfındaki 'sesCikar()' abstract metodunun zorunlu uygulamasıdır.
     * Bu metodun "nasıl" çalıştığı detayı (Miyavlama) sadece Kedi sınıfına aittir.
     * Bu, soyutlamanın uygulama detaylarını gizleme prensibini gösterir.
     */
    @Override
    public void sesCikar() {
        System.out.println("Kedi miyavlıyor: Miyav miyav!");
    }
    
    // Kedi sınıfına özgü somut metot
    public void tirman() {
        System.out.println("Kedi ağaca tırmanıyor.");
    }
}