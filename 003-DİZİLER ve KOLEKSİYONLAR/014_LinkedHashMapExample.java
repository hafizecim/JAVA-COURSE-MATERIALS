// 📘 014_LinkedHashMapExample.java
// LinkedHashMap: HashMap gibi çalışır ama ekleme sırasını korur.

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, String> capitals = new LinkedHashMap<>();

        capitals.put("Türkiye", "Ankara");
        capitals.put("Fransa", "Paris");
        capitals.put("Japonya", "Tokyo");

        System.out.println("Ülke - Başkent Listesi (Ekleme Sırasıyla):");
        for (String country : capitals.keySet()) {
            System.out.println(country + " ➡️ " + capitals.get(country));
        }

        // 🔹 Bir elemanı kaldırma
        capitals.remove("Fransa");
        System.out.println("Güncel Liste: " + capitals);
    }
}
