package week_05.assigment;

import java.util.Scanner;

public class Question_45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten ages: ");
        double sum1 = 0;
        double sum2 = 0;

        double i = 0;
        for (i = 0; i < 10; i++) {
            double numbers = input.nextDouble();
            sum1 += numbers;
            sum2 += Math.pow(numbers, 2);

        }
        double sum3 = Math.pow(sum1, 2) / i;
        double deviation = Math.sqrt((sum2 - sum3) / (i - 1));
        double mean = sum1 / i;
        System.out.println("The mean is " + mean);
        System.out.println("The standart deviation is " + deviation);
    }
}
