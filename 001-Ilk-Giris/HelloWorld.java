// 🌿 Java'nın ilk örneği - Hello World
// Bu program ekrana "Hello, World!" yazdırır.

public class HelloWorld { // 🔹 Sınıf tanımı: Java'da her şey bir sınıf içinde olmalı

    // 🔸 main() metodu: Programın başlangıç noktası
    public static void main(String[] args) {

        // 🖨️ Ekrana yazı yazdırmak için System.out.println() kullanılır
        System.out.println("Hello, World!");

        // 💬 System.out.print() satır atlamaz
        System.out.print("Hazel ");
        System.out.print("Java öğreniyor!");

        // 🔹 Yukarıdaki iki print aynı satırda yazar
        // Çıktı:
        // Hello, World!
        // Hazel Java öğreniyor!
    }
}
