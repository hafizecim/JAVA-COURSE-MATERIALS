// Author: Hafize Şenyıl
// Scenario: ATM sistemi – kullanıcı girişinden sonra işlem seçimi
public class ATMSimulation {
    public static void main(String[] args) {
        String username = "hafize";
        String password = "root";
        double balance = 1500.00;

        System.out.println("🏦 Welcome to Hafize Şenyıl Bank");

        // Giriş kontrolü
        if (username.equals("hafize") && password.equals("root")) {
            System.out.println("✅ Login successful!");

            int choice = 2; // Örnek olarak 2 (Para çekme)

            System.out.println("\n1️⃣ Check Balance");
            System.out.println("2️⃣ Withdraw Money");
            System.out.println("3️⃣ Deposit Money");

            switch (choice) {
                case 1:
                    System.out.println("💰 Your balance is: " + balance + " TL");
                    break;
                case 2:
                    double amount = 500;
                    if (amount <= balance) {
                        balance -= amount;
                        System.out.println("✅ You withdrew " + amount + " TL.");
                        System.out.println("💳 Remaining balance: " + balance + " TL");
                    } else {
                        System.out.println("❌ Insufficient funds!");
                    }
                    break;
                case 3:
                    double deposit = 1000;
                    balance += deposit;
                    System.out.println("✅ You deposited " + deposit + " TL.");
                    System.out.println("💳 New balance: " + balance + " TL");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } else {
            System.out.println("🚫 Incorrect login information!");
        }

        System.out.println("👩‍💻 Session closed by Hafize Şenyıl");
    }
}
