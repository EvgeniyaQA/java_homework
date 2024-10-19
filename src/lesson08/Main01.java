package lesson08;

import java.util.Random;

public class Main01 {
    // ГВЧ (RNG)
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt();
        System.out.println(number);
    }
}
