package lesson03;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        // 1 < x < 10
        if (num > 1 && num < 10) {
            System.out.println("Number in range!");
        } else {
            System.out.println("Not in range!!!");
        }
    }
}
