package week_03.assigment;

import java.util.Scanner;

public class Question_10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        int x = (int) (Math.random() * 100 );
        int y = (int) (Math.random() * 100 );

        int z = (x + y);


        System.out.println("What is " + x + " + " +   y + " ?");

        int nummberofUser = input.nextInt();

        if (nummberofUser == z ) {

            System.out.println("you are correct !");

        } else {
            System.out.println("You are wrong ! " + x + " + " + y + " should be " +  z + " olmalı");
        }


    }






}
