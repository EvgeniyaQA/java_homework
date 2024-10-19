package lesson13;

import java.util.Scanner;

public class HW13_2 {
    public static void main(String[] args) {
        System.out.println("Please, enter day");
        Scanner scanner = new Scanner(System.in);
        String day = scanner.next();
        System.out.println("Please, enter quantity of days");
        int days = scanner.nextInt();
        String result= null;
        String day1 = "Monday";
        day1= String.valueOf(1);
        String day2 = "Tuesday";
        day2= String.valueOf(2);
        String day3 = "Wednesday";
        day3= String.valueOf(3);
        String day4 = "Thursday";
        day4= String.valueOf(4);
        String day5 = "Friday";
        day5= String.valueOf(5);
        String day6 = "Saturday";
        day6= String.valueOf(6);
        String day7 = "Sunday";
        day7= String.valueOf(7);


        if(days==0){
            result =day;
        }
        if(days==1){
            result = (day+1);
            System.out.println(String.valueOf(result));
        }

        switch (day) {
            case "Monday":

            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
            case "Saturday":
            case "Sunday":
                System.out.println(result);
               // showResult(day);

        }

    }

   /* public static void showResult(String days) {
        switch (days) {
            case 1:
                System.out.println(day);
                break;
            case 1:
                System.out.println(day+1);
                break;
            case 2:
                System.out.println(day+2);
                break;
            case 3:
                System.out.println(day+3);
                break;
            case 4:
                System.out.println(day+4);
                break;
            case 5:
                System.out.println(day+5);
                break;
            case 6:
                System.out.println(day+6);
                break;
            case 7:
                System.out.println(day+7);
                break;
        }*/
    }

