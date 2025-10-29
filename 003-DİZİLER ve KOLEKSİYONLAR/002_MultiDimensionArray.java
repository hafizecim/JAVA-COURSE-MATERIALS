// 📘 002_MultiDimensionArray.java
// 🎯 Konu: Çok Boyutlu (2D) Dizi
// 👩‍💻 Yazan: Hafize Şenyıl
// 🧠 Amaç: Matris yapısını anlamak ve tablo biçiminde veri yazdırmak

public class MultiDimensionArray {

    public static void main(String[] args) {

        // 🔹 2x3 boyutunda bir matris oluşturuluyor
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // 🔹 Matrisin elemanlarını tablo biçiminde yazdır
        System.out.println("Matris içeriği:");
        for (int i = 0; i < matrix.length; i++) { // satır
            for (int j = 0; j < matrix[i].length; j++) { // sütun
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // bir satır bittiğinde alt satıra geç
        }
    }
}
