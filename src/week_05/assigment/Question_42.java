package week_05.assigment;

import java.util.Scanner;

public class Question_42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double commission = 0.0;
        double balance;
        double salesAmount;


        System.out.print("Enter the commission sought: ");
        double commissionSought = input.nextDouble();


        for (salesAmount = 0.01; commission < commissionSought; salesAmount += 0.01) {
            balance = commission = 0.0;


            if (salesAmount >= 10000.01)
                commission += (balance = salesAmount - 10000) * 0.12;


            if (salesAmount >= 5000.01)
                commission += (balance -= balance - 5000) * 0.10;


            if (salesAmount >= 0.01)
                commission += balance * 0.08;

        }


        System.out.println("Minimum sales to earn $" + (int) commissionSought + ": " + (int) salesAmount);

    }
}
