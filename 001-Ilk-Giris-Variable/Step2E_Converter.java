/*
 * 🔄----------------------------------------------------------
 * 💻 JAVA DERSLERİ - PEKİŞTİRME: "TIP DÖNÜŞÜMLERİ"
 * 👩‍💻 Hafize Şenyıl
 * 📅 26.10.2025
 * -----------------------------------------------------------
 */

public class Step2E_Converter {
    public static void main(String[] args) {

        // 🔹 1️⃣ Tam sayıdan double
        int a = 7;
        double b = a; // otomatik dönüşüm (widening)
        System.out.println("a (int) = " + a + " → b (double) = " + b);

        // 🔹 2️⃣ Double'dan int (manuel)
        double pi = 3.14159;
        int piInt = (int) pi; // daraltma (noktadan sonrası silinir)
        System.out.println("pi (double) = " + pi + " → piInt (int) = " + piInt);

        // 🔹 3️⃣ String → int
        String strNum = "42";
        int number = Integer.parseInt(strNum);
        System.out.println("\nstrNum (String) = \"" + strNum + "\" → number (int) = " + number);

        // 🔹 4️⃣ int → String
        int age = 25;
        String strAge = String.valueOf(age);
        System.out.println("age (int) = " + age + " → strAge (String) = \"" + strAge + "\"");

        // 🔹 5️⃣ Boolean uygulaması
        boolean isAdult = (age >= 18);
        System.out.println("\nYetişkin mi? " + isAdult);

        // 🔹 6️⃣ Karışık örnek: ASCII dönüşümü
        char ch = 'J';
        int ascii = ch;
        System.out.println("\nHarf: " + ch + " → ASCII: " + ascii);

        // 🔹 7️⃣ Program sonu
        System.out.println("\n🎉 Step 2E tamamlandı!");
        System.out.println("--------------------------------------------------");
        System.out.println("Hafize Şenyıl - Step 2E: Converter Practice");
        System.out.println("--------------------------------------------------");
    }
}
