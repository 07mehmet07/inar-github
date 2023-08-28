package week_03.assigment;

import java.util.Scanner;

public class Question_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double exchangeRate = input.nextDouble();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa:");
        int convert = input.nextInt();


        switch (convert) {
            case 0:
                System.out.print("Enter the dollar amount: ");
                double amount = input.nextDouble();
                System.out.println("$" + amount + " is " + ((amount * exchangeRate) * 100) / 100. + " yuan");
                break;
            case 1:
                System.out.print("Enter the RMB amount: ");
                amount = input.nextDouble();
                System.out.println(amount + " yuan is " + (int) ((amount / exchangeRate) * 100) / 100. + " dollars");

        }if (convert > 1){
            System.out.println("incorrect input");
        }







    }
        }









