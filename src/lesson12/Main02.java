package lesson12;

public class Main02 {

    public static void main(String[] args) {
        /*
        Тернарний оператор (?:)
        1 Є if-else, в якому в тілі по одній строчці, в яких відрізняються лише значення
        2 Проста і коротка умова
        3 Відсутність else if

        Синтаксис:
        умова ? варіант true : варіант false
         */
        int n = 5;

        System.out.println(n % 2 == 0 ? "even" : "odd");

        if (n % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

    }
}
