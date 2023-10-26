package week_07.assigment;

import java.util.Scanner;

public class Question_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of list : ");
        int size = input.nextInt();
        System.out.print("Enter list : ");
        int[] list1 = new int[size];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();

        }

        int[] partitionList = partition(list1);
        for (int numbers : partitionList) {
            System.out.print(numbers + "\t");
        }
    }


    public static int[] partition(int[] list1) {

        int[] result = new int[list1.length];
        int pivot = list1[0];
        int count = 0;
        for (int i = 0; i < list1.length; i++) {
            if (pivot > list1[i]) {
                result[count] = list1[i];
                count++;
            }
        }
        result[count] = pivot;
        count++;
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] > pivot) {

                result[count] = list1[i];
                count++;
            }
        }
        return result;
    }
}

