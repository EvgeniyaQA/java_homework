package lesson06;

public class Main07 {
    public static void main(String[] args) {
        int[] arr = {4, 88, 1, -5, 11, 312, 98, 1, -6};

        int number = 312;
        int index = -1;
        // Алгоритм лінійного пошуку
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
