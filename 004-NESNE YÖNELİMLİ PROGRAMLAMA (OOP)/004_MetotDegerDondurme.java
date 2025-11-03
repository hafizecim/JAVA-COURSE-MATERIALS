// 004_MetotDegerDondurme.java

class Hesaplayici {
    // Değer döndüren metot: 'int' türünde bir değer döndürür.
    // Bu metot, dışarıdan iki tam sayı alır ve toplamını döndürür.
    int toplamaYap(int sayi1, int sayi2) {
        int toplam = sayi1 + sayi2;
        return toplam; // Sonucu çağrıldığı yere geri gönderir.
    }

    // Farklı bir dönüş tipi (double) olan metot.
    double daireAlaniHesapla(double yaricap) {
        double pi = 3.14159;
        double alan = pi * yaricap * yaricap;
        return alan;
    }
}

public class MetotDegerDondurme {
    public static void main(String[] args) {
        Hesaplayici matematik = new Hesaplayici(); // Hesaplayici nesnesi oluşturulur.

        // 1. Değer döndüren metodu çağır ve sonucu bir değişkende sakla.
        int sonuc = matematik.toplamaYap(15, 7);
        System.out.println("15 + 7 işleminin sonucu: " + sonuc); // 22

        // 2. Metodu doğrudan yazdırma içinde kullan.
        System.out.println("100 + 50 işleminin sonucu: " + matematik.toplamaYap(100, 50)); // 150

        // Alan hesaplama metodunu kullanma.
        double r = 5.0;
        double alan = matematik.daireAlaniHesapla(r);
        System.out.println("\nYarıçapı " + r + " olan dairenin alanı: " + alan);
    }
}