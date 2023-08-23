package week_03.assigment;

import java.util.Scanner;

public class Question_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit between -58 F and 41 F: ");
        double tA = input.nextDouble();

        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double v = input.nextDouble();

        double tWC = 35.74 + (0.6215 * tA) - (35.75 * Math.pow(v, 0.16)) + (0.4275 * tA * Math.pow(v, 0.16));



        if (tA<-58 || tA>41 && v<2){
            System.out.println("the temperature and wind is invalid");
        } else if (tA<-58 || tA>41) {
            System.out.println("the temperature is invalid");
        } else if (v<2) {
            System.out.println("the wind is invalid");
        }else
            System.out.println("The wind chill index is " + tWC);







}}
