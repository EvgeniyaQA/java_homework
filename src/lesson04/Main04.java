package lesson04;

import java.util.Scanner;

public class Main04 {
    /*  Control operators:
        return - перериває виконання поточного методу (закінчує метод)
        break - перериває виконання поточного циклу (закінчує цикл)
        continue - перериває виконання поточної ітерації (починає наступну ітерацію)
        goto - не використовується
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.println("Enter positive number");
            n = scanner.nextInt();

            if (n < 0) {
                System.out.println("Incorrect value");
            } else {
                break;
            }
        } while (true);
        // тут буде продовження виконання після break
    }

}
