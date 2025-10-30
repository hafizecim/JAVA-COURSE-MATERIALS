// 📘 009_ArrayListOperations.java
// Bu örnek, ArrayList üzerinde temel ve ileri düzey işlemleri gösterir.
// ArrayList: Dinamik boyutlu liste yapısıdır. Eleman ekleme, silme, erişim kolaydır.

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOperations {
    public static void main(String[] args) {
        // 🔹 Bir ArrayList oluşturma
        ArrayList<String> cities = new ArrayList<>();

        // 🔹 Eleman ekleme
        cities.add("Istanbul");
        cities.add("Ankara");
        cities.add("Izmir");
        cities.add("Konya");

        // 🔹 Belirli konuma ekleme
        cities.add(2, "Bursa");

        System.out.println("📍 Şehir Listesi: " + cities);

        // 🔹 Eleman silme
        cities.remove("Izmir");
        System.out.println("❌ İzmir silindikten sonra: " + cities);

        // 🔹 Eleman arama
        if (cities.contains("Konya")) {
            System.out.println("✅ Konya listede mevcut.");
        }

        // 🔹 Listeyi sıralama
        Collections.sort(cities);
        System.out.println("🔡 Alfabetik Sıralama: " + cities);

        // 🔹 Ters çevirme
        Collections.reverse(cities);
        System.out.println("🔄 Ters Sıralama: " + cities);
    }
}
