// Author: Hafize Şenyıl
// Topic: If - Else If - Else Conditions
// Description: Real-life decision making examples in Java
// Karmaşık if-else karar yapısı
// Çoklu koşullar, iç içe karşılaştırmalar (örnek: kredi onay sistemi)

public class IfElseExamples {
    public static void main(String[] args) {
        System.out.println("🌿 Welcome to Condition Examples by Hafize Şenyıl\n");

        int age = 25;
        double temperature = 14.5;
        boolean hasTicket = true;

        // Example 1 - Age control for entering a cinema
        if (age >= 18) {
            System.out.println("🎬 You can enter the cinema.");
        } else {
            System.out.println("🚫 You must be 18 or older to enter.");
        }

        // Example 2 - Weather advice
        if (temperature < 0) {
            System.out.println("❄️ It’s freezing! Wear a thick coat!");
        } else if (temperature < 15) {
            System.out.println("🌤️ Cool weather! Take your jacket.");
        } else {
            System.out.println("☀️ Nice and warm! Enjoy the day!");
        }

        // Example 3 - Concert entry
        if (hasTicket) {
            System.out.println("🎟️ Ticket confirmed. Welcome to the concert!");
        } else {
            System.out.println("❌ You need to buy a ticket to enter.");
        }

        System.out.println("\n👩‍💻 Program finished by Hafize Şenyıl");
    }
}
