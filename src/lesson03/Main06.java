package lesson03;

import java.util.Scanner;

public class Main06 {
    public static String greet(String name) {
        return "Hello " + name + ", nice to meet you!";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats your name?");
        String name = scanner.nextLine();

        String greeting = greet(name);

        System.out.println(greeting);
    }
}
