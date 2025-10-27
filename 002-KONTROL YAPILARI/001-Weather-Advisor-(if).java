// Author: Hafize Şenyıl
// Scenario: Hava durumuna göre tavsiye veren program
public class WeatherAdvisor {
    public static void main(String[] args) {
        int temperature = 10; // Sıcaklık değeri (Celsius)

        System.out.println("🌡️ Current temperature: " + temperature + "°C");

        if (temperature < 0) {
            System.out.println("It's freezing! Wear a thick coat and gloves 🧤");
        }

        if (temperature >= 0 && temperature < 10) {
            System.out.println("Very cold outside ❄️ Don't forget your jacket!");
        }

        if (temperature >= 10 && temperature < 20) {
            System.out.println("Cool weather 🍃 A light jacket will be enough.");
        }

        if (temperature >= 20) {
            System.out.println("Warm and nice ☀️ Perfect day for a walk!");
        }

        System.out.println("\n👩‍💻 Program finished by Hafize Şenyıl");
    }
}
