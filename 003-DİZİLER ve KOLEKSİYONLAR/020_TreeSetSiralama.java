// 020_TreeSetSiralama.java

import java.util.Set;
import java.util.TreeSet;

public class TreeSetSiralama {
    public static void main(String[] args) {
        
        // 1. TreeSet Tanımlama (String'ler için alfabetik sıralama kullanılır)
        Set<String> kelimeler = new TreeSet<>(); 
        
        System.out.println("--- 1. Eleman Ekleme ve Otomatik Sıralama ---");
        // Elemanlar karışık sırada ekleniyor
        kelimeler.add("Portakal");
        kelimeler.add("Muz");
        kelimeler.add("Elma");
        kelimeler.add("Muz"); // Tekrar eden eleman (eklenmeyecek)
        
        // TreeSet, çıktı verirken elemanları otomatik olarak sıralar (Elma, Muz, Portakal)
        System.out.println("Sıralı Set İçeriği: " + kelimeler); 
        System.out.println("Toplam eleman sayısı: " + kelimeler.size()); // 3 (Muz bir kez sayılır)
        
        System.out.println("\n--- 2. Sayısal Sıralama Örneği ---");
        Set<Integer> sayilar = new TreeSet<>();
        
        sayilar.add(50);
        sayilar.add(10);
        sayilar.add(80);
        sayilar.add(30);
        
        // Sayılar otomatik olarak küçükten büyüğe sıralanır (10, 30, 50, 80)
        System.out.println("Sıralı Sayılar: " + sayilar); 
        
        System.out.println("\n--- 3. TreeSet'e Özgü Metotlar (NavigableSet) ---");
        // TreeSet, sıralı olduğu için ek metotlar sunar.
        
        // first(): En küçük (ilk) elemanı döndürür.
        System.out.println("En küçük sayı: " + sayilar.first()); // 10
        // last(): En büyük (son) elemanı döndürür.
        System.out.println("En büyük sayı: " + sayilar.last());   // 80
        
        // higher(e): Verilen elemandan kesinlikle büyük olan en küçük elemanı döndürür.
        System.out.println("50'den hemen sonraki sayı: " + sayilar.higher(50)); // 80
        // lower(e): Verilen elemandan kesinlikle küçük olan en büyük elemanı döndürür.
        System.out.println("50'den hemen önceki sayı: " + sayilar.lower(50));  // 30
        
        // headSet(e): Belirtilen elemandan kesinlikle küçük olan tüm elemanları döndürür.
        System.out.println("50'den küçük elemanlar (headSet(50)): " + sayilar.headSet(50)); // [10, 30]
        
        // tailSet(e): Belirtilen elemana eşit veya ondan büyük olan tüm elemanları döndürür.
        System.out.println("30 veya 30'dan büyük elemanlar (tailSet(30)): " + sayilar.tailSet(30)); // [30, 50, 80]
        
        System.out.println("\n--- 4. Eleman Silme ---");
        // pollFirst(): En küçük elemanı siler ve döndürür.
        System.out.println("Silinen en küçük sayı: " + sayilar.pollFirst()); // 10
        System.out.println("Güncel Set: " + sayilar);
    }
}