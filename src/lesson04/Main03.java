package lesson04;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

        do {
            System.out.println("Enter positive number");
            n = scanner.nextInt();
        } while (n < 0);
    }
}
