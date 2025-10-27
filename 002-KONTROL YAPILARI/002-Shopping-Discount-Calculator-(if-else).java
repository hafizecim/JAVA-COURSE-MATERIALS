// Author: Hafize Şenyıl
// Scenario: Alışveriş sepetindeki toplam tutara göre indirim uygulama
public class DiscountCalculator {
    public static void main(String[] args) {
        double totalAmount = 250.75;

        System.out.println("🛒 Your total amount: " + totalAmount + " TL");

        if (totalAmount >= 300) {
            System.out.println("🎉 You got a 20% discount!");
        } else if (totalAmount >= 200) {
            System.out.println("✨ You got a 10% discount!");
        } else if (totalAmount >= 100) {
            System.out.println("😊 You got a 5% discount!");
        } else {
            System.out.println("No discount this time. Keep shopping!");
        }

        System.out.println("💳 Thank you for shopping with us!");
        System.out.println("👩‍💻 Program created by Hafize Şenyıl");
    }
}
