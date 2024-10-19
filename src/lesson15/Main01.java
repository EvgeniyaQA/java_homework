package lesson15;

public class Main01 {
    public static void main(String[] args) {
        /*
        Вивести лише строки до 5 символів, якщо буде строка довша за 10, припинити обробку
         */
        String[] arr = {"abc", "apple", "grape", "hello there", "aaaaaaaaaaa", "12"};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() <= 5) {
                System.out.println(arr[i]);
            }
            if (arr[i].length() > 10) {
                break;
            }
        }
    }
}
