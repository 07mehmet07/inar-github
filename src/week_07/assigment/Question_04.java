package week_07.assigment;

import java.util.Scanner;

public class Question_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int count = 0 ;
        int score ;

        int[] scores = new int[100];
        System.out.print("Enter scores(negative number signifies end): ");

        for (int i = 0; i < 100 ; i++){
             score = input.nextInt();
            if (score <= 0 || score >= 100) break;
            scores[i] = score ;
            count++;
            sum += scores[i];
        }

        double avarege = sum / count ;
        int aboveOrEqual = 0 ;

        for (int i = 0 ; i <= count ; i++){
            if (scores[i] >= avarege){
                aboveOrEqual++;
            }
        }


        System.out.println("Average of scores: " + avarege);
        System.out.println("Number of scores above or equal to average: " + aboveOrEqual);
        System.out.println("Number of scores below the average: " + (count - aboveOrEqual));






}}

