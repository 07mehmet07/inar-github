package week_03.assigment;

import java.util.Scanner;

public class Question_23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates :");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double width = 10;
        double height = 5;

        double horizontalDistance = x2 - 0;
        double verticalDistance = y2 - 0;

        if (horizontalDistance <= (width/2) && verticalDistance <= (height/2)) {
            System.out.println("Point (" + x2 + "," + y2 + ") is in the rectangle.");
        } else {
            System.out.println("Point (" + x2 + "," + y2 + ") is not in the rectangle.");
        }

    }
}
