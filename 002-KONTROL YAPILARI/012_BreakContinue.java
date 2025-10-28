// Author: Hafize Şenyıl
// Topic: Break and Continue
// Description: Advanced control flow inside loops
// Break & continue örnekleri
// Kullanıcıdan giriş alarak döngüyü kontrol etme

public class BreakContinue {
    public static void main(String[] args) {
        System.out.println("🌿 Break & Continue Examples by Hafize Şenyıl\n");

        // Example 1 - Stop loop when condition met (break)
        System.out.println("🔹 Stop when number equals 7 (break):");
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                System.out.println("💥 Number 7 found, stopping loop!");
                break; // exit loop immediately
            }
            System.out.println("Number: " + i);
        }

        // Example 2 - Skip even numbers (continue)
        System.out.println("\n🔹 Print only odd numbers (continue):");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // skip even numbers
            }
            System.out.println("Odd number: " + i);
        }

        // Example 3 - Nested loop with break
        System.out.println("\n🔹 Stop when (i * j) == 12:");
        outerLoop:
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i * j == 12) {
                    System.out.println("❌ Found 12 at i=" + i + ", j=" + j);
                    break outerLoop; // stop both loops
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }

        // Example 4 - Continue with label
        System.out.println("\n🔹 Continue outer loop when j == 2:");
        outer:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2) {
                    continue outer; // skip rest of this iteration of outer loop
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }

        System.out.println("\n👩‍💻 Program completed by Hafize Şenyıl");
    }
}
