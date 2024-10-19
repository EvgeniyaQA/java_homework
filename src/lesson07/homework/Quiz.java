package lesson07.homework;

import java.util.Scanner;

import static lesson07.homework.Questions.*;


public class Quiz {


    public static void main(String[] args) {
        System.out.println("This is Quiz on topic 'Basic java programming'");
        System.out.println("Input 1 to continue and input 0 to exit. Be careful, you won't be able to return to the test in this case");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Please answer 10 questions choosing a, b or c. Only 1 answer is correct");
            int score = 0;

            String[] questions = {q1, q2, q3, q4, q5, q6, q7, q8, q9, q10};
            int[] scores = {1, 1, 1, 1, 1, 2, 2, 2, 2, 2 };
            String answers = "cbbababcab";

            for (int i = 0; i < questions.length; i++) {
                score += askQuizQuestion(questions[i], answers.toCharArray()[i], scores[i]);
            }

            System.out.println("Your result is " + score);

            int greatGrade = 12;
            int goodGrade = 9;
            int passGrade = 6;
            String greatMessage = "Great result! Thanks for your efforts";


            if (score >= greatGrade) {
                System.out.println(greatMessage);
            } else if (score >= goodGrade) {
                System.out.println("Good results, please study the topic again");
            } else if (score >= passGrade) {
                System.out.println("You should learn more, please study the topic again ");
            } else {
                System.out.println("You are not allowed to move to a new topic. ");
            }
        }

    }

    public static int askQuizQuestion(String question, char correctAnswer, int scoreForAnswer) {
        System.out.println(question);
        Scanner scanner = new Scanner(System.in);
        char reply;
        do {
            String input = scanner.next();
            reply = input.charAt(0);
        } while (reply != 'a' && reply != 'b' && reply != 'c');

        if (reply == correctAnswer) {
            return scoreForAnswer;
        }
        return 0;
    }
}




