package week_03.assigment;

import java.util.Scanner;

public class Question_18 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.print("Enter the weight of package : ");
        double weight = input.nextDouble();
        if (0 < weight && weight <= 1) {
            System.out.println("The cost is " + "$" + weight * 3.5);
        } else if (weight <= 3) {
            System.out.println("The cost is " + "$" + weight * 5.5);
        } else if (weight <= 10) {
            System.out.println("The cost is " + "$" +  weight * 8.5 );
        } else if (weight <= 20) {
            System.out.println("The cost is " + "$" + weight * 10.5);
        } else if (weight > 20) {
            System.out.println("The package cannot be shipped");
        }

    }
}
