package week_02.assigment;

import java.util.Scanner;

public class Question_04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" Enter number in pounds :");

        double pounds  = input.nextDouble();

        double kilometers = pounds/ (1000 / 454.0);

        System.out.println(pounds + " pounds is  " + kilometers + " kilometers");







    }






}
