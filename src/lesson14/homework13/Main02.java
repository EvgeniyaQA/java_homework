package lesson14.homework13;

import java.time.DayOfWeek;
import java.util.Scanner;

public class Main02 {

    public static int dayOfWeekToNumber(String dayOfWeek) {
        switch (dayOfWeek) {
            case "monday":
                return 0;
            case "tuesday":
                return 1;
            case "wednesday":
                return 2;
            case "thursday":
                return 3;
            case "friday":
                return 4;
            case "saturday":
                return 5;
            case "sunday":
                return 6;
            default:
                return -1;
        }
    }

    public static String numberToDayOfWeek(int dayOfWeek) {
        switch (dayOfWeek) {
            case 0:
                return "monday";
            case 1:
                return "tuesday";
            case 2:
                return "wednesday";
            case 3:
                return "thursday";
            case 4:
                return "friday";
            case 5:
                return "saturday";
            case 6:
                return "sunday";
            default:
                return "";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dayOfWeek = scanner.next();
        int day = dayOfWeekToNumber(dayOfWeek.toLowerCase());
        if (day == -1) {
            System.out.println("Incorrect input!");
            return;
        }
        int days = scanner.nextInt();

        int res = (day + days) % 7;
        if (res < 0) {
            res *= -1;
        }
        System.out.println(numberToDayOfWeek(res));
    }
}
