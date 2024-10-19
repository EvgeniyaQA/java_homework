package lesson08;

import java.util.Random;

public class Main03_HW8 {
    public static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        int n = min + random.nextInt(max - min + 1);

        return n;
    }

    public static void main(String[] args) {
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = generateRandomNumber(-10, 10);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        calculateEvenNumbers(array);
        calculateMoreThanFourNumbers(array);

    }

    public static void calculateEvenNumbers(int array[]) {
        int evenNumbers = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 == 0) {
              int [] evenNumbersArray = new int[]{array[j]};
                System.out.print(evenNumbersArray + " ");
            }
        }
        for (int i = 0; i < array.length; i++) {
             evenNumbers = 0;
            if (array[i] % 2 == 0)
                evenNumbers++;
            System.out.print("" + evenNumbers);
        }
        System.out.println("Even numbers: " + evenNumbers);
    }

    public static void calculateMoreThanFourNumbers(int array[]) {
        int moreFour = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > 4) {
                moreFour = array[j];
                System.out.print(moreFour + " ");
            }
        }

            for (int i = 0; i < array.length; i++) {
                if (array[i] > 4)
                    moreFour++;
            }
            System.out.println("Values that are more than 4: " + moreFour);
        }
    }
