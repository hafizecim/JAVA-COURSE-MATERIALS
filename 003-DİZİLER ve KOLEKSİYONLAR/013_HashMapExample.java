// 📘 013_HashMapExample.java
// HashMap: Anahtar–Değer (Key–Value) tabanlı bir yapıdır. Key’ler benzersizdir.

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> ages = new HashMap<>();

        // 🔹 Veri ekleme
        ages.put("Ahmet", 25);
        ages.put("Ayşe", 30);
        ages.put("Hafize", 28);
        ages.put("Seda", 25);

        System.out.println("Yaş Bilgileri: " + ages);

        // 🔹 Belirli anahtardan değer alma
        System.out.println("Ayşe'nin yaşı: " + ages.get("Ayşe"));

        // 🔹 Tüm anahtarlar ve değerler
        System.out.println("Tüm isimler: " + ages.keySet());
        System.out.println("Tüm yaşlar: " + ages.values());

        // 🔹 Değer güncelleme
        ages.put("Ahmet", 26);
        System.out.println("Ahmet'in yeni yaşı: " + ages.get("Ahmet"));
    }
}
