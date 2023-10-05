package week_07.assigment;

import java.util.Scanner;

public class Question_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter five numbers: ");
        int [] numbers = new int[5];
        for(int i = 0; i < numbers.length; i++){
           numbers[i] = input.nextInt();
        }
        System.out.println("The greatest common divisor is " + gcd(numbers));
    }
    public static int gcd(int... numbers) {
        int minimum = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }

        }
        int divisior = 1;
        int gcd = 0;
        boolean isGcd = false;


        while (divisior <= minimum) {

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % divisior == 0) {
                    isGcd = true;
                } else {
                    isGcd = false;
                    break;
                }
            }
            if (isGcd) {
                gcd = divisior;
            }
            divisior++;
        }

        return gcd;

    }
}