package lesson14.homework13;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result;

        while (true) {
            System.out.println("Please, select the value from 1 to 4 to apply the operator for 2 values" +
                    " or enter 5 to exit the program: " +
                    "\n" +
                    "1. +\n" +
                    "2. -\n" +
                    "3. *\n" +
                    "4. /\n" +
                    "5. Exit");
            int option = scanner.nextInt();
            if (option == 5) {
                break;
            } else if (option == 1 || option == 2 || option == 3 || option == 4) {
                result = chooseOption(option);
                System.out.println(result);
            }
            else{
                System.out.println("Please, enter the correct value");
            }
        }
    }

    public static int chooseOption(int option) {
        System.out.println("Please, enter 2 values");
        Scanner scanner = new Scanner(System.in);
        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();
        int result = 0;
        switch (option) {
            case 1:
                result = value1 + value2;
                break;
            case 2:
                result = value1 - value2;
                break;
            case 3:
                result = value1 * value2;
                break;
            case 4:
                result = value1 / value2;
        }
        return result;
    }
}
