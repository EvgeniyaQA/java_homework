package lesson06;

import java.util.Scanner;

public class HWtest1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please answer 10 questions choosing a, b or c. Only 1 answer is correct");
        System.out.println("Input 0 to exit. Be careful, you won't be able to return to the test in this case");
        System.out.println("Type START to start the test");
       // for (int i = 0; i<10;i++) {
            while (true) {
                int item= scanner.nextInt();

                System.out.println(item);

        }
    }
    }

