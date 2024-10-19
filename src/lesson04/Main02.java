package lesson04;

import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        while (n < 0) {
            System.out.println("Incorrect value!");
            n = scanner.nextInt();
        }

    }
}
