/*  
 * 🌿----------------------------------------------------------
 * 💻  JAVA DERSLERİ - 2. ADIM: "SÖZDİZİMİ ve DEĞİŞKENLER"
 * 👩‍💻  Hazırlayan: Hazel Sahra
 * 🗓️  Tarih: 26.10.2025
 * 📁  Klasör: D:\JAVA-DERSLERİ
 * 🌱  Konu: Değişken tanımlama, veri türleri, işlem ve çıktı
 * -----------------------------------------------------------
 */

public class Step2_SyntaxAndVariables {

    public static void main(String[] args) {

        // 🔹 1️⃣ YORUM SATIRLARI
        // Tek satırlı yorum: "//" ile başlar
        /* Çok satırlı yorum:
           Birden fazla satırı açıklamak için kullanılır */

        // 🔹 2️⃣ DEĞİŞKEN TANIMLAMA (Variables)
        // Java'da her değişkenin bir veri tipi olmalıdır

        int age = 25;                 // Tamsayı (integer)
        double height = 1.68;         // Ondalıklı sayı
        char grade = 'A';             // Tek karakter
        boolean isStudent = true;     // Mantıksal değer (true/false)
        String name = "Hazel Sahra";  // Metin (string)

        // 🔹 3️⃣ EKRANA YAZDIRMA (OUTPUT)
        System.out.println("👋 Merhaba, benim adım " + name);
        System.out.println("🎂 Yaşım: " + age);
        System.out.println("📏 Boyum: " + height + " m");
        System.out.println("🏫 Öğrenci misin? " + isStudent);
        System.out.println("⭐ Harf notum: " + grade);

        // 🔹 4️⃣ BASİT İŞLEMLER
        int x = 10;
        int y = 3;
        int toplam = x + y;
        int fark = x - y;
        int carpim = x * y;
        double bolum = (double) x / y; // Type casting (dönüştürme)
        int kalan = x % y;             // Mod alma işlemi

        // Sonuçları yazdıralım
        System.out.println("\n🧮 BASİT MATEMATİK İŞLEMLERİ");
        System.out.println("Toplam: " + toplam);
        System.out.println("Fark: " + fark);
        System.out.println("Çarpım: " + carpim);
        System.out.println("Bölüm: " + bolum);
        System.out.println("Kalan: " + kalan);

        // 🔹 5️⃣ SABİTLER (final)
        final double PI = 3.14159; // Değeri değiştirilemez
        System.out.println("\n🔒 Sabit PI değeri: " + PI);

        // 🔹 6️⃣ CONCATENATION (Birleştirme)
        String message = "🌸 " + name + " is " + age + " years old.";
        System.out.println("\n" + message);

        // 🔹 7️⃣ ESCAPE KARAKTERLERİ
        System.out.println("\n💬 Kaçış karakterleri örneği:");
        System.out.println("Yeni satır: \\n -> \nBu alt satırda!");
        System.out.println("Tab boşluğu: \\t -> \tTablı yazı");
        System.out.println("Çift tırnak: \\\" -> \"Merhaba\"");
        System.out.println("Ters eğik çizgi: \\\\ -> \\");
        
        // 🔹 8️⃣ PROGRAM SONU MESAJI
        System.out.println("\n🎉 Step 2 başarıyla tamamlandı!");
        System.out.println("--------------------------------------------------");
        System.out.println("Hazel Sahra - Step 2: Sözdizimi ve Değişkenler");
        System.out.println("--------------------------------------------------");
    }
}
