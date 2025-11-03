// 005_SinifIcindeMetotKullanimi.java

class Calisan {
    // Özellikler (Fields)
    String isim;
    double maas;

    // Maaşa zam yapan metot
    void zamYap(double zamOrani) {
        // Yeni maası hesaplamak için 'maas' özelliğini kullanır.
        double zamMiktari = this.maas * (zamOrani / 100);
        this.maas = this.maas + zamMiktari;
        // 'this.' kullanımı, o anki nesnenin özelliğini ifade eder, isteğe bağlıdır.
        System.out.println(isim + " için %" + zamOrani + " oranında zam yapıldı.");
    }

    // Çalışanın güncel durumunu gösteren metot
    void bilgileriGoster() {
        // Başka bir metot içinde 'zamYap' metodunun etkilediği 'maas' özelliğini kullanır.
        System.out.println("Çalışan Adı: " + isim);
        System.out.println("Yeni Maaş: " + maas + " TL");
        System.out.println("-------------------------");
    }
}

public class SinifIcindeMetotKullanimi {
    public static void main(String[] args) {
        Calisan ali = new Calisan();
        ali.isim = "Ali Can";
        ali.maas = 50000.0;
        
        // İlk durumu göster
        System.out.println("--- İlk Durum ---");
        ali.bilgileriGoster();

        // Zam yap metodunu çağır
        ali.zamYap(10.0); // %10 zam yapılıyor.

        // Zam sonrası durumu göster (bilgileriGoster metodu, güncellenmiş maas özelliğini kullanır)
        System.out.println("\n--- Zam Sonrası Durum ---");
        ali.bilgileriGoster(); // Maaş 55000.0 olmuştur.
    }
}