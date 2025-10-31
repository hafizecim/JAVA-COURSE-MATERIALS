// 📘 004_ArraysClassMethods.java
// 🎯 Konu: Arrays Sınıfı Metotları - Geliştirilmiş
// 👩‍💻 Yazan: Hafize Şenyıl
// 🧠 Amaç: sort(), toString(), fill(), binarySearch() ve copyOf() gibi yardımcı metotları öğrenmek

import java.util.Arrays;

public class ArraysClassMethods {

    public static void main(String[] args) {

        // --- 1. Başlangıç Metotları: Yazdırma, Sıralama ve Karşılaştırma ---
        
        // 🔹 Bir tam sayı dizisi tanımlanıyor
        int[] scores = {85, 60, 95, 70, 50};

        // 🔹 Diziyi ekrana yazdır (Arrays.toString)
        System.out.println("Orijinal dizi: " + Arrays.toString(scores));

        // 🔹 Diziyi sıralama (Arrays.sort) - Tüm diziyi sıralar
        Arrays.sort(scores);
        System.out.println("Sıralanmış dizi: " + Arrays.toString(scores)); // [50, 60, 70, 85, 95]

        // 🔹 Dizinin bir kısmını sıralama (Overloaded sort metodu)
        int[] partialScores = {10, 5, 30, 20};
        // 1. indexten (5) başlayıp 3. indexe (20) kadar sırala (3. index dahil değil)
        Arrays.sort(partialScores, 1, 3); 
        System.out.println("Kısmen sıralanmış: " + Arrays.toString(partialScores)); // [10, 5, 30, 20] -> [10, 5, 30, 20] -> [10, 5, 30, 20]

        // 🔹 Dizi karşılaştırması (Arrays.equals)
        int[] newScores = {50, 60, 70, 85, 95}; // scores dizisi ile aynı
        boolean same = Arrays.equals(scores, newScores);
        System.out.println("\nİki dizi aynı mı? " + same); // True

        // --- 2. Arama Metodu: binarySearch (İkili Arama) ---
        
        // 💡 ÖNEMLİ: binarySearch metodu sadece DÜZENLENMİŞ (sorted) dizilerde doğru çalışır!
        int searchResult = Arrays.binarySearch(scores, 70);
        System.out.println("\n70'in bulunduğu index: " + searchResult); // Index 2

        int notFoundResult = Arrays.binarySearch(scores, 10);
        // Bulamazsa negatif değer döndürür (eklenebileceği yerin -1'i)
        System.out.println("10'un bulunma sonucu: " + notFoundResult); 

        // --- 3. Atama ve Kopyalama Metotları ---
        
        // 🔹 Diziye tümünü doldurma (Arrays.fill)
        Arrays.fill(scores, 0, 5, 100); // 0. indexten 5. indexe kadar (yani tamamını) 100 yap
        System.out.println("Tüm elemanlar 100 yapıldı: " + Arrays.toString(scores));

        // 🔹 Dizinin bir kısmını doldurma (Overloaded fill metodu)
        String[] fruits = new String[5];
        // 2. indexten başlayıp 4. indexe (4. index dahil değil) kadar "Elma" ile doldur
        Arrays.fill(fruits, 2, 4, "Elma");
        System.out.println("Kısmen dolduruldu: " + Arrays.toString(fruits)); // [null, null, Elma, Elma, null]

        // 🔹 Dizi kopyalama (Arrays.copyOf)
        int[] scoresCopy = Arrays.copyOf(scores, scores.length); // scores dizisinin tamamını kopyala
        System.out.println("\nscoresCopy dizisi: " + Arrays.toString(scoresCopy));
        
        // 🔹 Dizi boyutunu değiştirerek kopyalama
        // İlk 3 elemanı kopyala (kalanı atmış olur)
        int[] shortCopy = Arrays.copyOf(scores, 3); 
        System.out.println("İlk 3 eleman: " + Arrays.toString(shortCopy)); // [100, 100, 100]
    }
}