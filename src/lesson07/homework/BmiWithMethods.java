package lesson07.homework;

import java.util.Scanner;

public class BmiWithMethods {

    public static void main(String[] args) {
        showQuestions();
        Scanner scanner = new Scanner(System.in);
       float weight = scanner.nextFloat();
        float height = scanner.nextFloat();
        float result =doCalculation(weight,height);
        displayResults(result);
    }
    public static void showQuestions(){
        String enterWeight = "Please, enter your weight in kilograms and press Enter";
        String enterHeight = "Please, enter your height in centimeters and press Enter";
        System.out.println(enterWeight);
        System.out.println(enterHeight);
    }
    public static float doCalculation(float weight, float height) {
        float result= weight / ((height / 100) * (height / 100));
        return result;
    }
    public static void displayResults(float result) {
        float underweight = 18.4F;
        float normal = 24.9F;
        float overweight = 29.9F;
        if (result < underweight) {
            System.out.println("You are underweight. Please urgently consult a dietitian.");
        } else if (result <= normal) {
            System.out.println("Your Body Mass Index is perfect. You have a normal weight.");
        } else if (result <= overweight) {
            System.out.println("You are overweight. Please consult a dietitian.");
        } else System.out.println("Your have an obesity. Please urgently consult a dietitian.");
        System.out.println("Your BMI is" + " " + result + ".");
        System.out.println(result);
    }
}

