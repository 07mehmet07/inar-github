package week_14.assigment;

import java.util.*;

public class Question_14_21 {
    public static void main(String[] args) {

        Set<Integer> list = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 20));
        }
        System.out.print("Enter the first list : " + list);

        Set<Integer> list1 = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            list1.add((int) (Math.random() * 20));
        }
        System.out.print("\nEnter the second list : " + list1);

        if (list.retainAll(list1)) {
            System.out.println("\nIntersection of the two lists : " + list);
        } else {
            System.out.println("\nthere isn't Intersection of the two lists");

        }

    }
}
