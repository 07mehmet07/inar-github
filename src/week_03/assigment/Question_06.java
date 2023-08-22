package week_03.assigment;

import java.util.Scanner;

public class Question_06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter  weight in pounds: ");
        double pounds = input.nextDouble();


        System.out.print("Enter feet: ");
        double feet= input.nextDouble();

        System.out.print("Enter inches: ");
        double inches = input.nextDouble();


        inches = feet * 12 + inches;
        double kilograms = pounds * 0.45359237;
        double meters = inches * 0.0254;

        double bmi = kilograms / (Math.pow(meters, 2));
        System.out.println("BMI is " + bmi);


        if (bmi < 18.5) {

            System.out.println("underweight");
        } else if (bmi >= 18.5 && bmi < 25) {

            System.out.println("normal");
        } else if (bmi >= 25.0 && bmi < 30.0) {
            System.out.println("overweight");
        } else if (bmi <= 30.0) {
            System.out.println("obese");
        }
    }



    }



