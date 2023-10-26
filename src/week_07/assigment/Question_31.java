package week_07.assigment;

import java.util.Arrays;
import java.util.Scanner;

public class Question_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int SIZE_OF_LIST1 = 5;
        final int SIZE_OF_LIST2 = 4;

        System.out.print("Enter list1: ");
        int[] list1 = new int[SIZE_OF_LIST1];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }
        System.out.print("Enter list2: ");
        int[] list2 = new int[SIZE_OF_LIST2];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();

        }

        int[] mergedList = merge(list1, list2);
        System.out.print("The merged list is ");
        for (int i = 0; i < mergedList.length; i++) {
            System.out.print(mergedList[i] + " ");

        }


    }

    public static int[] merge(int[] list1, int[] list2) {

        int[] list3 = new int[list1.length + list2.length];


        for (int i = 0; i < list1.length; i++) {
            list3[i] = list1[i];
        }
        for (int i = 0; i < list2.length; i++) {
            list3[(list1.length) + i] = list2[i];
        }

        Arrays.sort(list3);
        return list3;
    }


}
