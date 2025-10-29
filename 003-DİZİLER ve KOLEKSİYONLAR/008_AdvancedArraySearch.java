// 📘 008_AdvancedArraySearch.java
// Bu örnekte, bir dizide belirli bir değerin kaç kez geçtiğini bulacağız.
// Kullanıcıdan aramak istediği sayıyı alır ve kaç tane bulunduğunu gösterir.
// Ek olarak, aranan değer yoksa uygun mesaj verir.

import java.util.Scanner;
import java.util.Arrays;

public class AdvancedArraySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] data = {3, 7, 3, 1, 9, 3, 5, 9, 3};

        System.out.println("Veri Dizisi: " + Arrays.toString(data));
        System.out.print("Aramak istediğiniz sayıyı girin: ");
        int target = in.nextInt();

        int count = 0;

        // 🔹 Dizi üzerinde arama yapıyoruz
        for (int num : data) {
            if (num == target) {
                count++;
            }
        }

        if (count > 0)
            System.out.println(target + " sayısı dizide " + count + " kez geçti.");
        else
            System.out.println(target + " sayısı dizide bulunamadı.");

        in.close();
    }
}
