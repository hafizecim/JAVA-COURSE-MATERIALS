// 📘 003_ForEachLoopArray.java
// 🎯 Konu: for-each Döngüsü
// 👩‍💻 Yazan: Hafize Şenyıl
// 🧠 Amaç: Dizi elemanlarını kolay şekilde dolaşmayı öğrenmek

public class ForEachLoopArray {

    public static void main(String[] args) {

        // 🔹 String türünde şehirler dizisi
        String[] cities = {"Konya", "İstanbul", "İzmir", "Ankara"};

        // 🔹 for-each döngüsüyle diziyi gez
        // Bu döngü, her elemanı sırayla alır
        for (String city : cities) {
            System.out.println("Şehir: " + city);
        }

        // 🔹 Normal for döngüsüyle farkı
        System.out.println("\nIndex numaralarıyla yazdırma:");
        for (int i = 0; i < cities.length; i++) {
            System.out.println("Index " + i + ": " + cities[i]);
        }
    }
}
