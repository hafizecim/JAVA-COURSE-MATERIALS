// 📘 011_HashSetExample.java
// HashSet: Aynı elemanı iki kez tutmaz. Eleman sırası garanti edilmez.

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Apple"); // tekrar eklense de yalnızca bir kez tutulur

        System.out.println("Meyveler: " + fruits);

        // 🔹 Eleman kontrolü
        System.out.println("Banana var mı? " + fruits.contains("Banana"));

        // 🔹 Eleman silme
        fruits.remove("Cherry");
        System.out.println("Cherry silindikten sonra: " + fruits);

        // 🔹 Boyut öğrenme
        System.out.println("Meyve sayısı: " + fruits.size());
    }
}
