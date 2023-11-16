package week_11.assigment.exercise_04;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Question_11_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter a sequence of number ends with 0:");

        int number = input.nextInt();

        while (number != 0) {
            list.add(number);
            number = input.nextInt();

        }

        System.out.println("The largest number in the list is " + max(list));
    }

    public static Integer max(ArrayList<Integer> list) {

        if (list.isEmpty()) {
            System.out.println("List is empty");
        }

        return Collections.max(list);
    }


}
