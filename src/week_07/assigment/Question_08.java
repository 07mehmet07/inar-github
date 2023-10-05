package week_07.assigment;

import java.util.Scanner;

public class Question_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];

        System.out.print("Enter ten values of double type : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        System.out.println("The avarege of value :" + (avarege(numbers)));
    }


    public static int avarege(int[] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    public static double avarege(double[] array) {

        double sum = 0;
        for (int i = 0; i < array.length; i++) {

            sum += array[i];

        }
        return sum / array.length;
    }


}
