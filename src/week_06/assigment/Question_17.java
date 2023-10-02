package week_06.assigment;

import java.util.Scanner;

public class Question_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int num = input.nextInt();
        printMatrix(num);
    }
    public static void printMatrix(int n){
        for (int i = 0; i < n; i++){
            for (int j = 0 ; j < n ; j++){
                int number = (int)(Math.random() * 2);
                System.out.print(number + "\t");
            }
            System.out.println();
        }
    }
}
