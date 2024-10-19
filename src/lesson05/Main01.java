package lesson05;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        // Програма отримує від користувача два числа і ділить одне на інше
        double a;
        double b;
        Scanner scanner = new Scanner(System.in);

        a = scanner.nextDouble();
        b = scanner.nextDouble();

        if (b != 0) {
            double res = a / b;
            System.out.println(res);
        } else {
            System.out.println("Cant divide by zero!");
        }

    }
}
