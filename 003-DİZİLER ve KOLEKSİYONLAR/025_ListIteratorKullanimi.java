// 025_ListIteratorKullanimi.java

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorKullanimi {
    public static void main(String[] args) {
        
        // 1. List Tanımlama
        List<String> harfler = new ArrayList<>();
        harfler.add("A");
        harfler.add("B");
        harfler.add("C");
        harfler.add("D");
        
        System.out.println("Başlangıç Listesi: " + harfler); // [A, B, C, D]
        
        // 2. ListIterator Nesnesi Alma
        // listIterator() metodu, List'ten bir ListIterator döndürür.
        ListIterator<String> listIterator = harfler.listIterator();
        
        System.out.println("\n--- 3. İleri Yönde Gezinme ve Değiştirme (set/add) ---");
        
        // İleri yönde gezinme (hasNext() ve next())
        while (listIterator.hasNext()) {
            String mevcutHarf = listIterator.next();
            
            if (mevcutHarf.equals("B")) {
                // set(): En son next() tarafından döndürülen elemanı günceller.
                listIterator.set("B_Güncel");
            }
            if (mevcutHarf.equals("C")) {
                // add(): Mevcut imleç pozisyonuna yeni eleman ekler (C'den önce).
                listIterator.add("C_Yeni");
            }
        }
        
        System.out.println("İleri gezinme sonrası Liste: " + harfler); 
        // Çıktı: [A, B_Güncel, C_Yeni, C, D]
        
        System.out.println("\n--- 4. Geri Yönde Gezinme (Ters Sıra) ---");
        
        // Listenin sonuna ulaştık (3. adımda). Şimdi geri dönebiliriz.
        // hasPrevious(): Sırada geriye doğru başka eleman olup olmadığını kontrol eder.
        while (listIterator.hasPrevious()) {
            // previous(): Sırada olan elemanı alır ve imleci geriye ilerletir.
            String mevcutHarf = listIterator.previous();
            
            System.out.println("Geriye doğru okunan: " + mevcutHarf);
            
            if (mevcutHarf.equals("D")) {
                // remove(): En son previous() (veya next()) tarafından döndürülen elemanı siler.
                listIterator.remove();
                System.out.println("-> D silindi.");
            }
        }
        
        System.out.println("\n--- 5. Sonuç ---");
        System.out.println("Son Liste Hali: " + harfler); 
        // Çıktı: [A, B_Güncel, C_Yeni, C] (D silindi)
        
        System.out.println("\n--- 6. Ek Bilgi: Index Metotları ---");
        // nextIndex(): next() çağrıldığında dönecek elemanın indeksini verir.
        System.out.println("Geri dönüldüğü için nextIndex(): " + listIterator.nextIndex()); // 0
        // previousIndex(): previous() çağrıldığında dönecek elemanın indeksini verir.
        System.out.println("Geri dönüldüğü için previousIndex() -1'dir: " + listIterator.previousIndex()); // -1
    }
}