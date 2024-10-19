package lesson13;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month:");
        String month = scanner.next();

        // February - 28
        // January, March, May, July, August, October, December - 31
        // April, June, September, November - 30
        // Умовний оператор-перемикач
        // breakout - виконання декількох кейсів
        switch (month) {
            case "February":
                System.out.println("Days: " + 28);
                break;
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                System.out.println("Days: " + 31);
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                System.out.println("Days: " + 30);
                break;
            default:
                System.out.println("No such month!");
        }

    }
}
