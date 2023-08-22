package week_03.assigment;

import java.util.Scanner;

public class Question_09 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.println("Enter the first 9 digits of an ISBN as integer:");
        int isbn = input.nextInt();

        int dig1 = isbn /  100000000;
        int dig2 = (isbn / 10000000) % 10;
        int dig3 = (isbn / 1000000) % 10;
        int dig4 = (isbn / 100000) % 10;
        int dig5 = (isbn / 10000) % 10;
        int dig6 = (isbn / 1000) % 10;
        int dig7 = (isbn / 100) % 10;
        int dig8 = (isbn / 10) % 10;
        int dig9 = isbn % 10;

        int checksum = (dig1 + dig2 * 2 + dig3 * 3 + dig4 * 4 + dig5 * 5 + dig6 * 6 + dig7 * 7 + dig8 * 8 + dig9 * 9) % 11;

        if (checksum == 10) {
            if (dig1 == 0)
                System.out.println("The ISBN-10 nummber is " + dig1 + isbn + "X");
        } else {

        System.out.println("The ISBN-10 nummber is " + dig1 + isbn + checksum) ;


        }

    }}
