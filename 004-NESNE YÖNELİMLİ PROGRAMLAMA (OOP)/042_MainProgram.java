// 042_MainProgram.java
/**
 * TEST VE POLİMORFİZM ÖRNEĞİ
 * * Abstract sınıflar ve arayüzler, Polimorfizm (Çok Biçimlilik) için temel oluşturur.
 * Abstract sınıf/Arayüz referansı, alt sınıfların/uygulayan sınıfların nesnelerini
 * tutabilir.
 */
public class O42_MainProgram {
    public static void main(String[] args) {
        System.out.println("--- Abstract Sınıf (O36_Hayvan) Testi ---");
        // O36_Hayvan h1 = new O36_Hayvan("Genel"); // Hata! Abstract sınıftan nesne oluşturulamaz.
        
        O36_Hayvan h1 = new O37_Kedi("Pamuk"); // Polimorfizm: Hayvan referansı Kedi nesnesini tutuyor.
        O36_Hayvan h2 = new O38_Kopek("Karabaş");
        
        h1.yemekYe(); // Ortak metot
        h1.sesCikar(); // Kedi'nin özel uygulaması çağrılır
        
        h2.yemekYe();
        h2.sesCikar(); // Köpek'in özel uygulaması çağrılır
        
        System.out.println("\n--- Arayüz (Interface) Testi ---");
        
        O41_Kus kus = new O41_Kus("Serçe");
        kus.sesCikart(); // O39_SesCikartabilir metodu
        kus.ucusYap();   // O40_UcusYeteneği metodu
        kus.inisYap();   // O40_UcusYeteneği override edilmiş default metodu
        
        // Arayüz referansı ile de polimorfizm sağlanır:
        O40_UcusYeteneği ucanVarlik = kus;
        ucanVarlik.ucusYap();
        
        // Arayüz statik metot çağrısı:
        O40_UcusYeteneği.havadaNeYapilmali();
        
        // Arayüz sabit değişken erişimi:
        System.out.println("Arayüz Açıklaması: " + O39_SesCikartabilir.TUR_ACIKLAMASI);
    }
}