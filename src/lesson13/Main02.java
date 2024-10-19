package lesson13;

public class Main02 {

    public static void read(int[] arr) {
        for (int i= 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void update(int[] arr, int index, int newValue) {
        arr[index] = newValue;
    }

    public static int[] delete(int[] arr, int index) {
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        int[] newArray = new int[arr.length - 1];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = arr[i];
        }
        return newArray;
    }

    public static int[] create(int[] arr, int index, int newValue) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            if (i < index) {
                newArr[i] = arr[i];
            } else {
                newArr[i + 1] = arr[i];
            }
        }
        newArr[index] = newValue;
        return newArr;
    }

    public static void main(String[] args) {
        /*
        CRUD - Create, Read, Update, Delete
         */
        int[] arr = {6, 7, 4, 2};
        read(arr);
        arr = delete(arr, 1);
        read(arr);
        arr = create(arr, 2, 5);
        read(arr);


    }
}
