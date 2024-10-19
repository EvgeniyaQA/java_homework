package lesson08;

import java.util.Random;

public class Main03 {
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

        int negCount = 0;
        int posCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negCount++;
            } else {
                posCount++;
            }
        }

        System.out.println("Positive count: " + posCount);
        System.out.println("Negative count: " + negCount);

    }
}
