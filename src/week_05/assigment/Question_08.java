package week_05.assigment;

import java.util.Scanner;

public class Question_08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int highscore = 0;
        String highScoreOfName = "";

        System.out.print("Enter the number of students : ");
        int numberOfStudents = input.nextInt();
        System.out.println("Enter each student's name and score ");

        for (int i = 0; i < numberOfStudents; i++) {

            System.out.print("Student :" + (i + 1) + "\n    Name : ");
            String nameOfStudent = input.next();

            System.out.print("    Score : ");
            int scoreOfStudents = input.nextInt();

            if (scoreOfStudents > highscore) {
                highscore = scoreOfStudents;
                highScoreOfName = nameOfStudent;

            }
            System.out.println("Student with the hıghest score : " + highScoreOfName);
        }


    }
}