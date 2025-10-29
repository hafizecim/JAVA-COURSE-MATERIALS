// 📘 006_MatrixSumDiagonal.java
// Bu örnek, 2 boyutlu diziler (matrisler) üzerinde çalışmayı gösterir.
// Amaç: 3x3 boyutlu bir matrisin hem eleman toplamını hem de ana köşegen (diagonal) toplamını bulmak.

import java.util.Scanner;

public class MatrixSumDiagonal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matrix = new int[3][3]; // 3x3 matris

        System.out.println("3x3 matrisin elemanlarını giriniz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Eleman [" + i + "][" + j + "]: ");
                matrix[i][j] = scan.nextInt();
            }
        }

        int totalSum = 0;
        int diagonalSum = 0;

        // 🔹 Hem toplam hem köşegen toplamını hesaplama
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                totalSum += matrix[i][j];
                if (i == j) diagonalSum += matrix[i][j]; // köşegen koşulu
            }
        }

        // 🔹 Sonuçlar
        System.out.println("\n--- Matris Bilgileri ---");
        System.out.println("Matris Elemanları:");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        System.out.println("Tüm Elemanların Toplamı: " + totalSum);
        System.out.println("Ana Köşegen Toplamı: " + diagonalSum);
    }
}
