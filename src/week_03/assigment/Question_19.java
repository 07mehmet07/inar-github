package week_03.assigment;

import java.util.Scanner;

public class Question_19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter edge1 , edge2 , edge3 of the triangle");



        double edge1 = input.nextDouble();

        double edge2 = input.nextDouble();

        double edge3 = input.nextDouble();

        if (edge1 + edge2 > edge3 && edge1 + edge3 > edge2 && edge2 + edge1 > edge3 && edge2 + edge3 > edge1) {

            System.out.println("The perimeter of a triangle is " + (edge1 + edge2 + edge3));

        } else
            System.out.println("The input is invalid");

    }


}
