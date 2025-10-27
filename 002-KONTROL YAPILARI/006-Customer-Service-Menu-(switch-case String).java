// Author: Hafize Şenyıl
// Scenario: Kullanıcı seçimine göre müşteri hizmeti yönlendirmesi
public class CustomerServiceMenu {
    public static void main(String[] args) {
        String option = "billing";

        System.out.println("☎️ Welcome to Hafize Şenyıl Support Center");
        System.out.println("Please select a department: billing / technical / delivery");

        switch (option) {
            case "billing":
                System.out.println("💰 Connecting you to the billing department...");
                break;
            case "technical":
                System.out.println("🧰 Connecting you to the technical team...");
                break;
            case "delivery":
                System.out.println("🚚 Connecting you to the delivery department...");
                break;
            default:
                System.out.println("❓ Invalid option. Please try again.");
        }

        System.out.println("👩‍💻 Service handled by Hafize Şenyıl");
    }
}
