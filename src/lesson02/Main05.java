package lesson02;

import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
