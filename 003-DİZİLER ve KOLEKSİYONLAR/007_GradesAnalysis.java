// 📘 007_GradesAnalysis.java
// Bir öğrencinin notlarını analiz eden bir program.
// Dizi içinde öğrencinin notlarını tutar ve ortalama, en yüksek ve düşük notu hesaplar.
// Ayrıca öğrencinin geçip geçmediğini ortalama ile değerlendirir.

import java.util.Scanner;
import java.util.Arrays;

public class GradesAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kaç ders notu gireceksiniz? ");
        int lessonCount = sc.nextInt();

        double[] grades = new double[lessonCount];

        for (int i = 0; i < grades.length; i++) {
            System.out.print((i + 1) + ". ders notu: ");
            grades[i] = sc.nextDouble();
        }

        // 🔹 Ortalama hesaplama
        double total = 0;
        for (double grade : grades) {
            total += grade;
        }
        double avg = total / grades.length;

        // 🔹 Notları sıralama (küçükten büyüğe)
        Arrays.sort(grades);

        // 🔹 En düşük ve en yüksek not
        double min = grades[0];
        double max = grades[grades.length - 1];

        System.out.println("\n--- NOT ANALİZİ ---");
        System.out.println("Tüm notlar: " + Arrays.toString(grades));
        System.out.println("En Düşük Not: " + min);
        System.out.println("En Yüksek Not: " + max);
        System.out.println("Ortalama: " + avg);

        if (avg >= 60)
            System.out.println("Durum: Geçtiniz 🎉");
        else
            System.out.println("Durum: Kaldınız ❌");

        sc.close();
    }
}
