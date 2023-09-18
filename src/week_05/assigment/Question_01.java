package week_05.assigment;

import java.util.Scanner;

public class Question_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pozitivecount = 0;
        int negativecount = 0;
        double total = 0;
        boolean value = true;
        System.out.print("Enter an integer, the input ends if it is 0: ");


        while (value){
            int number = input.nextInt();
            if (number == 0 && pozitivecount == 0 && negativecount == 0){
                value = false;
                System.out.println("No numbers are entered except " + number);
            }else if (number == 0){
                value = false;
            }
            else if (number < 0){
                negativecount++;

            }
            else {
                pozitivecount++;
            }
            total += number;
        }
        if (pozitivecount != 0 && negativecount != 0) {
            System.out.print("The number of positives is " + pozitivecount +
                    "\nThe number of negatives is " + negativecount +
                    "\nThe total is " + total +
                    "\nThe average is " + ( total / (pozitivecount + negativecount )));
        }
    }
}
