package week_05.assigment;

import java.util.Scanner;

public class Question_48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String sentence = input.nextLine();

        int length = sentence.length();

        for (int i = 0; i < length; i += 2) {

            char ch = sentence.charAt(i);

            System.out.print(ch);
        }

    }
}
