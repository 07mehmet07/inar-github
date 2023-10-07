package week_07.assigment;

import java.util.Scanner;

public class Question_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter list: ");
        int[] numbers = new int[input.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        if (isSorted(numbers)) {
            System.out.println("The list is already sorted");

        } else {
            System.out.println("The list is not sorted");

        }
    }

    public static boolean isSorted(int[] list) {
        boolean sorted = true;
        for (int i = 1; i < list.length; i++) {
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    sorted = false;
                    break;
                }

            }
        }
        return sorted;
    }
}
