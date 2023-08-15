package week_02.assigment;

import java.util.Scanner;

public class Question_02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius and lenght of clinder: ");

        double radius = input.nextDouble();
        double lenght = input.nextDouble();

double area = radius * radius * 3.14159;
double volume = area * lenght;

        System.out.println("The area is " + (int) (area * 100 ) / 100.0);
        System.out.println("The volume is " + (int) (volume * 10) / 10.0);



    }




}
