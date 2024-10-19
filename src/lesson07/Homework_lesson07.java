package lesson07;

import java.util.Scanner;

public class Homework_lesson07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your weight in kilograms and press Enter");
        float weight = scanner.nextFloat();
        System.out.println("Please, enter your height in centimeters and press Enter");
        float height = scanner.nextFloat();
        float result = weight / ((height / 100) * (height / 100));
        if (result < 18.5) {
            System.out.println("You are underweight. Please urgently consult a dietitian.");
        } else if (result >= 18.5 && result <= 24.9) {
            System.out.println("Your Body Mass Index is perfect. You have a normal weight.");
        } else if (result >= 25 && result <= 29.9) {
            System.out.println("You are overweight. Please consult a dietitian.");
        } else {
            System.out.println("Your have an obesity. Please urgently consult a dietitian.");
        }
        System.out.println("Your BMI is" + " " + result + ".");
    }
}
