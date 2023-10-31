package week_08.assigment;

import java.util.Scanner;

public class Question_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 511:");
        int number = input.nextInt();

        int[] binaryMatrix = new int[9];
        int count = 8;
        while (number != 0) {
            if (number == 1) {
                binaryMatrix[count] = 1;
                break;
            } else {
                binaryMatrix[count] = number % 2;
                number /= 2;
                count--;
            }


        }
        int[][] matrix = new int[3][3];


        fillTheMatrix(matrix, binaryMatrix);
        printMatrix(matrix);
    }

    public static void fillTheMatrix(int[][] matrix, int[] binaryMatrix) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = binaryMatrix[count];
                count++;

            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    System.out.print("H" + " ");
                } else {
                    System.out.print("T" + " ");
                }
            }
            System.out.println();
        }
    }
}
