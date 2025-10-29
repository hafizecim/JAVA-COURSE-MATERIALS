// 📘 005_ArrayStatistics.java
// Bu örnek, bir dizideki sayılardan istatistiksel bilgiler (toplam, ortalama, min, max) hesaplar.
// Ayrıca for ve for-each döngülerini birlikte nasıl kullanabileceğimizi gösterir.

import java.util.Scanner;

public class ArrayStatistics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 🔹 Kullanıcıdan dizi boyutunu alma
        System.out.print("Kaç adet sayı gireceksiniz? ");
        int n = input.nextInt();

        // 🔹 Dizi oluşturma (kullanıcının gireceği sayıları tutacak)
        int[] numbers = new int[n];

        // 🔹 Diziye kullanıcıdan değer atama
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". sayıyı girin: ");
            numbers[i] = input.nextInt();
        }

        // 🔹 Toplam, min, max hesaplama
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

        // 🔹 Sonuçları yazdırma
        System.out.println("\n--- İstatistik Sonuçları ---");
        System.out.println("Toplam: " + sum);
        System.out.println("Ortalama: " + average);
        System.out.println("En Küçük: " + min);
        System.out.println("En Büyük: " + max);

        input.close();
    }
}
