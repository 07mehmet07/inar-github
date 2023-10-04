package week_07.assigment;

import java.util.Scanner;

public class Question_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the integers between 1 and 100:");
        int[] numbers = new int[100];


        while(true){
            int num = input.nextInt();
            if(num == 0)
                break;
            else if(num < 0 || num > 100){
                System.out.println("Wrong input!");
                break;
            }
            numbers[num]++;
        }

            printOccur(numbers);
    }

    public static void printOccur(int[] numbers) {

        for (int i = 0 ; i < 100 ; i++){
            if (numbers[i] == 0){
                continue;
        }

        System.out.println(i + " occur " + numbers[i] + ((numbers[i]> 1) ? " times " : " time"));

    }}}

