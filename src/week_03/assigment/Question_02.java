package week_03.assigment;

import java.util.Scanner;

public class Question_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is + 5 + 7 + 8  = ?");
        int sums = 5 + 7 + 8 ;
        System.out.println(sums);

        boolean istrue = sums == 20;
        System.out.println("5 + 7 + 8 = 20  is " + istrue );




        System.out.println("What is + 2 + 4 + 2  = ?");
        int sol = 9;
        System.out.println(sol);

        boolean isfalse = sol !=9;

        System.out.println("2 + 4 + 2 = " + (sol) + " is " + isfalse);

    }
}
