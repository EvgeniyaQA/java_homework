package lesson03;

import java.util.Scanner;

public class Main05 {

    public static void greet(String name) {
        System.out.println("Hello " + name + ", nice to meet you!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats your name?");
        String name = scanner.nextLine();

        greet(name);

    }
}
