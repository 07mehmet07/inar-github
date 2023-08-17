package week_02.assigment;

import java.util.Scanner;

public class Question_05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal and a gratuity rate: ");

        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();


        double gratuity = subtotal / 100.0 * gratuityRate;
        double total = subtotal + gratuity;

        System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);






    }







}
