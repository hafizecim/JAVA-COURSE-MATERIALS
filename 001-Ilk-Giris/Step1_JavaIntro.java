/*  
 * 🌿----------------------------------------------------------
 * 💻  JAVA DERSLERİ - 1. ADIM: "JAVA'YA GİRİŞ"
 * 👩‍💻  Hazırlayan: Hazel Sahra
 * 🗓️  Tarih: 26.10.2025
 * 📁  Klasör: D:\JAVA-DERSLERİ
 * 🌱  Konu: Java'nın temelleri, ilk kod, açıklama satırları
 * -----------------------------------------------------------
 */

 // 🔸 Her Java programı bir sınıf (class) içinde yazılır
public class Step1_JavaIntro {

    // 🏁 Programın başlangıç noktası main() metodudur
    public static void main(String[] args) {

        // 🖨️ Ekrana yazı yazdırmak için System.out.println() kullanılır
        System.out.println("🌼 Hello, Java World!");
        System.out.println("💻 Hazel Sahra burada! Java öğrenmeye başlıyorum.");

        // 🔹 System.out.print() komutu satır atlamaz
        System.out.print("Bu satırda satır sonu yok -> ");
        System.out.print("görüyor musun? 😊");

        // 🔹 Satır sonu eklemek için \n kullanılır
        System.out.print("\nBu satırda \\n kullanıldı ve alt satıra geçildi!\n");

        // 🔹 String birleştirme örneği (+ operatörü)
        String name = "Hazel";
        String goal = "become a professional Java developer!";
        System.out.println("🚀 My name is " + name + " and I want to " + goal);

        // 🔹 Tek satır yorum örneği
        // Bu sadece açıklama amaçlıdır, çalışmaz.

        /*
         🔹 Çok satırlı yorum örneği:
         Bu tür yorumlar birden fazla satırı kapsar.
         Kodun amacını açıklamak için mükemmeldir!
        */

        // 🔹 Değişken örneği
        int year = 2025;
        System.out.println("📅 Current year: " + year);

        // 🔹 Basit matematik işlemi
        int x = 10;
        int y = 5;
        int sum = x + y;
        System.out.println("🧮 Toplam: " + sum);

        // 🔹 Programın bitiş mesajı
        System.out.println("\n🎉 Program başarıyla tamamlandı!");
        System.out.println("--------------------------------------------------");
        System.out.println("Hazel Sahra - Step 1: Java'ya Giriş");
        System.out.println("--------------------------------------------------");
    }
}
