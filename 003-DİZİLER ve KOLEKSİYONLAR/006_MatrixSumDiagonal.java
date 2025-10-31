// 📘 006_MatrixSumDiagonal.java
// 🎯 Konu: Matris İşlemleri (Tüm Elemanlar, Ana Köşegen, Ters Köşegen Toplamları)
// 👩‍💻 Yazan: Hafize Şenyıl
// 🧠 Amaç: NxN matris üzerinde iç içe döngülerle koşullu toplamları hesaplamayı öğrenmek

import java.util.Scanner;

public class MatrixSumDiagonal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 🔹 Matrisin boyutunu kullanıcıdan alma (NxN kare matris)
        System.out.print("Matrisin boyutunu giriniz (N): ");
        int N = scan.nextInt();

        int[][] matrix = new int[N][N]; // NxN matris

        System.out.println(N + "x" + N + " matrisin elemanlarını giriniz:");
        
        // --- 1. Matris Elemanlarını Kullanıcıdan Alma ---
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("Eleman [" + i + "][" + j + "]: ");
                matrix[i][j] = scan.nextInt();
            }
        }

        int totalSum = 0;
        int mainDiagonalSum = 0;
        int antiDiagonalSum = 0; // Ters Köşegen Toplamı

        // --- 2. Toplam ve Köşegen Toplamlarını Hesaplama ---
        for (int i = 0; i < N; i++) { // Satır indeksi
            for (int j = 0; j < N; j++) { // Sütun indeksi
                
                totalSum += matrix[i][j];

                // 🔹 Ana Köşegen Koşulu: Satır indeksi Sütun indeksine eşit olmalı (i == j)
                if (i == j) {
                    mainDiagonalSum += matrix[i][j];
                }
                
                // 🔹 Ters Köşegen Koşulu: Satır indeksi + Sütun indeksi = N - 1 olmalı
                // (Örn: 3x3 matris için (0, 2), (1, 1), (2, 0))
                if (i + j == N - 1) {
                    antiDiagonalSum += matrix[i][j];
                }
            }
        }

        // 🔹 Sonuçları yazdırma
        System.out.println("\n--- Matris Bilgileri ---");
        
        // Matrisi Tablo Halinde Yazdırma
        System.out.println(N + "x" + N + " Matris:");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%4d", value); // 4 karakter boşluk bırakarak hizalı yazdır
            }
            System.out.println();
        }

        System.out.println("\nTüm Elemanların Toplamı: " + totalSum);
        System.out.println("Ana Köşegen Toplamı (i == j): " + mainDiagonalSum);
        System.out.println("Ters Köşegen Toplamı (i + j == N - 1): " + antiDiagonalSum);

        scan.close();
    }
}