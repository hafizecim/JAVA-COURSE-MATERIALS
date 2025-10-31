// 📘 001_SingleDimensionArray.java
// 🎯 Konu: Tek Boyutlu Dizi (One-Dimensional Array) - Geliştirilmiş
// 👩‍💻 Yazan: Hafize Şenyıl
// 🧠 Amaç: Dizi oluşturmayı, farklı yollarla eleman atamayı ve for-each ile yazdırmayı öğrenmek

import java.util.Arrays; // Dizileri yazdırmak için kullanışlı bir sınıf

public class SingleDimensionArray {

    public static void main(String[] args) {

        // --- Yöntem 1: Boyut Belirterek Oluşturma ve Sonradan Atama (Mevcut Yöntem) ---
        // 🔹 5 elemanlı bir tam sayı dizisi oluşturuluyor (varsayılan değerler 0)
        int[] numbers = new int[5];

        // 🔹 Diziye değer atama
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // 🔹 Dizinin uzunluğunu (eleman sayısını) yazdırma
        System.out.println("1. Dizi Uzunluğu (numbers.length): " + numbers.length);
        
        // 🔹 Dizinin 3. elemanını (index 2) ekrana yazdır
        System.out.println("1. Dizinin Üçüncü elemanı: " + numbers[2]);

        // 🔹 Tüm dizi elemanlarını yazdırmak için geleneksel for döngüsü
        System.out.println("\n--- 1. Dizi Elemanları (Klasik For) ---");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }
        
        // --- Yöntem 2: Başlatma Anında Değer Atayarak Oluşturma (Kısa Yöntem) ---
        // 🔹 Elemanlar listelenerek otomatik boyutlandırılan String dizisi
        String[] fruits = {"Apple", "Banana", "Cherry", "Date"};
        
        System.out.println("\n--- 2. Dizi Elemanları (For-Each) ---");
        
        // 🔹 Gelişmiş for döngüsü (For-each): Elemanlar üzerinde daha basit gezinme
        // Dizinin her bir elemanını sırayla 'fruit' değişkenine atar.
        for (String fruit : fruits) {
            System.out.println("Meyve: " + fruit);
        }
        
        // 🔹 For-each döngüsünün avantajı: Daha kısa ve hatasız index yönetimi
        System.out.println("2. Dizi Uzunluğu: " + fruits.length);
        
        // --- Yöntem 3: `Arrays.toString()` ile Hızlı Yazdırma ---
        // 🔹 Başlatma anında değer ataması
        double[] prices = new double[]{15.99, 5.50, 99.00};
        
        System.out.println("\n--- 3. Dizi (Arrays.toString ile Hızlı Yazdırma) ---");
        // Arrays.toString() metodu, diziyi "[" ile başlayan, "," ile ayrılan formatta yazdırır
        System.out.println("Fiyatlar: " + Arrays.toString(prices));
        
        // 💡 ÖNEMLİ NOT: Geçersiz bir indekse erişim denemesi 'ArrayIndexOutOfBoundsException' hatası verir.
        // System.out.println(numbers[5]); // Hata: numbers dizisi sadece 0'dan 4'e kadar index içerir.
    }
}