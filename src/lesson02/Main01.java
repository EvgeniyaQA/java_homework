package lesson02;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your height:");
        double height = scanner.nextDouble();
        // конкатенація (concatenation) - об'єднання строк з іншими строками або іншими значеннями
        System.out.println("Your height " + height);
    }
}
