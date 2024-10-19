package lesson04;

public class Main01 {

    public static void greetPerson(String name, boolean formal) {
        if (formal) {
            System.out.println("Good day, " + name + "!");
        } else {
            System.out.println("Hello there " + name);
        }
    }

    public static void main(String[] args) {
        greetPerson("fdsd",true);
    }
}
