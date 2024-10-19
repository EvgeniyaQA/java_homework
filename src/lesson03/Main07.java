package lesson03;

public class Main07 {

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double div(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        // (7 + 3) / 4
        System.out.println(div(sum(7, 3), 4));
    }
}
