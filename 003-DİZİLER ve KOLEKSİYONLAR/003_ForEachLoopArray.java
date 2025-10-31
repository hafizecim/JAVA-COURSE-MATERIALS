// 📘 003_ForEachLoopArray.java
// 🎯 Konu: for-each Döngüsü - Geliştirilmiş
// 👩‍💻 Yazan: Hafize Şenyıl
// 🧠 Amaç: Dizi elemanlarını kolay şekilde dolaşmayı, toplama ve dezavantajlarını öğrenmek

public class ForEachLoopArray {

    public static void main(String[] args) {

        // --- Örnek 1: Temel For-Each Kullanımı (String Dizisi) ---
        
        // 🔹 String türünde şehirler dizisi
        String[] cities = {"Konya", "İstanbul", "İzmir", "Ankara"};

        // 🔹 for-each döngüsüyle diziyi gezme ve yazdırma
        System.out.println("--- Şehirler (For-Each) ---");
        for (String city : cities) {
            System.out.println("Şehir: " + city);
        }

        // --- Örnek 2: For-Each ile Dizi Elemanlarını Toplama ---
        
        // 🔹 int türünde sayılar dizisi
        int[] numbers = {10, 5, 20, 15, 30};
        int sum = 0;

        System.out.println("\n--- Sayıları Toplama (For-Each) ---");
        
        // 🔹 For-each döngüsü, her elemanı alıp toplama değişkenine ekler
        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Dizideki sayıların toplamı: " + sum); // Sonuç: 80

        // --- For-Each ve Klasik For Karşılaştırması ---

        // 🔹 Klasik for döngüsüyle yazdırma (Index numarası gerektiğinde kullanılır)
        System.out.println("\n--- Index Numaralarıyla Yazdırma (Klasik For) ---");
        for (int i = 0; i < cities.length; i++) {
            System.out.println("Index " + i + ": " + cities[i]);
        }
        
        // 💡 ÖNEMLİ NOT: For-each döngüsünün dezavantajı:
        // Döngü içinde elemanın değerini DEĞİŞTİREMEZSİNİZ, sadece kopyasını alırsınız.
        // Ayrıca, elemanın index numarasına erişemezsiniz (Index gerekliyse Klasik For kullanılır).

        System.out.println("\n--- For-Each ile Değer Değiştirme Denemesi ---");
        int[] data = {1, 2, 3};
        
        for (int value : data) {
            value = value * 2; // Bu, sadece 'value' değişkenini değiştirir, 'data' dizisini etkilemez.
        }
        
        // Kanıt: Dizi elemanları değişmedi.
        System.out.println("Dizi elemanları (for-each sonrası): " + data[0] + ", " + data[1] + ", " + data[2]); // 1, 2, 3 kalır
    }
}