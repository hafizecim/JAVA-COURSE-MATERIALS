// 013_ConstructorKullanimi.java

class Calisan {
    // === Özellikler (Fields) ===
    String isim;
    double maas;
    
    // YENİ: Yapıcı Metot (Constructor)
    // Nesne oluşturulurken (new Calisan(..., ...)) çağrılır ve 
    // kritik özelliklere başlangıç değerlerini atar.
    public Calisan(String isim, double maas) {
        // Parametre isimleri ile özellik isimleri aynı olduğu için 
        // karışıklığı gidermek ve sınıf özelliğini belirtmek için 'this.' kullanıyoruz.
        this.isim = isim;
        this.maas = maas;
        System.out.println(isim + " adında yeni bir çalışan işe alındı (Constructor çalıştı).");
    }

    // Maaşa zam yapan metot
    void zamYap(double zamOrani) {
        double zamMiktari = this.maas * (zamOrani / 100);
        this.maas = this.maas + zamMiktari;
        System.out.println(isim + " için %" + zamOrani + " oranında zam yapıldı.");
    }

    // Çalışanın güncel durumunu gösteren metot
    void bilgileriGoster() {
        System.out.println("-------------------------");
        System.out.println("Çalışan Adı: " + isim);
        // Maaşı daha düzenli göstermek için formatlama kullanalım
        System.out.printf("Güncel Maaş: %.2f TL%n", maas);
        System.out.println("-------------------------");
    }
}

public class ConstructorKullanimi {
    public static void main(String[] args) {
        
        // NESNE OLUŞTURMA: Artık new Calisan() kullanamayız,
        // çünkü parametreli bir constructor tanımladık.
        // Yeni nesne oluşturulurken isim ve maas değerlerini GİRMEK ZORUNLUDUR.
        Calisan veli = new Calisan("Veli Demir", 60000.0);
        
        // --- İlk Durum ---
        veli.bilgileriGoster();
        
        // Zam yap metodunu çağır
        veli.zamYap(15.5); // %15.5 zam yapılıyor.

        // --- Zam Sonrası Durum ---
        System.out.println("\n--- Zam Sonrası Durum ---");
        veli.bilgileriGoster(); 
        
        // İkinci bir çalışan oluşturalım. Her nesnenin kendi verisi ve metodu vardır.
        Calisan ayse = new Calisan("Ayşe Kaya", 45000.0);
        ayse.zamYap(20.0);
        ayse.bilgileriGoster();
    }
}