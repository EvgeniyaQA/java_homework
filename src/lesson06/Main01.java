package lesson06;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        double a;
        double b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /");
        System.out.println("5. Exit");

        int menu = scanner.nextInt();
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        double res = 11; // example test value
        if (menu == 1) {
            res = a + b;
        }
        if (menu == 2) {
            res = a - b;
        }
        if (menu == 3) {
            res = a * b;
        }
        if (menu == 4) {
            if (b != 0) {
                res = a / b;
            } else {
                System.out.println("Cant divide by zero!");
                res = 0;
            }
        }
        if (menu == 5) {
            return;
        } else {
            System.out.println("Enter between 1 and 5");
        }
        System.out.println(res);

    }
}
