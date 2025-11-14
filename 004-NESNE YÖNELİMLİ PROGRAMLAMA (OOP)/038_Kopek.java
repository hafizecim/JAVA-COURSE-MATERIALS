// 038_Kopek.java
/**
 * ABSTRACT SINIF UYGULAMASI 2
 * * Abstract sınıflar, ortak davranışları ve özellikleri bir hiyerarşi içinde
 * paylaşmak için idealdir (örn: Hayvan > Köpek, Kedi).
 */
public class O38_Kopek extends O36_Hayvan {

    public O38_Kopek(String isim) {
        super(isim);
    }

    /**
     * 'sesCikar()' abstract metodunun zorunlu uygulaması.
     * Her somut alt sınıf, abstract metodu kendine özgü bir şekilde uygular.
     */
    @Override
    public void sesCikar() {
        System.out.println("Köpek havlıyor: Hav hav!");
    }
    
    // Köpek sınıfına özgü somut metot
    public void kos() {
        System.out.println("Köpek parkta koşuyor.");
    }
}