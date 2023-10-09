package week_07.assigment;

import java.util.Scanner;

public class Question_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers : ");
        int[] list = new int[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();

        }
        printAllCombinations(list);

    }


    public static void printAllCombinations(int[] list) {

        for (int i = 0; i < list.length; i++) {

            for (int j = 0; j < list.length; j++) {

                if (i != j) {

                    System.out.println(list[i] + "\t" + list[j]);

                }

            }

        }

    }
}
