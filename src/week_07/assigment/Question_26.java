package week_07.assigment;

import java.util.Scanner;

public class Question_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int SIZE_OF_LIST = 6;

        System.out.print("Enter the list1 : ");

        int[] list1 = new int[SIZE_OF_LIST];

        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }

        System.out.print("Enter the list1 : ");

        int[] list2 = new int[SIZE_OF_LIST];

        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }

        if (equals(list1, list2)) {
            System.out.println("Two lists are strictly identical");
        } else {
            System.out.println("Two lists are not strictly identical");
        }
    }


    public static boolean equals(int[] list1, int[] list2) {

        boolean isEqual = true;

        if (list1.length != list2.length)
            isEqual = false;


        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i])
                isEqual = false;


        }
        return isEqual;
    }


}
