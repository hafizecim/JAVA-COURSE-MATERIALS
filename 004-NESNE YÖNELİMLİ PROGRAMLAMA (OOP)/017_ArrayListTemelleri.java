// 017_ArrayListTemelleri.java

import java.util.ArrayList; // ArrayList sınıfını kullanmak için import ediyoruz
import java.util.List; // Daha genel olan List arayüzünü kullanmak iyi bir uygulamadır.

public class ArrayListTemelleri {
    public static void main(String[] args) {
        
        // 1. ArrayList Tanımlama ve Nesne Oluşturma
        // <> içindeki ifade (String), listede hangi türde veri tutulacağını belirtir (Generics).
        List<String> sehirler = new ArrayList<>(); 
        
        System.out.println("--- 1. Eleman Ekleme (add) ---");
        // add(eleman): Listenin sonuna eleman ekler.
        sehirler.add("İstanbul");
        sehirler.add("Ankara");
        sehirler.add("İzmir");
        sehirler.add("İstanbul"); // Listeler tekrar eden elemanlara izin verir.
        
        // add(index, eleman): Belirtilen indekse eleman ekler.
        sehirler.add(1, "Bursa");
        
        System.out.println("Listenin şu anki hali: " + sehirler);
        
        System.out.println("\n--- 2. Eleman Sayısı ve Durum Kontrolü ---");
        // size(): Listedeki eleman sayısını döndürür.
        System.out.println("Toplam şehir sayısı: " + sehirler.size()); // 5
        // contains(): Belirtilen elemanın listede olup olmadığını kontrol eder.
        System.out.println("Listede Ankara var mı? " + sehirler.contains("Ankara")); // true
        // isEmpty(): Liste boşsa true, doluysa false döndürür.
        System.out.println("Liste boş mu? " + sehirler.isEmpty()); // false

        System.out.println("\n--- 3. Elemana Erişim (get) ---");
        // get(index): Belirtilen indeksteki elemanı döndürür.
        String ilkSehir = sehirler.get(0);
        System.out.println("Listenin ilk elemanı: " + ilkSehir); // İstanbul
        
        // indexOf(): Bir elemanın listedeki ilk bulunduğu indeksi döndürür.
        System.out.println("İzmir'in indeksi: " + sehirler.indexOf("İzmir")); // 3
        
        System.out.println("\n--- 4. Eleman Silme ve Güncelleme ---");
        // set(index, yeni_eleman): Belirtilen indeksteki elemanı günceller.
        sehirler.set(4, "Antalya");
        System.out.println("4. indeksteki eleman güncellendi: " + sehirler); 
        
        // remove(index): Belirtilen indeksteki elemanı siler.
        String silinen = sehirler.remove(4);
        System.out.println(silinen + " (4. index) listeden silindi: " + sehirler); // Antalya silindi
        
        // remove(eleman): Belirtilen elemanın ilk bulunduğu yeri siler.
        sehirler.remove("İstanbul"); 
        System.out.println("Bir İstanbul silindi: " + sehirler); // İlk İstanbul silinir.

        System.out.println("\n--- 5. Listeyi Temizleme ---");
        // clear(): Listedeki tüm elemanları siler.
        sehirler.clear();
        System.out.println("Liste temizlendi. Şu anki eleman sayısı: " + sehirler.size()); // 0
        System.out.println("Liste boş mu? " + sehirler.isEmpty()); // true
    }
}