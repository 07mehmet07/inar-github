package week_11.assigment.exercise_16;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        ArrayList <Integer> answers = new ArrayList<>();
        System.out.printf("What is %d + %d?%n", number1, number2);

        int replying = input.nextInt();
        answers.add(replying);

while (replying != number1 + number2){

    System.out.printf("Wrong answer. Try again. What is %d + %d?%n", number1, number2);
    replying = input.nextInt();

    if (answers.contains(replying)){
        System.out.printf("You already entered %d%n", replying);
        continue;
    }
   else
       answers.add(replying);


}

        System.out.println("You got it");


    }
}
