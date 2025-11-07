// 022_LinkedHashMapSira.java

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapSira {
    public static void main(String[] args) {
        
        // 1. LinkedHashMap Tanımlama
        // String (Anahtar) -> Kullanıcı Adı, Integer (Değer) -> Kullanıcı ID
        Map<String, Integer> kullaniciSirasi = new LinkedHashMap<>(); 
        
        System.out.println("--- 1. Eleman Ekleme (put) ---");
        
        // Elemanlar eklenme sırasına göre tutulacaktır: Ayşe, Mehmet, Zeynep, Ali
        kullaniciSirasi.put("Ayşe", 101);
        kullaniciSirasi.put("Mehmet", 102);
        kullaniciSirasi.put("Zeynep", 103);
        kullaniciSirasi.put("Ali", 104);
        
        // Çıktı, eklenme sırasını koruyacaktır.
        System.out.println("Haritanın eklenme sırasına göre hali: " + kullaniciSirasi);
        
        System.out.println("\n--- 2. Anahtar Güncelleme ve Sınır Kuralı ---");
        
        // Anahtarı güncelleme: Aynı anahtar ile yeni değer eklenirse
        // **sıra bozulmaz**, sadece değer değişir.
        kullaniciSirasi.put("Mehmet", 202); 
        System.out.println("Mehmet güncellendi. Yeni Harita Hali: " + kullaniciSirasi);
        // Mehmet hala ikinci sırada.

        System.out.println("\n--- 3. Harita Üzerinde Sıralı Döngü ---");
        // LinkedHashMap, for-each döngüsünde elemanları eklenme sırasına göre verir.
        System.out.println("Kullanıcıların Kayıt Sırası:");
        for (String ad : kullaniciSirasi.keySet()) {
            System.out.println("Kullanıcı: " + ad + ", ID: " + kullaniciSirasi.get(ad));
        }

        System.out.println("\n--- 4. Eleman Silme ---");
        // Silme işlemi, sırayı etkilemez.
        kullaniciSirasi.remove("Zeynep");
        System.out.println("Zeynep silindi. Kalanların sırası: " + kullaniciSirasi);
        // Sırada Ayşe, Mehmet, Ali kaldı.
        
        System.out.println("\n--- 5. Erişim Sırasına Göre LinkedHashMap (Ek Bilgi) ---");
        // LinkedHashMap, performans ölçümü veya LRU Cache (En Son Kullanılanı Kaldır) gibi 
        // durumlar için erişim sırasına göre de yapılandırılabilir.
        LinkedHashMap<String, String> erisimSirasi = new LinkedHashMap<>(16, 0.75f, true);
        erisimSirasi.put("a", "A");
        erisimSirasi.put("b", "B");
        erisimSirasi.put("c", "C");
        erisimSirasi.get("a"); // 'a' ya erişildi.
        erisimSirasi.get("b"); // 'b' ye erişildi.
        // Bu durumda 'c' ilk, 'a' ikinci, 'b' ise son sırada olur (en son erişilen).
        System.out.println("Erişim sırasına göre örnek: " + erisimSirasi);
    }
}