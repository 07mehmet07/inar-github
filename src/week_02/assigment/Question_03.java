package week_02.assigment;

import java.util.Scanner;

public class Question_03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for feet: ");

        double feet = input.nextDouble();

        double meters = feet / (1000/305.0);

        System.out.println(feet + " feet is " + meters + " meters");


    }





}
