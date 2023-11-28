package week_12.assigment.exercise_25;

import java.io.File;
import java.util.Scanner;

public class Question_12_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the directory name :");
        String name = input.nextLine();

        File file = new File(name);

        if (file.mkdir()){
            System.out.println("Directory is created successfully");
        }else
            System.out.println("Directory already exist");


    }
}
