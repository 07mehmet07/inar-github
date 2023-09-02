package week_04.assignment04;

import java.util.Scanner;

public class Question_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter grade : ");
        String letter =input.nextLine();
        char cidella = letter.toUpperCase().charAt(0);
        switch (cidella){
            case 'A' :
                System.out.println("The numeric value for grade A is 4");break;
            case 'B':
                System.out.println("The numeric value for grade B is 3");break;
            case 'C' :
                System.out.println("The numeric value for grade C is 2");break;
            case 'D' :
                System.out.println("The numeric value for grade D is 1");break;
            case 'F' :
                System.out.println("The numeric value for grade F is 0");break;
            default :
                System.out.println(letter + " is invalid grade");

        }
    }

}
