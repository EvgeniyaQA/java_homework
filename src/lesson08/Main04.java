package lesson08;

import java.util.Random;

public class Main04 {
    public static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        int n = min + random.nextInt(max - min + 1);

        return n;
    }

    public static String generateRandomString(int length) {
        String text = "";
        for (int i = 0; i < length; i++) {
            text += (char)generateRandomNumber(32, 126);
        }
        return text;
    }
//Windows 1251

    public static void main(String[] args) {
        String randomText = generateRandomString(32);
        System.out.println(randomText);
    }
}
