package week_05.assigment;

import java.util.Scanner;

public class Question_30 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount (e.g., 100): ");
        double amount = input.nextDouble();
        System.out.print("Enter the annual interest rate (e.g., 5): ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter the number of months (e.g., 6): ");
        int months = input.nextInt();

        double monthlyInterestRate = annualInterestRate / 1200;

        double totalValue = 0;

        for (int m = 1; m <= months; m++) {
            totalValue = (amount + totalValue) * (1 + monthlyInterestRate);

        }

        System.out.println("Amount in savings account after " + months + "months : " + totalValue);
    }
}
