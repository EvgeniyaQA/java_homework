package lesson02;

import java.util.Scanner;

public class Homework_lesson02 {

    public static void main(String[] args) {
        String enterWeight = "Please, enter your weight in kilograms and press Enter";
        String enterHeight = "Please, enter your height in centimeters and press Enter";
        float result = enterData(enterWeight, enterHeight);
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
    }
    public static float enterData(String enterWeight, String enterHeight) {
            System.out.println(enterWeight);
            Scanner scanner = new Scanner(System.in);
            float weight = scanner.nextFloat();
            System.out.println(enterHeight);
            float height = scanner.nextFloat();
            float result = weight / ((height / 100) * (height / 100));
            return result;
        }
    }

