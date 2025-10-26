/*
 * 🧮----------------------------------------------------------
 * 💻 JAVA DERSLERİ - PEKİŞTİRME: "ARİTMETİK OYUNU"
 * 👩‍💻 Hafize Şenyıl
 * 📅 26.10.2025
 * -----------------------------------------------------------
 */

public class Step2C_ArithmeticFun {
    public static void main(String[] args) {

        // 🔹 1️⃣ DEĞERLERİ TANIMLAYALIM
        int apples = 12;
        int oranges = 8;
        int bananas = 15;

        // 🔹 2️⃣ TOPLAM ve ORTALAMA
        int totalFruits = apples + oranges + bananas;
        double average = totalFruits / 3.0;

        System.out.println("🍎 Elma: " + apples);
        System.out.println("🍊 Portakal: " + oranges);
        System.out.println("🍌 Muz: " + bananas);
        System.out.println("🥗 Toplam meyve: " + totalFruits);
        System.out.println("📏 Ortalama: " + average);

        // 🔹 3️⃣ KARŞILAŞTIRMA OPERATÖRLERİ
        boolean moreApples = apples > oranges;
        System.out.println("\n🍏 Elmadan portakaldan fazla mı? " + moreApples);

        // 🔹 4️⃣ MANTIKSAL OPERATÖRLER
        boolean enoughFruits = (totalFruits > 20) && (average > 5);
        System.out.println("🥝 Meyve sayısı yeterli mi? " + enoughFruits);

        // 🔹 5️⃣ ARTTIRMA-AZALTMA
        apples++; // 1 artır
        oranges--; // 1 azalt
        System.out.println("\n🍎 Yeni elma sayısı: " + apples);
        System.out.println("🍊 Yeni portakal sayısı: " + oranges);

        // 🔹 6️⃣ ATAMA OPERATÖRLERİ
        int basket = 10;
        basket += 5; // 15
        basket *= 2; // 30
        System.out.println("\n🧺 Sepetteki meyve sayısı: " + basket);

        // 🔹 7️⃣ PROGRAM SONU
        System.out.println("\n🎉 Step 2C tamamlandı!");
        System.out.println("--------------------------------------------------");
        System.out.println("Hafize Şenyıl - Step 2C: Arithmetic Fun");
        System.out.println("--------------------------------------------------");
    }
}
