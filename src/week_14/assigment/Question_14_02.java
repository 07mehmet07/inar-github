package week_14.assigment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Question_14_02 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add((int) (Math.random() * 100));
        }
        System.out.println("Generated array list\n" + list);
        Collections.sort(list);

        HashSet<Integer> list2 = new HashSet<>();

        for (int i = 0; i < list.size(); i++) {
            list2.add(list.get(i));
        }

        System.out.println("Arraylist after removing duplicates \n" + list2);


    }
}
