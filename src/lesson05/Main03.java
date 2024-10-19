package lesson05;

import java.util.Scanner;

public class Main03 {
    /*
    1. +
    2. -
    3. *
    4. /
    5. Exit
     */
    public static void main(String[] args) {
        double a;
        double b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /");
        System.out.println("5. Exit");
        while (true) {
            System.out.println("Enter operation number from the menu");
            int menu = scanner.nextInt();
            if (menu == 5) {
                break;
            } else if (menu >= 1 && menu <= 5) {
                System.out.println("Enter 2 numbers");
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                double res = 0; // cork
                if (menu == 1) {
                    res = a + b;

                } else if (menu == 2) {
                    res = a - b;

                } else if (menu == 3) {
                    res = a * b;
                } else if (menu == 4) {
                    if (b != 0) {
                        res = a / b;
                    } else {
                        System.out.println("Cant divide by zero!");
                    }
                }
                System.out.println(res);
            } else {
                System.out.println("Enter between 1 and 5");
            }
        }
    }
}
