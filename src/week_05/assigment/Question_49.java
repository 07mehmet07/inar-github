package week_05.assigment;

import java.util.Scanner;

public class Question_49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string:");
        String sentence = input.nextLine();

        sentence = sentence.toLowerCase();
        int length = sentence.length();
        char letter = ' ';
        int counterOfVowel = 0;
        int CounterOfCons = 0;

        for (int i = 0; i < length; i++) {
            letter = sentence.charAt(i);

            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                counterOfVowel++;
            } else if (letter == ' ') {

            } else {
                CounterOfCons++;
            }

        }
        System.out.println("The number of vowels is " + counterOfVowel);
        System.out.println("The number of consonants is " + CounterOfCons);
    }
}
