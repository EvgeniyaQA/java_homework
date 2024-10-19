package lesson09;

import static lesson09.Main01.generateRandomNumber;

public class HW09_2 {
    public static void main(String[] args) {// With a help of second array
        int []array2;
        int[] array = generateRandomArray(-100, 100);
        print(array);
        array2 = reverse(array);
        print(array2);
    }
    public static int[] reverse(int[] array) {
        int [] array2 = new int[10];
        int i = 1;
        System.out.println();
        while (i <= array.length) {
            for (int j = 0; j < array.length; j++) {
               array2[j] = array[array.length - i];
                i++;
            }
        }
        return array2;
    }

    public static int[] print(int[] array) {
        for (int i = 0; i < array.length; i++) {
           System.out.print(array[i] + " ");
        }
        return array;
    }

    public static int [] generateRandomArray(int min, int max) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = generateRandomNumber(min, max);
        }
        return array;
    }
    }

