// 024_IteratorKullanimi.java

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorKullanimi {
    public static void main(String[] args) {
        
        // 1. ArrayList Tanımlama
        List<String> urunler = new ArrayList<>();
        urunler.add("Laptop");
        urunler.add("Mouse");
        urunler.add("Klavye");
        urunler.add("Mouse"); // Tekrar eden eleman
        urunler.add("Monitör");
        
        System.out.println("Başlangıç Listesi: " + urunler);
        
        // 2. Iterator Nesnesi Alma
        // iterator() metodu, koleksiyondan bir Iterator nesnesi döndürür.
        Iterator<String> iterator = urunler.iterator();
        
        System.out.println("\n--- 3. Iterator ile Gezinme ve Silme ---");
        
        // hasNext(): Sırada başka eleman olup olmadığını kontrol eder. (true/false)
        while (iterator.hasNext()) {
            // next(): Sırada olan elemanı alır ve imleci bir sonraki elemana ilerletir.
            String mevcutUrun = iterator.next(); 
            
            System.out.println("Şu anki ürün: " + mevcutUrun);
            
            // Güvenli Silme: Eğer ürün "Mouse" ise sil
            if (mevcutUrun.equals("Mouse")) {
                // remove(): next() tarafından en son döndürülen elemanı siler.
                // **Not:** Bu işlem, List'in kendi remove() metodu ile döngü kurmaktan daha güvenlidir.
                iterator.remove(); 
                System.out.println("-> Mouse silindi.");
            }
        }
        
        System.out.println("\n--- 4. Sonuç ---");
        System.out.println("Iterator ile gezinme ve silme sonrası Liste: " + urunler);
        // Tüm "Mouse" elemanları silinmiştir.
        
        // 5. Basit Gezinme Örneği (Silme Yapmadan)
        System.out.println("\n--- 5. Tekrar Gezinme ---");
        
        // Iterator bir kez kullanıldıktan sonra sıfırlanmaz, bu yüzden yeniden almalıyız.
        iterator = urunler.iterator(); 
        
        while (iterator.hasNext()) {
             // Gezinti sırasında sadece okuma yaparız.
             System.out.println("Kalan Ürün: " + iterator.next()); 
        }
    }
}