// 003_TemelMetotTanimlama.java

class Kedi {
    String isim;
    String renk;

    // Metot (Davranış): Kedinin ne yaptığını tanımlar.
    // 'void' metotlar herhangi bir değer döndürmez, sadece işlem yapar.
    void miyavla() {
        System.out.println(isim + " miyavlıyor: MİYAV! MİYAV!");
    }

    // Parametre alan metot: Dışarıdan bilgi kabul eder.
    void yemekYe(String yemekTuru) {
        System.out.println(isim + " (" + renk + " renkli) " + yemekTuru + " yiyor. Lezzetli!");
    }
}

public class TemelMetotTanimlama {
    public static void main(String[] args) {
        Kedi pamuk = new Kedi();
        pamuk.isim = "Pamuk";
        pamuk.renk = "Beyaz";

        Kedi tekir = new Kedi();
        tekir.isim = "Tekir";
        tekir.renk = "Gri";

        // Nesne üzerinden metot çağırma:
        System.out.println("--- Pamuk'un Davranışları ---");
        pamuk.miyavla(); // 'miyavla' metodu çağrılır.
        pamuk.yemekYe("Tavuk"); // 'yemekYe' metodu çağrılır ve parametre gönderilir.
        
        System.out.println("\n--- Tekir'in Davranışları ---");
        tekir.yemekYe("Balık");
        tekir.miyavla();
    }
}