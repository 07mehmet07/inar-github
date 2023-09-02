package week_04.assignment04;

import java.util.Scanner;

public class Question_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter :");
        String letter = input.nextLine();

        if(letter.length() > 1){
            System.out.println("invalid input");
            System.exit(0);
        }
        char cidella = letter.toLowerCase().charAt(0);
        if (cidella == 'a' || cidella == 'b' || cidella == 'c') {
            System.out.println("The corresponding number is " + 2);
        } else if (cidella == 'd' || cidella == 'e' || cidella == 'f') {
            System.out.println("The corresponding number is " + 3);
        } else if (cidella == 'g' || cidella == 'h' || cidella == 'i') {
            System.out.println("The corresponding number is " + 4);
        } else if (cidella == 'j' || cidella == 'k' || cidella == 'l') {
            System.out.println("The corresponding number is " + 5);
        } else if (cidella == 'm' || cidella == 'n' || cidella == 'o') {
            System.out.println("The corresponding number is " + 6);
        } else if (cidella == 'p' || cidella == 'q' || cidella == 'r' || cidella == 's') {
            System.out.println("The corresponding number is " + 7);
        } else if (cidella == 't' || cidella == 'u' || cidella == 'v') {
            System.out.println("The corresponding number is " + 8);
        } else if (cidella == 'w' || cidella == 'x' || cidella == 'y' || cidella == 'z') {
            System.out.println("The corresponding number is " + 9);
        } else {
            System.out.println(cidella + " is an invalid input");
        }

}}
