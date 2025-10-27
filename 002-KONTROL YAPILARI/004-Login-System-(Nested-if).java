// Author: Hafize Şenyıl
// Scenario: Kullanıcı adı ve şifre kontrolü
public class LoginSystem {
    public static void main(String[] args) {
        String inputUsername = "hafize";
        String inputPassword = "root123";

        String correctUsername = "hafize";
        String correctPassword = "root123";

        System.out.println("🔐 Attempting to login...");

        if (inputUsername.equals(correctUsername)) {
            if (inputPassword.equals(correctPassword)) {
                System.out.println("✅ Login successful. Welcome, Hafize Şenyıl!");
            } else {
                System.out.println("❌ Incorrect password. Please try again.");
            }
        } else {
            System.out.println("🚫 Username not found.");
        }

        System.out.println("👩‍💻 Program ended by Hafize Şenyıl");
    }
}
