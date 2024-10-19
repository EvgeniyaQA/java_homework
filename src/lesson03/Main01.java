package lesson03;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("positive");
        } else if (num == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("negative");
        }
    }
}
