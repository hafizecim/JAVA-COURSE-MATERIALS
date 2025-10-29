// 📘 004_ArraysClassMethods.java
// 🎯 Konu: Arrays Sınıfı Metotları
// 👩‍💻 Yazan: Hafize Şenyıl
// 🧠 Amaç: sort(), toString(), fill() gibi yardımcı metotları öğrenmek

import java.util.Arrays;

public class ArraysClassMethods {

    public static void main(String[] args) {

        // 🔹 Bir tam sayı dizisi tanımlanıyor
        int[] scores = {85, 60, 95, 70, 50};

        // 🔹 Diziyi ekrana yazdır (Arrays.toString)
        System.out.println("Orijinal dizi: " + Arrays.toString(scores));

        // 🔹 Diziyi sıralama (Arrays.sort)
        Arrays.sort(scores);
        System.out.println("Sıralanmış dizi: " + Arrays.toString(scores));

        // 🔹 Diziye yeni değer atama (Arrays.fill)
        Arrays.fill(scores, 100);
        System.out.println("Tüm elemanlar 100 yapıldı: " + Arrays.toString(scores));

        // 🔹 Dizi karşılaştırması (Arrays.equals)
        int[] newScores = {100, 100, 100, 100, 100};
        boolean same = Arrays.equals(scores, newScores);
        System.out.println("İki dizi aynı mı? " + same);
    }
}
