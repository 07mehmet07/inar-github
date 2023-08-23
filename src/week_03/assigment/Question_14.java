package week_03.assigment;

import java.util.Scanner;

public class Question_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Guess the flip of coin ( 0 represents head and 1 represents tail :");

        int guess = input.nextInt();
        int flip =(int) (Math.random() * 2 );

if (guess == flip){
    System.out.println("Your guess is correct !");
}
else {
    System.out.println("Your guess is incorrect !");
}



    }
}
