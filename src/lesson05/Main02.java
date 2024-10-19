package lesson05;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        // Програма отримує від користувача два числа і ділить одне на інше
        double a;
        double b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input two numbers to divide");
        System.out.println("Input 0 0 to exit");

        while (true) {
            a = scanner.nextDouble();
            b = scanner.nextDouble();

            if (b != 0) {
                double res = a / b;
                System.out.println(res);
            } else {
                if (a == 0) {
                    break;
                }
                System.out.println("Cant divide by zero!");
            }
        }
    }
}
