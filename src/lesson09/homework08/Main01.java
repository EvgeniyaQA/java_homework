package lesson09.homework08;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        double a;
        double b;
        a = dataInput("Please enter a");
        b = dataInput("Please enter b");
        double result = doCalculation(a,  b);
        printResults(a, b, result);

    }
    public static double dataInput(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static double doCalculation(double a, double b){
        return -b / a;
    }
    public static void printResults(double value1, double value2, double result){
        System.out.println("a = " + value1);
        System.out.println("b = " + value2);
        System.out.println("ax +b = " + result);
    }
}
