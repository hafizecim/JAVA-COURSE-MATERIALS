// ----------------------------------------------------
// Dosya Adı: 050_Arayuzler.java
// ----------------------------------------------------

/**
 * Ucurulabilir Arayüzü: Uçma yeteneğini temsil eden bir sözleşme.
 * Arayüz içindeki metotlar varsayılan olarak public abstract'tır.
 */
interface Ucurulabilir {
    void ucusYap();
}

/**
 * Yuzdurulebilir Arayüzü: Yüzme yeteneğini temsil eden bir sözleşme.
 */
interface Yuzdurulebilir {
    void yuz();
}

/**
 * Ucak Sınıfı: Sadece Ucurulabilir arayüzünü uygular (implement eder).
 * Zorunlu olarak ucusYap() metodunu uygulamak zorundadır.
 */
class Ucak implements Ucurulabilir {
    
    @Override
    public void ucusYap() {
        System.out.println("Uçak: Motorlar çalışıyor ve gökyüzüne doğru havalanıyor.");
    }
    
    public void inişYap() {
        System.out.println("Uçak: Güvenli bir şekilde iniş yapıyor.");
    }
}

/**
 * AmfibikArac Sınıfı: Hem Ucurulabilir hem de Yuzdurulebilir arayüzlerini uygular.
 * Her iki arayüzün tüm metotlarını (ucusYap() ve yuz()) uygulamak zorundadır.
 */
class AmfibikArac implements Ucurulabilir, Yuzdurulebilir {

    @Override
    public void ucusYap() {
        System.out.println("Amfibik Araç: Pervane moduna geçip kısa süreli uçuş yapıyor.");
    }

    @Override
    public void yuz() {
        System.out.println("Amfibik Araç: Tekerleklerini içeri çekip suda seyrediyor.");
    }
    
    public void karadaGit() {
        System.out.println("Amfibik Araç: Karayolunda normal bir araç gibi ilerliyor.");
    }
}

/**
 * Ana Uygulama Sınıfı
 * Arayüz tiplerinde referanslar kullanarak polymorphism'i gösterir.
 */
public class Uygulama050 {
    public static void main(String[] args) {
        
        System.out.println("--- Uçak Nesnesi ---");
        
        // 1. Kendi tipinde referans (Ucak)
        Ucak ucak1 = new Ucak();
        ucak1.ucusYap(); // Ucurulabilir'den gelen metot
        ucak1.inişYap(); // Ucak sınıfına ait kendi metodu
        
        System.out.println("\n--- Amfibik Araç Nesnesi ---");
        
        AmfibikArac amfi1 = new AmfibikArac();
        amfi1.ucusYap();
        amfi1.yuz();
        amfi1.karadaGit();
        
        System.out.println("\n--- Arayüz Referansları ile Polymorphism ---");
        
        // 2. Arayüz tipinde referans (Polymorphism)
        // Yuzdurulebilir tipindeki referans, AmfibikArac nesnesini tutabilir.
        Yuzdurulebilir yuzucu = amfi1; 
        
        yuzucu.yuz(); // Sadece Yuzdurulebilir arayüzündeki metotları çağırabiliriz.
        // yuzucu.ucusYap(); // <- HATA verir. Çünkü referansın tipi (Yuzdurulebilir), bu metodu görmez.

        System.out.println("--- Tek Referans Türü ile Tüm Uçabilenleri Çağırma ---");
        
        Ucurulabilir[] ucanlar = {ucak1, amfi1};
        
        for (Ucurulabilir u : ucanlar) {
            u.ucusYap();
        }
    }
}