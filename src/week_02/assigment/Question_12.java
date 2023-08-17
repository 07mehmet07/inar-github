package week_02.assigment;

import java.util.Scanner;

public class Question_12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the speed and acceleration :");

        double v = input.nextDouble();
        double a = input.nextDouble();

        double lenght =Math.pow(v , 2) / (2 * a);

        System.out.println("The minimum runaway lenhgt for this airplane is " + lenght);






    }








}
