package week_02.assigment;

import java.util.Scanner;

public class Question_16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a side to calculate the area of a hexagon: ");
        double s = input.nextDouble();

        double area =((3* Math.pow(3,0.5)) / 2) * Math.pow(s,2);
        System.out.println("The area of the hexagon is " + area);

    }





}
