package week_05.assigment;

import java.util.Scanner;

public class Question_41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter integers (it ends if input is 0) :");
        String numberList = "";
        int number;
        int max = 0;
        int maxCount = 1;

        while (true) {
            number = input.nextInt();
            numberList = numberList + number + " ";

            if (max == number) {
                maxCount++;
            }
            if (max < number) {
                max = number;
                maxCount = 1;
            }

            if (number == 0) {
                break;
            }
        }
        System.out.println("The largest count " + max + " and the occurrence of the count is  " + maxCount);


    }

}
