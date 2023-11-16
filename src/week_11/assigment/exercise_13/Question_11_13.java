package week_11.assigment.exercise_13;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int NUMBERS_OF_LIST = 10;

        ArrayList<Integer> list1 = new ArrayList<>();

        System.out.print("Enter " + NUMBERS_OF_LIST + " integers : ");
        for (int i = 0; i < NUMBERS_OF_LIST; i++) {
            list1.add(input.nextInt());
        }

        removeDuplicate(list1);

        System.out.print("The distinct integers are ");
        for (Integer element : list1) {
            System.out.print(element + " ");
        }

    }

    public static void removeDuplicate(ArrayList<Integer> list1) {
        for (int i = 0; i < list1.size() - 1; i++) {
            for (int j = i + 1; j < list1.size(); j++) {
                if (list1.get(i) == list1.get(j)) {
                    list1.remove(j);
                    j--;

                }

            }

        }

    }


}

