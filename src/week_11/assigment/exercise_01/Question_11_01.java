package week_11.assigment.exercise_01;

import java.util.Scanner;

public class Question_11_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three side of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();


        input.nextLine();
        System.out.print("Enter a color: ");
        String color = input.nextLine();
        System.out.print("Is the triangle filled (true / false)? ");
        String value = input.next();
        boolean isFilled = Boolean.parseBoolean(value);


               Triangle triangle = new Triangle(3,4,5);

        System.out.println("\nArea ; " + triangle.getArea());
        System.out.println("Perimeter : " + triangle.getPerimeter());

        triangle.setColor(color);
        System.out.println("Color : " + triangle.getColor());

        triangle.setFilled(isFilled);
        System.out.println(triangle.isFilled() ? "Triangle is filled" : "Triangle is empty");


    }
}
