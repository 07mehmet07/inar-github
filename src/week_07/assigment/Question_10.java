package week_07.assigment;

import java.util.Scanner;

public class Question_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];

        System.out.print("Enter ten numbers : ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        System.out.println("The minimum number is: " + numbers[indexOfSmallestElement(numbers)] + " index " + indexOfSmallestElement(numbers));
    }

    public static int indexOfSmallestElement(double[] array) {
        int minIndex = 0;
        double minimum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
                minIndex = i ;
            }
        }
        return minIndex ;

    }
}
