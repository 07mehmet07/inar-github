package week_04.assignment04;

import java.util.Scanner;

public class Question_20 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String text = input.nextLine();

        System.out.println("Length of the text : " + text.length());
        System.out.println("First character of the text : " + text.charAt(0));
    }
}
