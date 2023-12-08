package week_14.assigment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Question_14_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int)(Math.random() * 100));
        }
        System.out.println("Generated list: " + list);
        int k = (int)(Math.random() * 10 + 1);
        System.out.println("What is the "+ k + "th largest element?");
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println("The " + k + "th largest element is: " + list.get(k-1));


    }
}
