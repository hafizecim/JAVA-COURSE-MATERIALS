// 041_Kus.java
/**
 * ARAYÜZ UYGULAMASI (Çoklu Kalıtım)
 * * Java'da bir sınıf, sadece tek bir sınıftan miras alabilir (tekli kalıtım),
 * ancak **istediği kadar** arayüzü uygulayabilir ('implements' anahtar kelimesi).
 * Bu, arayüzlerin en büyük avantajıdır.
 */
public class O41_Kus implements O39_SesCikartabilir, O40_UcusYeteneği {

    private String turAdi;

    public O41_Kus(String turAdi) {
        this.turAdi = turAdi;
    }
    
    // O39_SesCikartabilir arayüzünden gelen zorunlu uygulama
    @Override
    public void sesCikart() {
        System.out.println(turAdi + " ötüyor: Cik cik!");
    }

    // O40_UcusYeteneği arayüzünden gelen zorunlu uygulama
    @Override
    public void ucusYap() {
        System.out.println(turAdi + " kanat çırparak uçuyor.");
    }
    
    // O40_UcusYeteneği arayüzündeki 'inisYap()' default metodunu override edebiliriz.
    @Override
    public void inisYap() {
        System.out.println(turAdi + " bir dala konarak yumuşak bir iniş yaptı.");
    }
}