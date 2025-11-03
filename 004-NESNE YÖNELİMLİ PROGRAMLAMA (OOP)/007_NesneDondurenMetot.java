// 007_NesneDondurenMetot.java

class Nokta {
    int x;
    int y;

    void koordinatYazdir() {
        System.out.println("(" + x + ", " + y + ")");
    }
}

class Geometri {
    // Dönüş tipi 'Nokta' olan metot: Yeni bir 'Nokta' nesnesi oluşturup döndürür.
    Nokta yeniNoktaOlustur(int yeniX, int yeniY) {
        Nokta yeni = new Nokta(); // Yeni Nokta nesnesi oluşturulur.
        yeni.x = yeniX;
        yeni.y = yeniY;
        return yeni; // Oluşturulan nesnenin referansı geri döndürülür.
    }
    
    // Var olan bir noktanın kopyasını döndüren metot
    Nokta kopyaNoktaOlustur(Nokta orjinal) {
        Nokta kopya = new Nokta();
        kopya.x = orjinal.x; // Orjinal nesnenin değerlerini kopyala
        kopya.y = orjinal.y;
        return kopya;
    }
}

public class NesneDondurenMetot {
    public static void main(String[] args) {
        Geometri g = new Geometri();
        
        // Metot çağrılır ve dönen 'Nokta' nesnesi 'p1' değişkenine atanır.
        Nokta p1 = g.yeniNoktaOlustur(10, 20);
        System.out.print("p1 koordinatları: ");
        p1.koordinatYazdir(); // (10, 20)

        // p1'in kopyası olan p2'yi oluştur
        Nokta p2 = g.kopyaNoktaOlustur(p1);
        System.out.print("p2 (kopya) koordinatları: ");
        p2.koordinatYazdir(); // (10, 20)

        // p2'yi değiştirelim, p1 etkilenmez (çünkü ayrı nesnelerdir).
        p2.x = 99;
        System.out.print("\np2 yeni koordinat: ");
        p2.koordinatYazdir(); // (99, 20)
        System.out.print("p1 hala: ");
        p1.koordinatYazdir(); // (10, 20)
    }
}