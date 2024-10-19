package lesson14.homework13;

import java.util.Scanner;

public class HW_14 {
    private static int powder = 500;
    private static int water = 600;
    private static int milk = 90;
    private static int cup = 51;

    public static void main(String[] args) {
        int availability = checkIngredients(50, 500, 700, 3000);
        int total = 0;
        int money = 0;
        int startingMenu = selectStartingOptions();
        if (startingMenu == 0) {
            switch (availability) {
                case 0:
                    System.out.println("Not enough ingredients to make a coffee!");
                    break;
                case 1:
                    System.out.println("You can buy only Espresso");
                    showSelectionMenuEspresso();
                    break;
                case 2:
                    System.out.println("You can buy only Espresso or Americano");
                    showSelectionMenuEspressoAmericano();
                    break;
                default:
                    showSelectionMenuEspressoAmericanoLatte();
                    selectCoffee();
            }
        }
        selectCoffee();
        total = takeMoneyFromCustomer(total, money);
        compareMoney(total, money);
    }

    public static int selectCoffee() {
        int total = 0;
        int amount = 0;
        int money = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int selection = scanner.nextInt();
            if (selection == 1 || selection == 2 || selection == 3) {
                if (selection == 1) {
                    amount = 3;
                } else if (selection == 2) {
                    amount = 5;
                } else if (selection == 3) {
                    amount = 7;
                }
                total += amount;
            }

            if (selection == 0 && total > 0) {
                takeMoneyFromCustomer(total, money);
                break;
            }
        }
        return total;
    }

    private static void enterCode() {
        while (true) {
            System.out.println("Please, enter the code");
            Scanner scanner = new Scanner(System.in);
            int enterCode = scanner.nextInt();
            if (enterCode == 8956) {
                System.out.println("Machine is open");
                checkIngredients(cup, powder, water, milk);
                if (cup < 50 || powder < 500 || water < 700 || milk < 3000) {
                    System.out.println("You need to refill the machine. Refill now? Press 9 to continue");
                    scanner = new Scanner(System.in);
                    int refillSelection = scanner.nextInt();
                    if (refillSelection == 9) {
                        refill();
                        System.out.println("Ingredients are added");
                        return;
                    }
                } else {
                    System.out.println("No need to refill the machine");
                }
            }
            System.out.println("Code is invalid");
        }
    }

    public static int checkIngredients(int cup, double powder, double water, double milk) {
        int availability = 0;
        if (cup < 1 || powder < 15 || water < 150) {
            availability = 0;
        } else if (powder < 25 || water < 350) {
            availability = 1;
        } else if (milk < 170) {
            availability = 2;
        } else {
            availability = 3;
        }
        return availability;
    }

    public static int selectStartingOptions() {
        System.out.println("Hello! Please press 0 to buy a coffee or 1 to open up the machine");
        Scanner scanner = new Scanner(System.in);
        int startingMenu = scanner.nextInt();
        switch (startingMenu) {
            case 0:
                break;
            case 1:
                enterCode();
        }
        return startingMenu;
    }

    public static void refill() {
        cup = 100;
        powder = 500;
        water = 700;
        milk = 3000;
    }

    private static void showSelectionMenuEspresso() {
        System.out.println("Please, choose your coffee. You may select several types at the same time:" + " " +
                "\n" +
                "Press 1 to select Espresso." + "\n" +
                "Press 0 to return to main menu or proceed with payment");
    }

    private static void showSelectionMenuEspressoAmericano() {
        System.out.println("Please, choose your coffee. You may select several types at the same time:" + " " +
                "\n" +
                "Press 1 to select Espresso." + "\n" +
                "Press 2 to select Americano." + "\n" +
                "Press 0 to return to main menu or proceed with payment");
    }

    private static void showSelectionMenuEspressoAmericanoLatte() {
        System.out.println("Please, choose your coffee. You may select several types at the same time:" + " " +
                "\n" +
                "Press 1 to select Espresso." + "\n" +
                "Press 2 to select Americano." + "\n" +
                "Press 3 to select Latte." + "\n" +
                "Press 0 to return to main menu or proceed with payment");
    }

    public static int takeMoneyFromCustomer(int total, int money) {
        if (total > 0) {
            System.out.println("Please pay $" + total);
            System.out.println("Insert money");
            Scanner scanner = new Scanner(System.in);
            money = scanner.nextInt();
        }
        return compareMoney(total, money);
    }

    public static int compareMoney(int total, int money) {
        int difference = total - money;
        while (difference != 0) {
            System.out.println("Wrong amount, difference is " + " " + difference);
            takeMoneyFromCustomer(total, money);
        }
        System.out.println("Please, take your coffee");
        return 0;//щось не можу закінчити програму
    }
}






