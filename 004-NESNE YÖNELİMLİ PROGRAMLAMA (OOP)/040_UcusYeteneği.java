// 040_UcusYeteneği.java
/**
 * ARAYÜZ GELİŞMİŞ ÖRNEK (Java 8+ Özellikleri)
 * * Arayüzler, bir sınıfın **ne yapabileceğini** (capability) belirtir.
 */
public interface O40_UcusYeteneği {

    // Klasik abstract metot: Uygulayan sınıfın zorunlu olarak uygulaması gerekir.
    void ucusYap(); 

    // Java 8 ile eklenen 'default' metot.
    // Uygulayan sınıflar bu metodu uygulamak zorunda değildir, isterlerse override edebilirler.
    default void inisYap() {
        System.out.println("Uçuş yeteneği olan varlık güvenli bir şekilde iniyor (Default İniş).");
    }
    
    // Java 8 ile eklenen 'static' metot.
    // Bu metot sadece arayüz adı üzerinden çağrılabilir (örn: O40_UcusYeteneği.havadaNeYapilmali()).
    // Uygulayan sınıflar tarafından miras alınmaz veya override edilemez.
    static void havadaNeYapilmali() {
        System.out.println("Tüm uçan varlıklar havada dengeyi korumalıdır.");
    }
}