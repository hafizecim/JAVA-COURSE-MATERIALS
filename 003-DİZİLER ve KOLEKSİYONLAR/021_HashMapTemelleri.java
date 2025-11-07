// 021_HashMapTemelleri.java

import java.util.HashMap;
import java.util.Map; // Genel Map arayüzünü kullanmak iyi bir uygulamadır.

public class HashMapTemelleri {
    public static void main(String[] args) {
        
        // 1. HashMap Tanımlama
        // String (Anahtar) -> Ülke Kodu, String (Değer) -> Ülke Adı
        Map<String, String> ulkeKodlari = new HashMap<>(); 
        
        System.out.println("--- 1. Eleman Ekleme (put) ---");
        // put(anahtar, değer): Haritaya anahtar-değer çifti ekler.
        ulkeKodlari.put("TR", "Türkiye");
        ulkeKodlari.put("US", "Amerika Birleşik Devletleri");
        ulkeKodlari.put("DE", "Almanya");
        ulkeKodlari.put("FR", "Fransa");
        
        System.out.println("Haritanın şu anki hali (Sırasız): " + ulkeKodlari);
        
        System.out.println("\n--- 2. Değer Okuma (get) ve Anahtar Benzersizliği ---");
        
        // get(anahtar): Anahtara karşılık gelen değeri döndürür.
        String ulkeAdi = ulkeKodlari.get("DE");
        System.out.println("DE koduna karşılık gelen ülke: " + ulkeAdi); // Almanya
        
        // Benzersiz Anahtar Kuralı: Aynı anahtar ile yeni değer ekleme
        String eskiDeger = ulkeKodlari.put("TR", "Turkish Republic"); 
        System.out.println("TR güncellendi. Eski değer: " + eskiDeger); // Türkiye
        System.out.println("TR'nin yeni değeri: " + ulkeKodlari.get("TR")); // Turkish Republic

        System.out.println("\n--- 3. Kontrol Metotları ---");
        // size(): Çift sayısını verir.
        System.out.println("Toplam çift sayısı: " + ulkeKodlari.size()); // 4
        // containsKey(): Belirtilen anahtarın haritada olup olmadığını kontrol eder.
        System.out.println("Haritada 'US' anahtarı var mı? " + ulkeKodlari.containsKey("US")); // true
        // containsValue(): Belirtilen değerin haritada olup olmadığını kontrol eder.
        System.out.println("Haritada 'Fransa' değeri var mı? " + ulkeKodlari.containsValue("Fransa")); // true

        System.out.println("\n--- 4. Silme İşlemleri ---");
        // remove(anahtar): Anahtarı ve ona bağlı değeri siler.
        ulkeKodlari.remove("FR");
        System.out.println("FR silindi. Güncel harita: " + ulkeKodlari);
        
        // Haritadaki tüm elemanları temizleme
        // ulkeKodlari.clear(); 
        
        System.out.println("\n--- 5. Anahtar ve Değer Kümelerini Alma ---");
        // keySet(): Tüm anahtarları bir Set (Küme) olarak döndürür.
        System.out.println("Tüm Anahtarlar (Key Set): " + ulkeKodlari.keySet()); 
        
        // values(): Tüm değerleri bir Collection (Koleksiyon) olarak döndürür.
        System.out.println("Tüm Değerler (Values): " + ulkeKodlari.values()); 
    }
}