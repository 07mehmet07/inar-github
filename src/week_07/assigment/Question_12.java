package week_07.assigment;

import java.util.Scanner;

public class Question_12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.print("Enter ten numbers : ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        reverse(numbers);

        for (int a : numbers) {
            System.out.print(a + "\t");
        }
    }


    public static int[] reverse(int[] result) {

        for (int i = 0, j = result.length - 1; i < j; i++, j--) {

            int temp = result[i];
            result[i] = result[j];
            result[j] = temp;

        }

        return result;
    }
}
