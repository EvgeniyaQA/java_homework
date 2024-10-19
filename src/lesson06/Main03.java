package lesson06;

public class Main03 {
    public static void main(String[] args) {
        int[] arr = new int[1000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 7 == 0) {
                count++;
                System.out.print(arr[i] + " ");
            }

        }
        System.out.println("\n" + count);


    }
}
