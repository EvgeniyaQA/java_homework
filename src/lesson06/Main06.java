package lesson06;

public class Main06 {
    public static void main(String[] args) {
        int[] arr = {4, 88, 1, -5, 11, 312, 98, 1, -6};

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);



    }
}
