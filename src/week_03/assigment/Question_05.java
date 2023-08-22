package week_03.assigment;

import java.util.Scanner;

public class Question_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter today's day : ");
        int numberofToday= input.nextInt();
        System.out.print("Enter the number of days elapsed since today : ");
        int numberofElapsed = input.nextInt();
        int numberofFuture= (numberofElapsed + numberofToday) % 7 ;

        System.out.print("the today is ");



        switch (numberofToday) {
            case 0: System.out.print("sunday");
                break;

            case 1:
                System.out.print("monday");
                break;

            case 2:
                System.out.print("tuesday");
                break;
            case 3:
                System.out.print("wednesday");
                break;
            case 4:
                System.out.print("thursday");
                break;
            case 5:
                System.out.print("friday");
                break;
            case 6:
                System.out.print("saturday");

        }


        System.out.print(" and the feature day is ");

        switch (numberofFuture ) {
    case 0:
        System.out.println("sunday");
        break;

    case 1:
        System.out.println("monday");
        break;

    case 2:
        System.out.println("tuesday");
        break;
    case 3:
        System.out.println("wednesday");
        break;
    case 4:
        System.out.println("thursday");
        break;
    case 5:
        System.out.println("friday");
        break;
    case 6:
        System.out.println("saturday");

}





}








    }








