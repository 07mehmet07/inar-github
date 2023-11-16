package week_11.assigment.exercise_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_11_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();


        System.out.print("Enter a list of integers ending with 0 : ");

        int numbers = input.nextInt();
        while (numbers != 0) {
            list.add(numbers);
            numbers = input.nextInt();
        }

        System.out.println("\nBefore sorting :");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");

        }


        System.out.println("\nAfter sorting :");
        sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");


        }
    }


    public static void sort(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            System.out.println("List is empty");
        }
        Collections.sort(list);
    }


}

