package week_04.assignment04;

import java.util.Scanner;

public class Question_11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal value ( 0 to 15 ): ");
        int value = input.nextInt();

        if (value >= 0 && value <= 9){
            System.out.println("The hex value is " + value);
        }else if (value>=10 && value <=15) {
            System.out.println("The hex value is " + (char) (value + 55 ));
        }else if (value >= 16){
            System.out.println( value + " is an invalid input");
        }


    }


}
