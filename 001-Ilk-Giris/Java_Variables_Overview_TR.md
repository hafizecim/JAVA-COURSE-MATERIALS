# 🌿 Java Değişkenler, Veri Türleri ve Matematiksel İşlemler

## 1. Giriş

Java programlama dili, değişkenler ve veri türleri üzerine kurulu güçlü bir yapıya sahiptir.  
Bu bölümde, Java'da **değişkenlerin ne olduğu, veri türleri, matematiksel işlemler, tip dönüşümleri ve string işlemleri** hakkında temel bilgiler verilecektir.

---

## 2. Değişkenler (Variables)

- **Değişken**, programın çalışması sırasında değer saklamak için kullanılan bir isimlendirilmiş hafıza alanıdır.
- Java’da her değişkenin **veri türü** belirtilmelidir.
- Örnek veri türleri:
  - `int` → Tam sayılar için (ör: 25)
  - `double` → Ondalıklı sayılar için (ör: 3.14)
  - `char` → Tek karakter için (ör: 'A')
  - `boolean` → Mantıksal değerler: true/false
  - `String` → Metinler için (ör: "Hafize Şenyıl")

**Özellikler:**
- Değişkenler bellekte saklanır.
- Çalışma sırasında değerleri değiştirilebilir.
- Sabit değerler için `final` anahtar kelimesi kullanılır.

---

## 3. Matematiksel İşlemler (Arithmetic Operations)

Java, değişkenler üzerinde temel matematiksel işlemleri kolayca yapabilir:

- Toplama: `+`
- Çıkarma: `-`
- Çarpma: `*`
- Bölme: `/`
- Mod alma: `%`

**Örnek Kullanım:**
- `int toplam = x + y;`
- `double bolum = (double)x / y;` → Bölme işleminde tip dönüşümü gerekebilir.

---

## 4. Tip Dönüşümleri (Type Casting)

Java’da farklı veri türleri arasında dönüşüm yapabilirsiniz:

- **Genişletme (Widening):** Küçük türden büyük türe otomatik dönüşüm.  
  Örnek: `int → double`
- **Daraltma (Narrowing):** Büyük türden küçük türe manuel dönüşüm gerekir.  
  Örnek: `(int) 3.14 → 3`

---

## 5. String İşlemleri ve Birleştirme

- Metinler `String` türünde saklanır.
- `+` operatörü ile stringler ve sayılar birleştirilebilir.
- Escape karakterleri kullanılarak özel formatlama yapılabilir:
  - `\n` → Yeni satır
  - `\t` → Tab boşluğu
  - `\\` → Ters eğik çizgi
  - `\"` → Çift tırnak

---

## 6. Boolean ve Mantıksal Değerler

- `boolean` veri türü sadece **true** veya **false** değerini alır.
- Koşul kontrolünde ve mantıksal işlemlerde kullanılır.

**Mantıksal operatörler:**
- `&&` → VE
- `||` → VEYA
- `!` → DEĞİL

---

## 7. ASCII ve Karakter İşlemleri

- `char` türü tek bir karakteri temsil eder.
- Karakterler ASCII kodları ile sayısal değere dönüştürülebilir:
  ```java
  char ch = 'A';
  int ascii = ch; // ascii = 65
