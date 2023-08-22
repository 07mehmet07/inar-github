package week_02.assigment;

import java.time.chrono.MinguoChronology;
import java.util.Scanner;

public class Question_03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds ");
        double pounds = input.nextDouble();
        System.out.println("Enter feet ");
        double feet = input.nextDouble();
        System.out.println("Enter inches ");
        double inch= input.nextDouble();


        double inches = (feet * 12) + inch;
        double kilograms = pounds * 0.45359237;
        double meters = inches * 0.0254;
        double bmi = kilograms / (Math.pow(meters, 2));
        System.out.println("BMI is " + (int) (bmi * 100) / 100.);














    }





}
