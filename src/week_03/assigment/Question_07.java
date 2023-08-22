package week_03.assigment;

import java.util.Scanner;

public class Question_07 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount (e.g 11,56): ");
        double amount = input.nextDouble();

        int mainAmount = (int) (amount * 100);

        int numberOfDollars = mainAmount / 100;
        mainAmount %= 100;
        int numberOfQuarters = mainAmount / 25;
        mainAmount %= 25;
        int numberOfDimes = mainAmount / 10;
        mainAmount %= 10;
        int numberOfNickels = mainAmount / 5;
        mainAmount %= 5;
        int numberOfPennies = mainAmount;
        System.out.println("Your amount " + amount + " consist of");
        if (numberOfDollars <= 1) {
            System.out.println(numberOfDollars + " dollar");
        } else {
            System.out.println(numberOfDollars + " dollars");
        }
        if (numberOfQuarters <= 1) {
            System.out.println(numberOfQuarters + " quarter");
        } else {
            System.out.println(numberOfQuarters + " quarters");
        }
        if (numberOfDimes <= 1) {
            System.out.println(numberOfDimes + " dime");
        } else {
            System.out.println(numberOfDimes + " dimes");
        }
        if (numberOfNickels <= 1) {
            System.out.println(numberOfNickels + " nickel");
        } else {
            System.out.println(numberOfNickels + " nickels");
        }

        if (numberOfPennies <= 1) {
            System.out.println(numberOfPennies + " penny");
        } else {
            System.out.println(numberOfPennies + " pennies");
        }

    }

}
