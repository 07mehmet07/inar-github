package week_11.assigment.exercise_10;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MyStack myStack = new MyStack();

        System.out.print("Enter five strings : ");
        for (int i = 0; i < 5; i++) {
            myStack.push(input.nextInt());

        }
        System.out.println(myStack.toString());

        System.out.println("Displaying them in reverse order : ");
        int length = myStack.getSize();

        for (int i = 0; i < length; i++) {
            System.out.print(myStack.pop() + " ");

        }

    }
}
