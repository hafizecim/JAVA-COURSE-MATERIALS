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
        Iterator<String> itr = animals.iterator(); // Iterator elde etme

        // Iterator'ın daha fazla öğesi olup olmadığını kontrol eder
        while (itr.hasNext()) { 
            // Bir sonraki öğeyi alır ve imleci ilerletir
            String animal = itr.next(); 
            System.out.println(animal);
            
            // Koşula bağlı olarak öğe silebilirsiniz (Örn: "Dog" öğesini silelim)
            if (animal.equals("Dog")) {
                 itr.remove(); // Listeden o anki öğeyi güvenli bir şekilde siler
            }
        }
        
        System.out.println("\nIterator ile silme sonrası Liste: " + animals);
        
        // 🔹 ListIterator ile ileri yönde gezinme (Yeni liste üzerinde)
        System.out.println("\n➡️ ListIterator ile İleri Yönde:");
        // Listenin başından (index 0) ListIterator elde etme
        ListIterator<String> listItr = animals.listIterator();

        while (listItr.hasNext()) {
            String animal = listItr.next();
            System.out.println("İleri: " + animal);
            
            // ListIterator, öğeyi değiştirme (set) ve yeni öğe ekleme (add) özelliklerine sahiptir
            if (animal.equals("Bird")) {
                listItr.set("Parrot"); // O anki öğeyi değiştir
            }
        }
        
        System.out.println("\nListIterator ile set() sonrası Liste: " + animals); // [Cat, Parrot, Lion]

        // 🔹 ListIterator ile geri yönde gezinme
        System.out.println("\n⬅️ ListIterator ile Geri Yönde:");
        // Şu anki imleç listenin sonunda (son hasNext() çağrısından sonra)
        
        // previous() metodunu kullanarak geri yönde gezinme
        while (listItr.hasPrevious()) { 
            // Bir önceki öğeyi alır ve imleci geri kaydırır
            String animal = listItr.previous(); 
            System.out.println("Geri: " + animal);
            
            // Geriye doğru gezinirken ekleme yapalım
            if (animal.equals("Cat")) {
                listItr.add("Mouse"); // Önceki öğe ile current arasında ekler (Mouse, Cat, Parrot, Lion)
            }
        }
        
        System.out.println("\nListIterator ile add() sonrası Liste: " + animals); // [Mouse, Cat, Parrot, Lion]
    }
}