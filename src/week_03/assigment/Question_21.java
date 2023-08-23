package week_03.assigment;

import java.util.Scanner;

public class Question_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year : (e.g. 2012): ");
        int year = input.nextInt();
        System.out.print("Enter month: 1-12 :");
        int mounth = input.nextInt();
        System.out.print("Enter the day of the mounth: 1-31 :");
        int day = input.nextInt();
        int j = year / 100;
        int k =year % 100;


        if (mounth == 1) {
            mounth = 13;
        } else if (mounth == 2) {
            mounth = 14;
        }

int dayofWeek = (day + (26*(mounth + 1)/10) + k + (k/4) + (j/4) + (5*j)) % 7 ;

switch (dayofWeek){
    case 0:
        System.out.println("Day of the week is saturday");break;

    case 1:
        System.out.println("Day of the week is sunday");break;

    case 2:
        System.out.println("Day of the week is monday");break;

    case 3:
        System.out.println("Day of the week is tuesday");break;

    case 4:
        System.out.println("Day of the week is wednesday");break;

    case 5:
        System.out.println("Day of the week is thursday");break;

    case 6:
        System.out.println("Day of the week is friday");break;






}













    }}
