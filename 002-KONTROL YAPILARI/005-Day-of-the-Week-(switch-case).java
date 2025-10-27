// Author: Hafize Şenyıl
// Scenario: Gün numarasına göre gün adını gösterme
public class DayOfWeek {
    public static void main(String[] args) {
        int dayNumber = 4;
        String dayName;

        switch (dayNumber) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day number!";
        }

        System.out.println("📅 Day " + dayNumber + " is " + dayName);
        System.out.println("👩‍💻 Code written by Hafize Şenyıl");
    }
}
