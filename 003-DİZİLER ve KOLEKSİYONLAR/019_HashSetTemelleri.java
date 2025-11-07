// 019_HashSetTemelleri.java

import java.util.HashSet;
import java.util.Set; // Genel Set arayüzünü kullanmak iyi bir uygulamadır.

public class HashSetTemelleri {
    public static void main(String[] args) {
        
        // 1. HashSet Tanımlama ve Nesne Oluşturma
        Set<String> diller = new HashSet<>(); 
        
        System.out.println("--- 1. Eleman Ekleme (add) ve Benzersizlik ---");
        // add() metodu:
        diller.add("Java");
        diller.add("Python");
        diller.add("C++");
        
        // Tekrar eden eleman ekleme denemesi
        boolean eklendi1 = diller.add("Java"); // Zaten var olduğu için eklenmeyecek
        boolean eklendi2 = diller.add("Go");    // Yeni olduğu için eklenecek
        
        System.out.println("Set'in içeriği (Sıra Önemli Değil): " + diller);
        System.out.println("'Java' tekrar eklendi mi? (false beklenir): " + eklendi1); 
        System.out.println("'Go' eklendi mi? (true beklenir): " + eklendi2); 
        
        System.out.println("\n--- 2. Eleman Sayısı ve Kontrol ---");
        // size(): Benzersiz eleman sayısını verir.
        System.out.println("Toplam benzersiz dil sayısı: " + diller.size()); // 4
        // contains(): Elemanın sette olup olmadığını kontrol eder.
        System.out.println("Set'te 'Python' var mı? " + diller.contains("Python")); // true

        System.out.println("\n--- 3. Eleman Silme (remove) ---");
        // remove(): Belirtilen elemanı siler.
        boolean silindi = diller.remove("C++");
        System.out.println("'C++' silindi mi? (true beklenir): " + silindi); 
        System.out.println("Set'in güncel hali: " + diller);
        
        // Olmayan bir elemanı silme denemesi
        boolean silinmedi = diller.remove("Pascal");
        System.out.println("'Pascal' silinmeye çalışıldı mı? (false beklenir): " + silinmedi); 
        
        System.out.println("\n--- 4. Set'ler Arası İşlemler (Ek Bilgi) ---");
        // Yeni bir Set oluşturalım
        Set<String> yeniDiller = new HashSet<>();
        yeniDiller.add("Java");
        yeniDiller.add("Swift");

        // retainAll(): Kesişim kümesini bulur (Ortak elemanları tutar, diğerlerini siler).
        // diller.retainAll(yeniDiller); 
        // System.out.println("Kesişim (retainAll) sonrası diller: " + diller); // Sadece "Java" kalır

        // addAll(): Birleşim kümesini oluşturur (Diğer setin elemanlarını ekler).
        // diller.addAll(yeniDiller);
        // System.out.println("Birleşim (addAll) sonrası diller: " + diller); // Java, Python, Go, Swift
    }
}