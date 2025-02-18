package lesson09;

import static lesson09.Main01.generateRandomNumber;

public class HW09_3 {
    public static void main(String[] args) {//With a help of Swap algorithm
        int[] array = generateRandomArray(-100, 100);
        print(array);
        array = reverse(array);
        print(array);
    }

    public static int[] reverse(int[] array) {
        System.out.println();
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[array.length - j - 1];
            array[array.length - j - 1] = temp;
        }
        return array;
    }

    public static int[] print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        return array;
    }

    public static int[] generateRandomArray(int min, int max) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = generateRandomNumber(min, max);
        }
        return array;
    }
}

