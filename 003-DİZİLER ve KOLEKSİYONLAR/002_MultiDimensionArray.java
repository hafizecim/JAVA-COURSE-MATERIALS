// 📘 002_MultiDimensionArray.java
// 🎯 Konu: Çok Boyutlu (2D) Dizi - Geliştirilmiş
// 👩‍💻 Yazan: Hafize Şenyıl
// 🧠 Amaç: Matris yapısını, farklı oluşturma yöntemlerini ve düzensiz dizileri anlamak

import java.util.Arrays; // Dizileri yazdırmak için kullanışlı bir sınıf

public class MultiDimensionArray {

    public static void main(String[] args) {

        // --- Yöntem 1: Başlatma Anında Değer Atayarak Oluşturma (Mevcut Yöntem) ---
        // 🔹 2x3 boyutunda bir matris oluşturuluyor (2 satır, her satırda 3 sütun)
        int[][] matrix = {
            {10, 20, 30},
            {40, 50, 60}
        };

        // 🔹 Temel bilgiler
        System.out.println("Matrisin Satır Sayısı (matrix.length): " + matrix.length);
        System.out.println("İlk Satırın Sütun Sayısı (matrix[0].length): " + matrix[0].length);
        System.out.println("Eleman Örneği (matrix[1][2]): " + matrix[1][2] + "\n"); // 2. satır, 3. sütun (60)


        // 🔹 Matrisin elemanlarını Klasik For döngüleriyle tablo biçiminde yazdır
        System.out.println("--- Matris İçeriği (Klasik For) ---");
        for (int i = 0; i < matrix.length; i++) { // satır (dış döngü)
            for (int j = 0; j < matrix[i].length; j++) { // sütun (iç döngü)
                System.out.printf("%4d", matrix[i][j]); // Elemanları hizalı yazdırma
            }
            System.out.println(); // bir satır bittiğinde alt satıra geç
        }

        // --- Yöntem 2: Boyut Belirterek Oluşturma ve Sonradan Atama ---
        // 🔹 3 satır, 4 sütunlu bir dizi (varsayılan değerler 0)
        double[][] grades = new double[3][4];
        grades[0][0] = 85.5; // 1. öğrencinin 1. notu
        
        System.out.println("\n--- Not Matrisi (For-Each) ---");
        
        // 🔹 Gelişmiş For (For-Each) döngüsü ile yazdırma
        // Dış döngü: Her bir satırı (tek boyutlu dizi) alır
        for (double[] row : grades) { 
            // İç döngü: Satır içindeki her bir elemanı (double) alır
            for (double grade : row) {
                System.out.printf("%.1f ", grade); 
            }
            System.out.println();
        }

        // --- Yöntem 3: Düzensiz Dizi (Jagged Array) Oluşturma ---
        // 🔹 Satır uzunlukları birbirinden farklı olan matrisler
        int[][] jaggedArray = new int[3][]; // Sadece satır sayısı belirlendi

        jaggedArray[0] = new int[]{1, 2}; // 1. satır 2 elemanlı
        jaggedArray[1] = new int[]{3, 4, 5, 6}; // 2. satır 4 elemanlı
        jaggedArray[2] = new int[]{7}; // 3. satır 1 elemanlı

        System.out.println("\n--- Düzensiz Dizi (Jagged Array) ---");
        System.out.println("1. Satır Uzunluğu: " + jaggedArray[0].length); // 2
        
        // 🔹 Arrays.deepToString() ile tüm diziyi tek satırda yazdırma
        System.out.println("Tüm Dizi (deepToString): " + Arrays.deepToString(jaggedArray));
    }
}