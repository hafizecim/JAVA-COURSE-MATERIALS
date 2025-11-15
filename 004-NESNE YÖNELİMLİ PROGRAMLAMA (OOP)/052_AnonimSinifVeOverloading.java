// ----------------------------------------------------
// Dosya Adı: 052_AnonimSinifVeOverloading.java
// ----------------------------------------------------

/**
 * 1. IslemYapici Arayüzü: Anonim iç sınıf tarafından uygulanacak sözleşme.
 */
interface IslemYapici {
    int islem(int a, int b);
}

/**
 * 3. Aritmetik Sınıfı: Metot Aşırı Yüklemeyi (Overloading) göstermek için.
 */
class Aritmetik {
    
    // 4. Metot Aşırı Yükleme (Overloading): Aynı isimde farklı imzalara sahip metotlar.
    
    // Metot 1: İki tam sayıyı toplar
    public int topla(int a, int b) {
        System.out.println("-> topla(int, int) metodu çalıştı.");
        return a + b;
    }

    // Metot 2: Üç tam sayıyı toplar (Parametre sayısı farklı)
    public int topla(int a, int b, int c) {
        System.out.println("-> topla(int, int, int) metodu çalıştı.");
        return a + b + c;
    }

    // Metot 3: İki ondalık sayıyı toplar (Parametre tipleri farklı)
    public double topla(double a, double b) {
        System.out.println("-> topla(double, double) metodu çalıştı.");
        return a + b;
    }
}

/**
 * Ana Uygulama Sınıfı
 */
public class Uygulama052 {
    public static void main(String[] args) {
        
        // --- A. Metot Aşırı Yükleme (Overloading) Gösterimi ---
        System.out.println("--- 1. Metot Aşırı Yükleme (Overloading) ---");
        
        Aritmetik aritmetik = new Aritmetik();

        // Derleyici, parametre türlerine bakarak hangi metodu çağıracağını derleme anında (Statik Bağlama) belirler.
        
        // 1. Çağrı: int, int parametreli metot seçilir
        int sonuc1 = aritmetik.topla(5, 10);
        System.out.println("Sonuç (int, int): " + sonuc1);

        // 2. Çağrı: int, int, int parametreli metot seçilir
        int sonuc2 = aritmetik.topla(5, 10, 15);
        System.out.println("Sonuç (int, int, int): " + sonuc2);

        // 3. Çağrı: double, double parametreli metot seçilir
        double sonuc3 = aritmetik.topla(5.5, 10.2);
        System.out.println("Sonuç (double, double): " + sonuc3);
        
        System.out.println("\n--- 2. Anonim İç Sınıf (Anonymous Inner Class) ---");
        
        // --- B. Anonim İç Sınıf Gösterimi ---
        
        // IslemYapici arayüzünü anında (bir kereye mahsus) uygulayan isimsiz bir sınıf oluşturuluyor.
        IslemYapici toplayici = new IslemYapici() {
            // Sınıfın adı yok, süslü parantezler içinde doğrudan arayüzün metotları uygulanıyor.
            
            @Override
            public int islem(int a, int b) {
                System.out.println("Anonim Sınıf: Toplama işlemi yapılıyor.");
                return a + b;
            }
        };
        
        // Anonim sınıfın uyguladığı metodu çağırıyoruz.
        int anonimSonuc = toplayici.islem(20, 30);
        System.out.println("Anonim Sınıf İşlem Sonucu: " + anonimSonuc);

        // Aynı arayüzü farklı bir işlem için başka bir anonim sınıf ile implement edebiliriz (Örn: Çarpma).
        IslemYapici carpici = new IslemYapici() {
            @Override
            public int islem(int a, int b) {
                System.out.println("Anonim Sınıf: Çarpma işlemi yapılıyor.");
                return a * b;
            }
        };
        
        int anonimSonuc2 = carpici.islem(5, 6);
        System.out.println("Anonim Sınıf Çarpma Sonucu: " + anonimSonuc2);
    }
}