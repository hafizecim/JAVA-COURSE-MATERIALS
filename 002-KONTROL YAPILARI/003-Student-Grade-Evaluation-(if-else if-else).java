// Author: Hafize Şenyıl
// Scenario: Öğrenci notuna göre başarı durumunu belirleme
public class StudentGrade {
    public static void main(String[] args) {
        int score = 87;
        String name = "Hafize Şenyıl";

        System.out.println("📘 Student: " + name);
        System.out.println("🎯 Score: " + score);

        if (score >= 90) {
            System.out.println("🏆 Excellent! Grade: A");
        } else if (score >= 80) {
            System.out.println("👏 Very Good! Grade: B");
        } else if (score >= 70) {
            System.out.println("👍 Good! Grade: C");
        } else if (score >= 60) {
            System.out.println("🙂 Passed! Grade: D");
        } else {
            System.out.println("❌ Failed. Study harder next time!");
        }

        System.out.println("👩‍💻 Evaluated by: Hafize Şenyıl");
    }
}
