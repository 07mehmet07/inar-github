package week_11.assigment.exercise_07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_11_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();


        System.out.print("Enter a list of integers ending with 0 : ");

        int numbers = input.nextInt();
        while (numbers != 0) {
            list.add(numbers);
            numbers = input.nextInt();
        }

        System.out.println("\nBefore shuffling :");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");

        }


        System.out.println("\nAfter shuffling :");
        shuffle(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");


        }
    }


    public static void shuffle(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            System.out.println("List is empty");
        }
        Collections.shuffle(list);
    }


}
