// Author: Hafize Şenyıl
// Topic: Nested Loops (İç içe döngüler)
// Description: Advanced examples with multi-level loops

public class NestedLoops {
    public static void main(String[] args) {
        System.out.println("🌿 Nested Loops Examples by Hafize Şenyıl\n");

        // Example 1 - Multiplication Table (1 to 10)
        System.out.println("🔹 Multiplication Table (1–10):\n");
        for (int i = 1; i <= 10; i++) {           // Outer loop controls rows
            for (int j = 1; j <= 10; j++) {       // Inner loop controls columns
                System.out.print((i * j) + "\t");
            }
            System.out.println(); // new line after each row
        }

        // Example 2 - Star Pyramid Pattern
        System.out.println("\n🔹 Pyramid Pattern (⭐):\n");
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            // print spaces
            for (int s = i; s < rows; s++) {
                System.out.print(" ");
            }
            // print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Example 3 - Hollow Rectangle
        System.out.println("\n🔹 Hollow Rectangle (⬜):\n");
        int height = 5;
        int width = 10;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if (i == 1 || i == height || j == 1 || j == width)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("\n👩‍💻 Program finished by Hafize Şenyıl");
    }
}
