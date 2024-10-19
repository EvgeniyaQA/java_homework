package lesson08;

import java.util.Scanner;

public class Hw_lesson_08 {
    public static void main(String[] args) {
        double value1;
        double value2;
         value1 = dataInput();
         value2= dataInput();
        double result = doCalculation( value1,  value2);
        printResults(value1, value2, result);

    }
    public static double dataInput(){
        System.out.println("Please enter value");
        Scanner scanner= new Scanner(System.in);
        double value = scanner.nextDouble();
         return value;
    }

    public static double doCalculation(double value1, double value2){
        double result = value2/value1;
        return result;
    }
    public static void printResults(double value1, double value2, double result){
        System.out.println("a = " +value1);
        System.out.println("b = " +value2);
        System.out.println("ax +b = " +result);
    }
}
