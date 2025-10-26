/*
 * 🌟----------------------------------------------------------
 * 💻 JAVA DERSLERİ - PEKİŞTİRME: "FUN CALCULATIONS"
 * 👩‍💻 Hazel Sahra
 * 📅 26.10.2025
 * 🌱 Konu: Değişkenler, matematik, string birleştirme
 * -----------------------------------------------------------
 */

public class Step2D_FunCalculations {
    public static void main(String[] args) {

        // 🔹 1️⃣ ÖĞRENCİ BİLGİLERİ
        String name = "Hazel Sahra";
        int age = 25;
        System.out.println("👋 Merhaba, ben " + name + ", " + age + " yaşındayım!");

        // 🔹 2️⃣ FAVORİ SAYILARLA HESAP
        int favoriteNumber = 7;
        int luckyNumber = 3;

        System.out.println("\n🎲 Favori sayılarım: " + favoriteNumber + " ve " + luckyNumber);

        int sum = favoriteNumber + luckyNumber;
        int product = favoriteNumber * luckyNumber;
        double division = (double) favoriteNumber / luckyNumber;
        int remainder = favoriteNumber % luckyNumber;

        System.out.println("➕ Toplam: " + sum);
        System.out.println("✖️ Çarpım: " + product);
        System.out.println("➗ Bölüm: " + division);
        System.out.println("💥 Kalan: " + remainder);

        // 🔹 3️⃣ YAŞ HESAPLAMA (gelecek yıl)
        int nextYearAge = age + 1;
        System.out.println("\n🎂 Gelecek yıl yaşım: " + nextYearAge);

        // 🔹 4️⃣ STRING BİRLEŞTİRME - KÜÇÜK MESAJ
        String hobby = "drawing";
        String dream = "become a professional Java developer";
        String message = name + " loves " + hobby + " and dreams to " + dream + "!";
        System.out.println("\n💬 " + message);

        // 🔹 5️⃣ KARAKTER VE ASCII DEĞERİ
        char firstLetter = name.charAt(0); // İsmin ilk harfi
        int ascii = firstLetter;
        System.out.println("\n🔤 İsmin ilk harfi: " + firstLetter + " | ASCII değeri: " + ascii);

        // 🔹 6️⃣ KISA MATEMATİK OYUNU
        int x = 10, y = 4;
        System.out.println("\n🎮 Mini matematik oyunu:");
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + ((double)x / y));
        System.out.println("x % y = " + (x % y));

        // 🔹 7️⃣ PROGRAM SONU
        System.out.println("\n🎉 Step 2D tamamlandı!");
        System.out.println("--------------------------------------------------");
        System.out.println("Hazel Sahra - Step 2D: Fun Calculations");
        System.out.println("--------------------------------------------------");
    }
}
