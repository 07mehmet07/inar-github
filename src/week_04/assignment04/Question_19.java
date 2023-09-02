package week_04.assignment04;

import java.util.Scanner;

public class Question_19 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of ISBN as a String : ");
        String number = input.nextLine();

        int digit1 = number.charAt(0) - '0';
        int digit2 = number.charAt(1) - '0';
        int digit3 = number.charAt(2) - '0';
        int digit4 = number.charAt(3) - '0';
        int digit5 = number.charAt(4) - '0';
        int digit6 = number.charAt(5) - '0';
        int digit7 = number.charAt(6) - '0';
        int digit8 = number.charAt(7) - '0';
        int digit9 = number.charAt(8) - '0';

        int checkSum = (digit1 + (digit2 * 2) + (digit3 * 3) + (digit4 * 4) + (digit5 * 5) +
                (digit6 * 6) + (digit7 * 7) + (digit8 * 8) + (digit9 * 9)) % 11;

        if (checkSum == 10) {
            System.out.println("The ISBN-10 number is " + number + "X");
        } else {
            System.out.println("The ISBN-10 number is " + number + checkSum);
        }

    }
}