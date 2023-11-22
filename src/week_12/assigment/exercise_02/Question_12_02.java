package week_12.assigment.exercise_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_12_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isCorrect = true;
        do {
            try {
                System.out.print("Enter two integers numbers to sum  :");
                int a = input.nextInt();
                int b = input.nextInt();
                System.out.println("sum  of " + a + " + " + b + " is " + (a + b));
                isCorrect = false;
            } catch (InputMismatchException ex) {
                System.out.println(ex);
                System.out.println("Wrong input !! Please enter integer");
                input.nextLine();
            }

        }while (isCorrect);

    }
}

