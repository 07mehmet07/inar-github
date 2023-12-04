package week_13.assignment.question_13_19;

import week_13.assignment.question_13_15.Rational2;

import java.math.BigInteger;
import java.util.Scanner;

public class Question_13_19 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal number : ");
        String[] numbers = input.next().split(",");


        Rational2 r1 = new Rational2(new BigInteger(numbers[0] + numbers[1]) ,
                new BigInteger(String.valueOf((int) Math.pow(10,numbers[1].length()))));

        System.out.println("The fraction number is " + r1);



    }
}
