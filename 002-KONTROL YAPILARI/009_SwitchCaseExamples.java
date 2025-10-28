// Author: Hafize Şenyıl
// Topic: Switch-Case Statements
// Description: Decision-making using switch-case in Java
// Gelişmiş switch-case
// Matematiksel hesap makinesi – switch yapısı + Scanner girişi

public class SwitchCaseExamples {
    public static void main(String[] args) {
        System.out.println("🌿 Switch-Case Examples by Hafize Şenyıl\n");

        int month = 10;
        String grade = "B";
        String command = "start";

        // Example 1 - Month name
        switch (month) {
            case 1:  System.out.println("January ❄️"); break;
            case 2:  System.out.println("February 💖"); break;
            case 3:  System.out.println("March 🌸"); break;
            case 4:  System.out.println("April 🌼"); break;
            case 5:  System.out.println("May 🌿"); break;
            case 6:  System.out.println("June ☀️"); break;
            case 7:  System.out.println("July 🏖️"); break;
            case 8:  System.out.println("August 🌻"); break;
            case 9:  System.out.println("September 🍂"); break;
            case 10: System.out.println("October 🎃"); break;
            case 11: System.out.println("November 🍁"); break;
            case 12: System.out.println("December 🎄"); break;
            default: System.out.println("Invalid month number!");
        }

        // Example 2 - Grade evaluation
        switch (grade) {
            case "A": System.out.println("🏆 Excellent!"); break;
            case "B": System.out.println("👏 Very Good!"); break;
            case "C": System.out.println("🙂 Good!"); break;
            case "D": System.out.println("⚠️ Needs Improvement."); break;
            default:  System.out.println("❌ Invalid Grade");
        }

        // Example 3 - Command system
        switch (command) {
            case "start": System.out.println("🟢 System Starting..."); break;
            case "stop": System.out.println("🔴 System Stopping..."); break;
            case "pause": System.out.println("⏸️ System Paused."); break;
            default: System.out.println("❓ Unknown Command");
        }

        System.out.println("\n👩‍💻 Program finished by Hafize Şenyıl");
    }
}
