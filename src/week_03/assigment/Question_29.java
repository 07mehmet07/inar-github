package week_03.assigment;

import java.util.Scanner;

public class Question_29 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter circle1's center x- , y- coordinates, and radius : ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double r1 = input.nextDouble();

        System.out.print("Enter circle2's center x- , y- coordinates, and radius : ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double r2 = input.nextDouble();
        double d = Math.sqrt(Math.pow(x1 - y1, 2) + Math.pow(x2 - y2, 2));


        System.out.println();
        if (d <= Math.sqrt((Math.pow(r1 - r2, 2)))){
            System.out.println("Circle2 is inside circle1");
        }else if (d <=( r1 + r2)) {
            System.out.println("Circle2 overlaps circle1");
        }	else {
            System.out.println("Circle2 does not overlap circle1");
        }
    }
}
