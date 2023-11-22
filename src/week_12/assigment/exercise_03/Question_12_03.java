package week_12.assigment.exercise_03;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }

        try {
            System.out.print("Enter the index of the Array : ");
            int index = input.nextInt();
            System.out.println("You chose : " + numbers[index]);

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds .!!");
        }


    }
}
