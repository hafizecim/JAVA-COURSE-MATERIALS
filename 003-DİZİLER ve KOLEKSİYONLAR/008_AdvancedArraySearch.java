// 📘 008_AdvancedArraySearch.java
// 🎯 Konu: Dizide Eleman Arama, Tekrar Sayısı ve İlk/Son Index Bulma
// 👩‍💻 Yazan: Hafize Şenyıl
// 🧠 Amaç: Döngüler kullanarak bir dizideki elemanların frekansını ve konumlarını bulmayı öğrenmek

import java.util.Scanner;
import java.util.Arrays;

public class AdvancedArraySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] data = {3, 7, 3, 1, 9, 3, 5, 9, 3, 7, 5}; // Tekrar eden değerler
        final int N = data.length;

        System.out.println("Veri Dizisi: " + Arrays.toString(data));
        System.out.print("Aramak istediğiniz sayıyı girin: ");
        int target = in.nextInt();

        int count = 0;
        int firstIndex = -1; // Aranan değerin bulunduğu ilk index
        int lastIndex = -1;  // Aranan değerin bulunduğu son index

        // --- 1. Tekrar Sayısı ve İlk Index Bulma (Klasik for döngüsü kullanılıyor) ---
        
        for (int i = 0; i < N; i++) {
            if (data[i] == target) {
                count++;
                
                // İlk kez bulunduğunda indexi kaydet
                if (firstIndex == -1) {
                    firstIndex = i;
                    
                    // 💡 İlk index bulunduktan sonra döngüyü kesmek istiyorsak:
                    // break; // Bu komut, daha hızlı sonuç için kullanılabilir (Eğer sadece ilkini arıyorsak)
                }
                
                // Her bulduğumuzda son indexi güncelliyoruz
                lastIndex = i; 
            }
        }

        System.out.println("\n--- ARAMA SONUÇLARI ---");

        if (count > 0) {
            System.out.println(target + " sayısı dizide " + count + " kez geçti.");
            System.out.println("Bulunduğu İlk Index: " + firstIndex);
            System.out.println("Bulunduğu Son Index: " + lastIndex);
            
        } else {
            System.out.println(target + " sayısı dizide bulunamadı.");
        }
        
        // --- 2. Hızlı Bulunma Kontrolü (Bayrak kullanımı ve break) ---
        
        boolean found = false; // Bayrak (Flag)
        
        for (int num : data) {
            if (num == target) {
                found = true;
                break; // İlk buluşta döngüyü kes, performansı artır
            }
        }
        
        System.out.println("\n--- Hızlı Kontrol ---");
        System.out.println("Aranan değer dizide var mı? " + (found ? "Evet" : "Hayır"));

        in.close();
    }
}