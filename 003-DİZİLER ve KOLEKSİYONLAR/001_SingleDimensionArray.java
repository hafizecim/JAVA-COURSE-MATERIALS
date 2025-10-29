// 📘 001_SingleDimensionArray.java
// 🎯 Konu: Tek Boyutlu Dizi (One-Dimensional Array)
// 👩‍💻 Yazan: Hafize Şenyıl
// 🧠 Amaç: Dizi oluşturmayı, eleman atamayı ve yazdırmayı öğrenmek

public class SingleDimensionArray {

    public static void main(String[] args) {

        // 🔹 5 elemanlı bir tam sayı dizisi oluşturuluyor
        int[] numbers = new int[5];

        // 🔹 Diziye değer atama
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // 🔹 Dizinin 3. elemanını (index 2) ekrana yazdır
        System.out.println("Üçüncü eleman: " + numbers[2]);

        // 🔹 Tüm dizi elemanlarını yazdırmak için for döngüsü
        System.out.println("Tüm elemanlar:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }
    }
}
