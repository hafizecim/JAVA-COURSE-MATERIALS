// 📘 016_IteratorListIteratorDemo.java
// Iterator ve ListIterator kullanımı.
// Iterator ileriye doğru gider, ListIterator hem ileri hem geri gidebilir.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorListIteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Bird");
        animals.add("Lion");

        System.out.println("Orijinal Liste: " + animals);

        // 🔹 Iterator ile ileri yönde gezinme
        System.out.println("\n➡️ Iterator ile İleri Yönde:");
        Iterator<String> itr = animals
