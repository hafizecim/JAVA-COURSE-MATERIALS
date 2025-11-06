// 023_TreeMapSiralama.java

import java.util.Map;
import java.util.TreeMap;

public class TreeMapSiralama {
    public static void main(String[] args) {
        
        // 1. TreeMap Tanımlama
        // Integer (Anahtar) -> Personel ID, String (Değer) -> Personel Adı
        Map<Integer, String> personelListesi = new TreeMap<>(); 
        
        System.out.println("--- 1. Eleman Ekleme ve Otomatik Sıralama ---");
        
        // Anahtarlar karışık sırada giriliyor
        personelListesi.put(305, "Deniz");
        personelListesi.put(101, "Ece");
        personelListesi.put(502, "Furkan");
        personelListesi.put(203, "Can");
        
        // Çıktı, anahtarların sayısal sırasına göre olacaktır (101, 203, 305, 502).
        System.out.println("Haritanın ID'ye göre sıralı hali: " + personelListesi);
        
        System.out.println("\n--- 2. TreeMap'e Özgü Metotlar (NavigableMap) ---");
        TreeMap<Integer, String> treeMap = (TreeMap<Integer, String>) personelListesi;
        
        // firstKey(): En küçük anahtarı döndürür.
        System.out.println("En düşük ID (firstKey): " + treeMap.firstKey()); // 101
        // lastEntry(): En büyük anahtarı ve değerini içeren Map.Entry nesnesini döndürür.
        System.out.println("En yüksek ID (lastEntry): " + treeMap.lastEntry()); // 502=Furkan
        
        // higherKey(k): Belirtilen anahtardan kesinlikle büyük olan en küçük anahtarı döndürür.
        System.out.println("305'ten büyük ilk ID (higherKey): " + treeMap.higherKey(305)); // 502
        
        // floorKey(k): Belirtilen anahtara eşit veya ondan küçük olan en büyük anahtarı döndürür.
        System.out.println("250'ye eşit veya küçük en büyük ID (floorKey): " + treeMap.floorKey(250)); // 203

        System.out.println("\n--- 3. Alt Harita Alma İşlemi ---");
        // subMap(fromKey, toKey): Belirtilen aralıktaki tüm çiftleri içeren yeni bir Map döndürür.
        // 203 dahil, 502 hariç
        Map<Integer, String> araListe = treeMap.subMap(203, 502);
        System.out.println("ID 203'ten başlayıp, 502'den küçük olanlar: " + araListe); 
        
        System.out.println("\n--- 4. Silme ---");
        // pollFirstEntry(): En küçük anahtar-değer çiftini siler ve döndürür.
        System.out.println("Silinen ilk kayıt: " + treeMap.pollFirstEntry()); // 101=Ece
        System.out.println("Güncel Harita: " + personelListesi);
    }
}