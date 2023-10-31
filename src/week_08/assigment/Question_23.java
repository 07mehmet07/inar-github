package week_08.assigment;

import java.util.Scanner;

public class Question_23 {
    public static void main(String[] args) {

        int[][] matrix = new int[6][6];

        getMatrix(matrix);

        displayMatrix(matrix);

        int flipRow = checkFlippRow(matrix);
        int flipColumn = checkFlippColumn(matrix);

        if (flipRow == -1 || flipColumn == -1) {

            System.out.println("\nNo invalid");
        } else
            System.out.println("\nThe flipped cell is at (" + flipRow + "," + flipColumn + ")");

    }

    private static int checkFlippColumn(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            boolean check = true;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[j][i] == 1) {
                    count++;
                }
            }
            if (count % 2 == 1) {
                check = false;
            }
            if (!check) {
                return i;
            }
        }

        return -1;
    }

    private static int checkFlippRow(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            boolean check = true;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count % 2 == 1) {
                check = false;
            }
            if (!check) {
                return i;
            }
        }

        return -1;
    }


    private static void getMatrix(int[][] matrix) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input.nextInt();
            }

        }

    }


    private static void displayMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
