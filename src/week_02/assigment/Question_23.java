package week_02.assigment;

import java.util.Scanner;

public class Question_23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the diriving distance : ");
        double drivingDistance = input.nextDouble();

        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble();

        System.out.print("Enter price per gallon : ");
        double pricePerGallon = input.nextDouble();

        double cost = (drivingDistance / milesPerGallon) * pricePerGallon;

        System.out.println("The cost of driving is $" + cost);

    }






}
