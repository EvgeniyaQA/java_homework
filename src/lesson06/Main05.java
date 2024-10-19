package lesson06;

public class Main05 {
    public static void main(String[] args) {
        String[] products = {"tomato", "cucumbers", "cabbage", "apple"};
        String pick = "orange";

        int index = -1;
        for (int i = 0; i < products.length; i++) {
            if (pick == products[i]) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("I have " + pick + ", how much do you need?");
        } else {
            System.out.println("I dont have " + pick);
        }
    }
}
