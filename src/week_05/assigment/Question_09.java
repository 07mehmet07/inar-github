package week_05.assigment;

import java.util.Scanner;

public class Question_09 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);


        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        int score,
                highest = 0,
                secondHigest = 0;
        String name = "",
                student1 = "",
                student2 = "";

        // Prompt the user to enter each students' name and score
        System.out.println("Enter each students' name and score:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Student: " + (i + 1) + "\n   Name: ");
            name = input.next();
            System.out.print("   Score: ");
            score = input.nextInt();

            if(i == 0 ){
                highest = score ;
                student1 = name ;

            } else if (i == 1 && score > highest) {

               secondHigest = highest ;
                highest = score ;
                student2 = student1;
                student1 = name ;

            } else if (i > 1 && score > highest && score > secondHigest) {

                secondHigest = highest ;
                student2 = student1 ;
                highest = score ;
                student1 = name ;

            } else if (i > 1 && score > highest) {

                student2 = name ;
                secondHigest = highest ;


            }
            System.out.println("The highest scoring student :" + student1);
            System.out.println("The second highest scoring student : " + student2);
        }
}}