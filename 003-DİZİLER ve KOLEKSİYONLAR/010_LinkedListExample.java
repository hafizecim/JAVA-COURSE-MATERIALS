// 📘 010_LinkedListExample.java
// LinkedList: Eleman ekleme ve silmede ArrayList'ten daha hızlı çalışır.
// Özellikle listede baştan veya ortadan sık işlem yapılıyorsa tercih edilir.

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();

        // 🔹 Kuyruk (Queue) gibi çalışma
        queue.add("Ahmet");
        queue.add("Mehmet");
        queue.add("Ayşe");
        queue.add("Fatma");

        System.out.println("Kuyruk: " + queue);

        // 🔹 İlk geleni çıkar
        String first = queue.removeFirst();
        System.out.println("İlk çıkan: " + first);
        System.out.println("Kuyruk Son Durum: " + queue);

        // 🔹 Sona ekleme
        queue.addLast("Hafize");
        System.out.println("Yeni Kuyruk: " + queue);

        // 🔹 İlk elemanı görüntüleme (ama silmeden)
        System.out.println("Sıradaki kişi: " + queue.peekFirst());
    }
}
