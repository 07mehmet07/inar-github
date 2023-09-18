package week_05.assigment;

import java.util.Scanner;

public class Question_02 {
    public static void main(String[] args) {
    final int Number_Of_Questions = 10;
    int Correctcount = 0;
    int count = 0 ;
    long starttime = System.currentTimeMillis();
    String output = "";
    Scanner input = new Scanner(System.in);

    while (count<Number_Of_Questions){
        int number1 = (int) (1 + Math.random() * 15);
        int number2 = (int) (1 + Math.random() * 15);

        System.out.print(
                " what is " + number1 + " + " + number2 + " ?");
        int answer = input.nextInt();

        if (number1 + number2 == answer){
            System.out.println(" you are correct! ");
            Correctcount++;
        }else
            System.out.println("your answer is wrong.\n" + number1 + "+" + number2 + " should be " + (number1 + number2));
count++;
output += "\n" + number1 + " + " + number2 + " = " + answer + ((number1 + number2 == answer)? "correct " : "wrong");

    }

    long endTime = System.currentTimeMillis();
    long testTime = endTime - starttime ;
        System.out.println("Correct count is " +
                "\ntestTime" + testTime / 1000 + "seconds\n" + output);




    }

}
