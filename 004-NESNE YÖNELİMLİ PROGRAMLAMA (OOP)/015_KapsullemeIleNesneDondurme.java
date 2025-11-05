// 015_KapsullemeIleNesneDondurme.java

class Nokta {
    // === Kapsülleme: Özellikler private yapıldı ===
    private int x;
    private int y;

    // === Yapıcı Metot (Constructor) ===
    // Nesne oluşturulurken koordinat atamasını zorunlu kılar.
    public Nokta(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Nokta (" + x + ", " + y + ") oluşturuldu.");
    }

    // === Getter Metotlar (Okuma erişimi) ===
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    // YENİ: Noktanın yerini değiştiren kontrollü Setter Metot
    public void setKoordinatlar(int yeniX, int yeniY) {
        this.x = yeniX;
        this.y = yeniY;
        System.out.println("Koordinatlar yeni değere güncellendi.");
    }
    
    // Nokta nesnesini String olarak temsil eden bir metot (toString metoduna hazırlık)
    public String bilgiVer() {
        return "(" + x + ", " + y + ")";
    }
}

class Geometri {
    // Dönüş tipi 'Nokta' olan metot: Yeni bir 'Nokta' nesnesi oluşturur.
    public Nokta yeniNoktaOlustur(int yeniX, int yeniY) {
        // Artık Yapıcı Metot kullanılıyor.
        Nokta yeni = new Nokta(yeniX, yeniY); 
        return yeni;
    }
    
    // Var olan bir noktanın kopyasını döndüren metot (Değerler Getter ile alınır)
    public Nokta kopyaNoktaOlustur(Nokta orjinal) {
        // Orijinal nesnenin verilerini Getter metotları ile alıyoruz.
        Nokta kopya = new Nokta(orjinal.getX(), orjinal.getY()); 
        return kopya;
    }
}

public class KapsullemeIleNesneDondurme {
    public static void main(String[] args) {
        Geometri g = new Geometri();
        
        // 1. Nesne oluşturma ve atama (Constructor kullanılıyor)
        Nokta p1 = g.yeniNoktaOlustur(10, 20);
        System.out.println("p1 koordinatları: " + p1.bilgiVer()); 

        // 2. Kopyalama (Kapsüllenmiş verilere Getter ile erişim)
        Nokta p2 = g.kopyaNoktaOlustur(p1);
        System.out.println("p2 (kopya) koordinatları: " + p2.bilgiVer()); 

        // 3. Değer değiştirme (Setter metodu ile kontrollü değişim)
        p2.setKoordinatlar(99, 50);
        
        System.out.println("\np2 yeni koordinat: " + p2.bilgiVer()); 
        System.out.println("p1 hala: " + p1.bilgiVer()); 
    }
}