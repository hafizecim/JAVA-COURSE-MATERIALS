// 📘 015_TreeMapSorting.java
// TreeMap: Key değerlerine göre sıralama yapar (alfabetik veya sayısal olarak).

import java.util.TreeMap;

public class TreeMapSorting {
    public static void main(String[] args) {
        TreeMap<String, Double> products = new TreeMap<>();

        products.put("Mouse", 250.0);
        products.put("Keyboard", 600.0);
        products.put("Monitor", 3200.0);
        products.put("Laptop", 12500.0);

        System.out.println("Ürün Fiyatları (Key’e göre sıralı):");
        for (String item : products.keySet()) {
            System.out.println(item + " : " + products.get(item) + " TL");
        }

        // 🔹 İlk ve son key
        System.out.println("İlk ürün: " + products.firstKey());
        System.out.println("Son ürün: " + products.lastKey());
    }
}
