// 018_LinkedListTemelleri.java

import java.util.LinkedList;
import java.util.List;

public class LinkedListTemelleri {
    public static void main(String[] args) {
        
        // 1. LinkedList Tanımlama
        LinkedList<String> siraliIslemler = new LinkedList<>(); 
        
        System.out.println("--- 1. Temel Ekleme İşlemleri ---");
        siraliIslemler.add("Giriş Yap");
        siraliIslemler.add("Ürün Seç");
        siraliIslemler.add("Sepete Ekle");
        siraliIslemler.add("Ödeme Yap");
        
        System.out.println("Başlangıç listesi: " + siraliIslemler);

        System.out.println("\n--- 2. LinkedList'e Özgü Metotlar (Queue/Deque) ---");
        
        // addFirst / addLast: Listenin başına veya sonuna hızlı ekleme yapar.
        siraliIslemler.addFirst("Uygulamayı Aç");
        siraliIslemler.addLast("Çıkış Yap");
        System.out.println("Genişletilmiş liste: " + siraliIslemler);
        
        // getFirst / getLast: Listenin başındaki/sonundaki elemanı döndürür (hızlı erişim).
        System.out.println("Yapılacak ilk işlem: " + siraliIslemler.getFirst()); // Uygulamayı Aç
        System.out.println("Yapılacak son işlem: " + siraliIslemler.getLast());   // Çıkış Yap

        System.out.println("\n--- 3. Ortadan Silme İşlemi (Hızlıdır) ---");
        // add(index, eleman): Ortaya ekleme (ArrayList'e göre daha hızlı olabilir).
        siraliIslemler.add(3, "Adresi Gir"); 
        System.out.println("Adres eklemesi sonrası: " + siraliIslemler);
        
        // remove(index): Ortadan silme (ArrayList'e göre daha hızlı olabilir).
        String silinenIslem = siraliIslemler.remove(3);
        System.out.println(silinenIslem + " işlemi silindi: " + siraliIslemler);
        
        System.out.println("\n--- 4. Queue (Kuyruk) Benzeri İşlemler ---");
        // LinkedList, aynı zamanda Queue (Kuyruk) arayüzünü de uygular.
        
        // poll(): Listenin başındaki elemanı alır ve listeden siler (FIFO - İlk Giren İlk Çıkar)
        String kuyruktanCikan = siraliIslemler.poll();
        System.out.println("Kuyruktan çıkan (poll): " + kuyruktanCikan); // Uygulamayı Aç
        System.out.println("Poll sonrası liste: " + siraliIslemler);
        
        // peek(): Listenin başındaki elemanı sadece okur, silmez.
        System.out.println("Sıradaki işlem (peek): " + siraliIslemler.peek()); // Giriş Yap

        // removeFirst / removeLast: Baştan ve sondan silme (çok hızlıdır).
        siraliIslemler.removeFirst();
        siraliIslemler.removeLast();
        System.out.println("İki işlem daha silindi: " + siraliIslemler);
    }
}