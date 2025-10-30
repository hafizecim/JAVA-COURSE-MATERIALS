// 📘 012_TreeSetExample.java
// TreeSet: Elemanları otomatik olarak sıralar. Tekrarlayan elemanlara izin vermez.

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(10); // yinelenen değer eklenmez

        System.out.println("Sıralı Sayılar: " + numbers);
        System.out.println("En Küçük: " + numbers.first());
        System.out.println("En Büyük: " + numbers.last());

        // 🔹 Belirli aralıktaki sayılar
        System.out.println("20’den büyük olanlar: " + numbers.tailSet(20, false));
    }
}
