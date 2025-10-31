// 📘 007_GradesAnalysis.java
// 🎯 Konu: Dizi ile Not Analizi (Ortalama, Min/Max, Geçme/Kalma Sayısı, Mod)
// 👩‍💻 Yazan: Hafize Şenyıl
// 🧠 Amaç: Not dizisi üzerinde istatistiksel ve mantıksal analiz yapmayı öğrenmek

import java.util.Scanner;
import java.util.Arrays;

public class GradesAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PASSING_GRADE = 60.0; // Geçme notu sabitini tanımlama

        System.out.print("Kaç ders notu gireceksiniz? ");
        int lessonCount = sc.nextInt();

        double[] grades = new double[lessonCount];

        for (int i = 0; i < grades.length; i++) {
            System.out.print((i + 1) + ". ders notu: ");
            grades[i] = sc.nextDouble();
        }

        // --- 1. Ortalama ve Geçme/Kalma Sayısı Hesaplama ---
        
        double total = 0;
        int passedLessons = 0; // Geçilen ders sayısı

        // En düşük ve en yüksek notu Arrays.sort kullanmadan hesaplamak için başlangıç değerleri
        double min = grades[0]; 
        double max = grades[0];

        for (double grade : grades) {
            total += grade;
            
            // Geçme/Kalma Sayısı
            if (grade >= PASSING_GRADE) {
                passedLessons++;
            }
            
            // Min/Max hesaplaması (Sıralama kullanmadan)
            if (grade < min) min = grade;
            if (grade > max) max = grade;
        }
        
        double avg = total / grades.length;
        int failedLessons = grades.length - passedLessons;
        
        // --- 2. Mod (En Sık Tekrar Eden Not) Hesaplama ---
        
        // Mod hesaplamak için dizi elemanlarını sıralıyoruz
        Arrays.sort(grades); 
        
        double mode = -1; // Mod değeri
        int maxCount = 0;  // En yüksek tekrar sayısı
        
        if (grades.length > 0) {
            int currentCount = 0;
            mode = grades[0]; // İlk elemanı varsayılan mod olarak ata
            
            for (int i = 0; i < grades.length; i++) {
                currentCount++;
                
                // Eğer dizi bitmediyse ve sonraki eleman şimdiki elemana eşit değilse VEYA dizi bittiyse
                if (i + 1 == grades.length || grades[i] != grades[i+1]) {
                    if (currentCount > maxCount) {
                        maxCount = currentCount;
                        mode = grades[i];
                    }
                    currentCount = 0; // Sayacı sıfırla
                }
            }
        }


        // 🔹 Sonuçları yazdırma
        System.out.println("\n--- DETAYLI NOT ANALİZİ ---");
        System.out.println("Tüm notlar (Sıralı): " + Arrays.toString(grades));
        System.out.printf("Ortalama: %.2f\n", avg);
        System.out.println("En Düşük Not: " + min);
        System.out.println("En Yüksek Not: " + max);
        System.out.println("Mod (En sık tekrar eden): " + mode + " (" + maxCount + " kez)");


        // 🔹 Geçme/Kalma Durumu ve Detayları
        System.out.println("\n--- GENEL DURUM ---");
        System.out.println("Geçilen Ders Sayısı: " + passedLessons);
        System.out.println("Kalan Ders Sayısı: " + failedLessons);
        
        if (avg >= PASSING_GRADE)
            System.out.println("Dönem Durumu: Ortalama ile Geçtiniz! 🎉");
        else
            System.out.println("Dönem Durumu: Ortalama ile Kaldınız ❌");

        sc.close();
    }
}