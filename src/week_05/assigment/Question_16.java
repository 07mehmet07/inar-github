package week_05.assigment;

import java.util.Scanner;

public class Question_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a integer : ");
        int number = input.nextInt();
        int lowestDivide = 2;

        while (number / lowestDivide != 1) {

            if (number % lowestDivide == 0) {

                System.out.print(lowestDivide + ", ");
                number /= lowestDivide;
            } else
                lowestDivide++;

        }
        System.out.print(number + " ." );
    }

}
