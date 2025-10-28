// 📘 014_CombinedControlExample_HafizeSenyil.java
// 🎯 Konu: Mini ATM Simülasyonu
// 👩‍💻 Yazan: Hafize Şenyıl
// 📅 Tarih: 27.10.2025
// 🧠 Konular: if, switch-case, loop, break, continue, Scanner

import java.util.Scanner;

public class CombinedControlExample {

    public static void main(String[] args) {

        // 🔹 Scanner nesnesi: Kullanıcıdan veri almak için
        Scanner input = new Scanner(System.in);

        // 🔹 Değişken tanımlamaları
        String systemUser = "hafize";
        String systemPass = "1234";
        double balance = 1000.0; // Başlangıç bakiyesi

        System.out.println("💳 Hoş Geldiniz! Mini ATM Sistemine Giriş Yapın");

        // 🔹 Kullanıcı giriş sistemi (3 hak)
        int attempts = 3;

        while (attempts > 0) {
            System.out.print("👤 Kullanıcı Adı: ");
            String username = input.nextLine();

            System.out.print("🔑 Şifre: ");
            String password = input.nextLine();

            if (username.equals(systemUser) && password.equals(systemPass)) {
                System.out.println("\n✅ Giriş başarılı, hoş geldin " + username + "!");
                break; // Başarılı giriş → döngüden çık
            } else {
                attempts--;
                System.out.println("❌ Hatalı giriş! Kalan deneme: " + attempts);

                if (attempts == 0) {
                    System.out.println("🚫 Hesabınız bloke edildi. Lütfen banka ile iletişime geçin.");
                    return; // Programı sonlandır
                }
            }
        }

        // 🔹 Ana menü işlemleri
        int choice;
        do {
            System.out.println("\n🏦 ATM MENÜSÜ");
            System.out.println("1️⃣  Bakiye Görüntüle");
            System.out.println("2️⃣  Para Yatır");
            System.out.println("3️⃣  Para Çek");
            System.out.println("4️⃣  Şifre Değiştir");
            System.out.println("5️⃣  Çıkış Yap");
            System.out.print("👉 Seçiminiz: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("💰 Mevcut bakiyeniz: " + balance + " TL");
                    break;

                case 2:
                    System.out.print("💵 Yatırmak istediğiniz tutar: ");
                    double deposit = input.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("✅ Para başarıyla yatırıldı. Yeni bakiyeniz: " + balance + " TL");
                    } else {
                        System.out.println("⚠️ Geçersiz tutar!");
                    }
                    break;

                case 3:
                    System.out.print("💸 Çekmek istediğiniz tutar: ");
                    double withdraw = input.nextDouble();

                    if (withdraw > balance) {
                        System.out.println("❌ Yetersiz bakiye!");
                    } else if (withdraw <= 0) {
                        System.out.println("⚠️ Geçersiz tutar!");
                    } else {
                        balance -= withdraw;
                        System.out.println("✅ Para çekildi. Yeni bakiyeniz: " + balance + " TL");
                    }
                    break;

                case 4:
                    input.nextLine(); // Buffer temizleme
                    System.out.print("🧩 Yeni şifrenizi girin: ");
                    String newPass = input.nextLine();

                    if (newPass.length() >= 4) {
                        systemPass = newPass;
                        System.out.println("✅ Şifre başarıyla değiştirildi!");
                    } else {
                        System.out.println("⚠️ Şifre en az 4 karakter olmalı!");
                    }
                    break;

                case 5:
                    System.out.println("👋 Çıkış yapılıyor... Güle güle, " + systemUser + "!");
                    break;

                default:
                    System.out.println("⚠️ Geçersiz seçim! Lütfen 1–5 arasında bir değer girin.");
                    continue; // Menü tekrar gözüksün
            }

        } while (choice != 5); // 5 seçilene kadar menü döner

        input.close();
        System.out.println("🏁 İşlem tamamlandı. Program sonlandı.");
    }
}
