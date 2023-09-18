package week_05.assigment;

import java.util.Scanner;

public class Question_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer :");
        int num1 = input.nextInt();
        System.out.print("Enter second integer :");
        int num2 = input.nextInt();

        int gcd = 1;
        int d = 2;

        while (d <= num1 && d <= num2) {
            if (num1 % d == 0 && num2 % d == 0)
                gcd = d;
            gcd++;
        }
        System.out.print("The greatest common divisor for " + num1 + " and " + num2 + " is " + gcd);

    }
}
