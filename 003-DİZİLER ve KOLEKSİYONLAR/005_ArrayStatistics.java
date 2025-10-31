// 📘 005_ArrayStatistics.java
// 🎯 Konu: Dizi İstatistikleri (Toplam, Ortalama, Min, Max, Varyans, Standart Sapma)
// 👩‍💻 Yazan: Hafize Şenyıl
// 🧠 Amaç: Kullanıcıdan alınan dizi üzerinde temel ve ileri istatistik hesaplamayı öğrenmek

import java.util.Scanner;
import java.util.Arrays; // Diziyi yazdırmak için ekledim
import java.lang.Math;   // Standart sapma için Math.sqrt() kullanmak üzere

public class ArrayStatistics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 🔹 Kullanıcıdan dizi boyutunu alma
        System.out.print("Kaç adet sayı gireceksiniz? ");
        int n = input.nextInt();

        // 🔹 Dizi oluşturma (kullanıcının gireceği sayıları tutacak)
        int[] numbers = new int[n];

        // 🔹 Diziye kullanıcıdan değer atama
        System.out.println("Lütfen sayıları girin:");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". sayıyı girin: ");
            numbers[i] = input.nextInt();
        }
        
        System.out.println("\nGirdiğiniz Dizi: " + Arrays.toString(numbers));

        // --- 1. Temel İstatistik Hesaplama (Toplam, Min, Max) ---
        
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) { // for-each: dizi elemanlarını sırayla alır
            sum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }

        // 🔹 Ortalama hesaplama
        double average = (double) sum / n;
        
        // --- 2. İleri İstatistik Hesaplama (Varyans ve Standart Sapma) ---
        // Varyans, her bir elemanın ortalamadan farkının karesinin toplamının eleman sayısına bölümüdür.
        double varianceSum = 0;
        
        for (int num : numbers) {
            // (Eleman - Ortalama)'nın karesini topluyoruz
            varianceSum += Math.pow((num - average), 2);
        }
        
        // 🔹 Varyans hesaplama
        double variance = varianceSum / n; 
        
        // 🔹 Standart Sapma hesaplama (Varyansın karekökü)
        double standardDeviation = Math.sqrt(variance);

        // 🔹 Sonuçları yazdırma
        System.out.println("\n--- İstatistik Sonuçları ---");
        System.out.println("Toplam: " + sum);
        System.out.printf("Ortalama: %.2f\n", average); // Ortalama 2 ondalık basamakla yazdırıldı
        System.out.println("En Küçük: " + min);
        System.out.println("En Büyük: " + max);
        System.out.printf("Varyans: %.2f\n", variance);
        System.out.printf("Standart Sapma: %.2f\n", standardDeviation);

        input.close();
    }
}