package lesson03;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        // (-.. 1) (10..+)
        if (num < 1 || num > 10) {
            System.out.println("Number not in range!");
        } else {
            System.out.println("Number in range!!!");
        }

        /*
        if (!(num > 1 && num < 10)) {
            System.out.println("Number not in range!");
        } else {
            System.out.println("Number in range!!!");
        }
         */
    }
}
