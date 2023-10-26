package week_07.assigment;

import java.util.Scanner;

public class Question_33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] zodiacs = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger",
                "rabbit", "dragon", "snake", "horse", "sheep"};

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        System.out.println("\n" + year + " is a year of " + zodiacs[year % 12] + " in zodiac");
    }
}
