package lesson09;

import java.util.Random;

public class Main01 {
    // Method overload
    public static int generateRandomNumber(int min, int max) {
        return min + new Random().nextInt(max - min + 1);
    }

    public static double generateRandomNumber(double min, double max) {
        return ((max - min) * new Random().nextDouble()) + min;
    }

    public static int[] generateRandomArray(int min, int max, int length) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = generateRandomNumber(min, max);
        }
        return array;
    }

    public static int[] generateRandomArray(int length) {
        return generateRandomArray(1, 100, length);
    }

    public static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {4, 77, 81, 23, 11};
        int index = linearSearch(a, 11);
        System.out.println(index);
    }
}
