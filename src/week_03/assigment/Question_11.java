package week_03.assigment;

import java.util.Scanner;

public class Question_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter mounth as a integer: ");

        int mounth = input.nextInt();

        System.out.print("Enter the year as a integer: ");

        int year = input.nextInt();


        boolean leapYear = (year % 4 == 0 && year % 10 != 0) || (year % 400 == 0);

        if (mounth == 1) {
            System.out.println("january " + year + " had 31 days");
        }else if (mounth == 2) {
            if (leapYear) {
                System.out.println("february " + year + " had 29 days");
            } else System.out.println("february " + year + " had 28 days");
            }
        else if (mounth == 3) {
            System.out.println("march " + year + " had 31 days");

        } else if (mounth == 4) {
            System.out.println("april " + year + " had 30 days");
        } else if (mounth == 5) {
            System.out.println("may " + year + " had 31 days");
        } else if (mounth== 6) {
            System.out.println("june " + year + " had 30 days");
        } else if (mounth == 7) {
            System.out.println("july " + year + " had 31 days");
        } else if (mounth == 8) {
            System.out.println("august " + year + " had 31 days");
        } else if (mounth == 9) {
            System.out.println("september " + year + " had 30 days");
        } else if (mounth == 10) {
            System.out.println("october " + year + " had 31 days");
        } else if (mounth == 11) {
            System.out.println("november " + year + " had 30 days");
        } else if (mounth == 12) {
            System.out.println("december " + year + " had 31 days");
        }
    }






}
