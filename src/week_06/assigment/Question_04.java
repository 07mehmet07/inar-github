package week_06.assigment;

import java.util.Scanner;

public class Question_04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Display an integer reversed : ");

        System.out.print("Enter an integer : ");

        int number = input.nextInt();

        reverse(number);

    }
        public static void reverse(int number) {

            String newNumber =" ";

            while (number != 0 ){

                newNumber += number % 10;
                number /= 10 ;

            }
            System.out.println(newNumber);

        }



    }

