// Author: Hafize Şenyıl
// Topic: For, While, Do-While Loops
// Description: Repeating tasks using different types of loops in Java

public class LoopsExamples {
    public static void main(String[] args) {
        System.out.println("🌿 Loop Examples by Hafize Şenyıl\n");

        // Example 1 - For loop (counting)
        System.out.println("🔹 Counting from 1 to 5 (for loop):");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }

        // Example 2 - While loop (sum until limit)
        System.out.println("\n🔹 Sum of numbers until 10 (while loop):");
        int sum = 0;
        int num = 1;
        while (num <= 10) {
            sum += num;
            num++;
        }
        System.out.println("Total sum: " + sum);

        // Example 3 - Do-While loop (password simulation)
        System.out.println("\n🔹 Simulating password entry (do-while):");
        int attempts = 0;
        String password = "java";
        String input = "java"; // Simulating correct input

        do {
            attempts++;
            System.out.println("Attempt " + attempts + ": Checking password...");
        } while (!input.equals(password));

        System.out.println("✅ Access granted after " + attempts + " attempt(s)");

        System.out.println("\n👩‍💻 Program completed by Hafize Şenyıl");
    }
}
