/*
 * 🌿----------------------------------------------------------
 * 💻 JAVA DERSLERİ - PEKİŞTİRME: "DEĞİŞKENLER ve İŞLEMLER"
 * 👩‍💻 Hazel Sahra
 * 📅 26.10.2025
 * 📘 Konu: Değişken türleri, hesaplamalar, string birleştirme
 * -----------------------------------------------------------
 */

public class Step2B_VariablesPractice {
    public static void main(String[] args) {

        // 🔹 1️⃣ BİLGİ DEPOLAMA
        String studentName = "Hazel Sahra";
        int studentAge = 25;
        double studentHeight = 1.68;
        double studentWeight = 56.4;

        // 🔹 2️⃣ VÜCUT KİTLE İNDEKSİ (BMI) HESAPLAMA
        double bmi = studentWeight / (studentHeight * studentHeight);

        System.out.println("🧘‍♀️ Öğrenci: " + studentName);
        System.out.println("🎂 Yaş: " + studentAge);
        System.out.println("📏 Boy: " + studentHeight + " m");
        System.out.println("⚖️ Kilo: " + studentWeight + " kg");
        System.out.println("💪 Vücut Kitle İndeksi (BMI): " + bmi);

        // 🔹 3️⃣ SAYI FORMATLAMA (ondalık azaltma)
        System.out.println(String.format("🎯 Yuvarlanmış BMI: %.2f", bmi));

        // 🔹 4️⃣ STRING BİRLEŞTİRME ve DÜZENLİ CÜMLE
        String message = "🌸 " + studentName + " is " + studentAge + " years old.";
        System.out.println(message);

        // 🔹 5️⃣ ÖRNEK: Günlük harcama hesaplama
        double breakfast = 2.5;
        double lunch = 5.0;
        double dinner = 4.5;
        double totalDailyExpense = breakfast + lunch + dinner;

        System.out.println("\n💰 Günlük Harcama Toplamı: " + totalDailyExpense + " ₺");
        System.out.println("📅 Aylık Harcama (30 gün): " + (totalDailyExpense * 30) + " ₺");

        // 🔹 6️⃣ TYPE CASTING (tip dönüşümü)
        int dailyRounded = (int) totalDailyExpense; // Ondalığı sil
        System.out.println("🧾 Yuvarlanmış günlük harcama: " + dailyRounded + " ₺");

        // 🔹 7️⃣ KARAKTER ve ASCII DEĞERİ
        char firstLetter = 'H';
        int asciiValue = firstLetter; // char → int dönüşümü
        System.out.println("\n🔤 Harf: " + firstLetter + " | ASCII değeri: " + asciiValue);

        // 🔹 8️⃣ BOOLEAN UYGULAMASI
        boolean isAdult = (studentAge >= 18);
        System.out.println("👩 Yetişkin mi? " + isAdult);

        // 🔹 9️⃣ PROGRAM SONU
        System.out.println("\n🎉 Pekiştirme tamamlandı!");
        System.out.println("--------------------------------------------------");
        System.out.println("Hazel Sahra - Step 2B: Variables Practice");
        System.out.println("--------------------------------------------------");
    }
}
