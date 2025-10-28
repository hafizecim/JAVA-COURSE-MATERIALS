// Author: Hafize Şenyıl
// Topic: Scanner Class – User Input
// Description: Taking different types of input from the user

import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        System.out.println("🌿 Scanner Input Examples by Hafize Şenyıl\n");

        Scanner scanner = new Scanner(System.in);

        // Example 1 - Basic info
        System.out.print("👤 Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("🎂 Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("📏 Enter your height (cm): ");
        double height = scanner.nextDouble();

        System.out.println("\n🧾 Your Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " cm");

        // Example 2 - Sum of numbers
        System.out.println("\n➕ Let's calculate the sum of two numbers:");
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("Result: " + sum);

        // Example 3 - Conditional logic with Scanner
        System.out.print("\n💳 Enter your monthly income: ");
        double income = scanner.nextDouble();

        if (income < 5000) {
            System.out.println("🔹 You are in the low-income group.");
        } else if (income <= 15000) {
            System.out.println("🔹 You are in the middle-income group.");
        } else {
            System.out.println("🔹 You are in the high-income group.");
        }

        // Example 4 - Loop with user choice
        System.out.println("\n🔁 Simple menu using Scanner:");
        boolean running = true;
        while (running) {
            System.out.println("\n1️⃣ Check Balance");
            System.out.println("2️⃣ Deposit Money");
            System.out.println("3️⃣ Exit");
            System.out.print("Select option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("💰 Your balance: 2500 TL");
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double deposit = scanner.nextDouble();
                    System.out.println("✅ " + deposit + " TL deposited successfully!");
                    break;
                case 3:
                    System.out.println("👋 Exiting system. Goodbye " + name + "!");
                    running = false;
                    break;
                default:
                    System.out.println("❌ Invalid choice. Try again.");
            }
        }

        scanner.close();
        System.out.println("\n👩‍💻 Program finished by Hafize Şenyıl");
    }
}
