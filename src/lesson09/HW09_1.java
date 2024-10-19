package lesson09;

import java.util.Scanner;

public class HW09_1 {
    public static void main(String[] args) {
        int decision = displayQuestions();
        double degrees = enterDegrees();
        double result;
        if(decision==1){
            result = toFahrenheit(degrees);
            System.out.println(result);
        }
        else if (decision==0){
            result = toCelsius(degrees);
            System.out.println(result);
        }
    }
     public static int displayQuestions(){
         System.out.println("If you want to transfer from Celsius to Fahrenheit, press 1");
         System.out.println("If you want to transfer from Fahrenheit to Celsius press 0");
         Scanner scanner = new Scanner(System.in);
         int decision = scanner.nextInt();
         if(decision!=1 && decision!=0){
             System.out.println("Wrong value");
             return displayQuestions();
         }
         else if (decision==1||decision==0){
         }
         return decision;
     }
     public static double enterDegrees(){
         System.out.println("Please enter degrees");
         Scanner scanner = new Scanner(System.in);
         double degrees = scanner.nextDouble();
         return degrees;
     }
     public static double toCelsius(double degrees){
         return (degrees-32)/1.8;
     }
    public static double toFahrenheit(double degrees){
        return (degrees*1.8 + 32);
    }
}
