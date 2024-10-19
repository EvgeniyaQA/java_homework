package lesson06;

import java.util.Scanner;

public class QuestionsForTheTest {

    public static void main(String[] args) {
        System.out.println("Input 1 to continue and input 0 to exit. Be careful, you won't be able to return to the test in this case");
        Scanner scanner1 = new Scanner(System.in);
        int choice = scanner1.nextInt();
        while (true) {
            if (choice == 0) {
                break;

            } else if (choice == 1) {
                System.out.println("Please answer 10 questions choosing a, b or c. Only 1 answer is correct");

                Scanner scanner = new Scanner(System.in);
                int score = 0;
               System.out.println(Questions.q1);
                String input = scanner.next();
                char reply = input.charAt(0);
                if(reply=='a'|| reply=='b' || reply=='c'){
                    System.out.println("Enter the correct letter a, b or c");
                }
                if (reply == 'c') {
                    score = score + 1;
                } else {
                    score = score + 0;
                }
                System.out.println(Questions.q2);
                input = scanner.next();
                reply = input.charAt(0);
                if (reply == 'b') {
                    score = score + 1;
                } else {
                    score = score + 0;
                }
                System.out.println(Questions.q3);
                input = scanner.next();
                reply = input.charAt(0);
                if (reply == 'b') {
                    score = score + 1;
                } else {
                    score = score + 0;
                }
                System.out.println(Questions.q4);
                input = scanner.next();
                reply = input.charAt(0);
                if (reply == 'a') {
                    score = score + 1;
                } else {
                    score = score + 0;
                }

                System.out.println(Questions.q5);
                input = scanner.next();
                reply = input.charAt(0);
                if (reply == 'b') {
                    score = score + 1;
                } else {
                    score = score + 0;
                }

                System.out.println(Questions.q6);
                input = scanner.next();
                reply = input.charAt(0);
                if (reply == 'a') {
                    score = score + 2;
                } else {
                    score = score + 0;
                }

                System.out.println(Questions.q7);
                input = scanner.next();
                reply = input.charAt(0);
                if (reply == 'b') {
                    score = score + 2;
                } else {
                    score = score + 0;
                }

                System.out.println(Questions.q8);
                input = scanner.next();
                reply = input.charAt(0);
                if (reply == 'c') {
                    score = score + 2;
                } else {
                    score = score + 0;
                }

                System.out.println(Questions.q9);
                input = scanner.next();
                reply = input.charAt(0);
                if (reply == 'a') {
                    score = score + 2;
                } else {
                    score = score + 0;
                }

                System.out.println(Questions.q10);
                input = scanner.next();
                reply = input.charAt(0);
                if (reply == 'b') {
                    score = score + 2;
                } else {
                    score = score + 0;
                }

                System.out.println("Your result is " + score);

                if (score >= 12) {
                    System.out.println("Great result! Thanks for your efforts");
                } else if (score >= 9 && score < 12) {
                    System.out.println("Good results, please revise some topics");
                } else if (score <= 6 && score < 9) {
                    System.out.println("You should learn more, please study the topic again ");
                } else {
                    System.out.println("You are not allowed to move to a new topic. ");
                }
            }
            return;
        }
    }
}




