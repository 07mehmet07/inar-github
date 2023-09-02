package week_04.assignment04;

import java.util.Scanner;

public class Question_13 {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a letter : ");
    String letter = input.nextLine();
    char cidella = letter.charAt(0);
    cidella = Character.toLowerCase(cidella);

    if ('a' > cidella || cidella > 'z') {
        System.out.println(letter + " is invalid input");
        } else if (cidella=='a' || cidella == 'e' || cidella == 'i' || cidella == 'o' || cidella == 'u') {
        System.out.println(letter + " is a vowel");
    }else {
        System.out.println(letter + " is a consonent");
    }


    }
}
