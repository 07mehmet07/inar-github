package week_07.assigment;

import java.util.Scanner;

public class Question_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int numOfStudents = input.nextInt();

        int[] scores = new int[numOfStudents];

        System.out.print("Enter " + numOfStudents + " scores :");

        int bestScore = 0 ;

        for (int i = 0 ; i < numOfStudents ; i++){
            scores[i] = input.nextInt();

            if (scores[i] > bestScore){
                bestScore = scores[i];
            }
        }


        for (int i = 0 ; i < numOfStudents ; i++){
            System.out.print("Student " + (i) + " score is " + scores[i] + " and grade is ");
            if (scores[i] >= bestScore - 10){
                System.out.println("A");
            } else if (scores[i] >= bestScore - 20) {
                System.out.println("B");
            } else if (scores[i] >= bestScore - 30) {
                System.out.println("C");
            } else if (scores[i] >= bestScore - 40) {
                System.out.println("D");
            }else
                System.out.println("F");
        }




    }
}
