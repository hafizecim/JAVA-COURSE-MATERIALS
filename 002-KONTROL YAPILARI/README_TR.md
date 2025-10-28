# 🧭 2. KONTROL YAPILARI (Java Control Structures)

Bu bölüm, Java programlama dilinde **karar verme**, **tekrarlama** ve **kullanıcı girişi** yapılarının temelini oluşturur.  
Programların dinamik hale gelmesini sağlar — yani kullanıcı girdilerine, koşullara ve tekrarlara göre farklı işlemler yapılabilir.

---

## 🔹 1. KOŞULLAR (Conditions)

Koşullar, belirli bir durumun doğru (`true`) veya yanlış (`false`) olmasına göre farklı kod bloklarının çalışmasını sağlar.

### 🔸 Yapılar:
- **if** → Tek koşul kontrolü
- **else if** → Birden fazla koşulu sırayla test eder
- **else** → Hiçbir koşul sağlanmazsa çalışır
- **switch-case** → Belirli değerlere göre farklı işlemler seçer

### 🧩 Kullanım Alanları:
- Karar verme (örnek: yaş kontrolü, sınav notu değerlendirme)
- Menü seçimleri
- Program akışı yönetimi

---

## 🔹 2. DÖNGÜLER (Loops)

Döngüler, belirli işlemleri **tekrarlamak** için kullanılır.  
Program belirli bir koşul sağlandığı sürece aynı kod bloğunu tekrar tekrar çalıştırır.

### 🔸 Döngü Türleri:
- **for** → Belirli bir sayıda döner  
- **while** → Şart doğru olduğu sürece döner  
- **do-while** → En az bir kez çalışır, sonra koşulu kontrol eder  
- **nested loops (iç içe döngüler)** → Bir döngü içinde başka bir döngü  

### 🔸 Kontrol Komutları:
- **break** → Döngüyü hemen sonlandırır  
- **continue** → O adımı atlayıp döngüye devam eder  

### 🧩 Kullanım Alanları:
- Tablo üretme
- Desen çizme
- Liste, dizi veya veri üzerinde tekrarlı işlemler

---

## 🔹 3. KULLANICI GİRİŞİ (User Input)

Kullanıcıdan veri almak için `Scanner` sınıfı kullanılır.

### 🧩 Temel Kullanım:
```java
import java.util.Scanner;

Scanner input = new Scanner(System.in);
System.out.print("Bir sayı girin: ");
int sayi = input.nextInt();
System.out.println("Girdiğiniz sayı: " + sayi);
