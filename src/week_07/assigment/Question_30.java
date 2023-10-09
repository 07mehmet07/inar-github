package week_07.assigment;

import java.util.Scanner;

public class Question_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int numberOfValues = input.nextInt();

        System.out.print("Enter the values: ");

        int[] values = new int[numberOfValues];
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextInt();
        }
        if (isConsecutiveFour(values)) {
            System.out.println("The list has consecutive fours.");
        } else {
            System.out.println("The list has no consecutive fours.");
        }
    }

    public static boolean isConsecutiveFour(int[] values) {

        int count = 0;
        
        for (int i = 0; i < values.length; i++) {
            for (int j = i + 1; j < values.length; j++) {
                if (values[i] != values[j]) {
                    break;
                } else {
                    count++;
                    if (count == 4) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
