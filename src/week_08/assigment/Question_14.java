package week_08.assigment;

import java.util.Scanner;

public class Question_14 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size for the matrix: ");
        int size = input.nextInt();

        int[][] matrix = new int[size][size];

        fillMatrix(matrix);
        printMatrix(matrix);
        checkRows(matrix);
        checkColumns(matrix);
        checkMajorDiagonal(matrix);
        checkSubDiagonal(matrix);
    }

    public static void fillMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        int size = matrix.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void checkRows(int[][] matrix) {
        int size = matrix.length;
        int count = 0;
        for (int i = 0; i < size; i++) {
            boolean isSame = true;
            int rowsCount = matrix[i][0];
            for (int j = 1; j < size; j++) {
                if (matrix[i][j] != matrix[i][0]) {
                    isSame = false;
                    break;
                }
            }
            if (isSame) {
                System.out.println("\nAll " + rowsCount + "`s on row " + count);
            }
        }
        if (count == 0) {
            System.out.println("\nNo same numbers a row");
        }
    }

    public static void checkColumns(int[][] matrix) {
        int size = matrix.length;
        int count = 0;
        for (int j = 0; j < size; j++) {
            boolean isSame = true;
            int columnCount = matrix[0][j];

            for (int i = 1; i < size; i++) {
                if (matrix[i][j] != matrix[0][j]) {
                    isSame = false;
                    break;
                }
            }

            if (isSame) {
                System.out.println("\nAll " + columnCount + "'s on column " + count);
            }

        }
        if (count == 0) {
            System.out.println("\nNo same numbers on a column");
        }
    }

    public static void checkMajorDiagonal(int[][] matrix) {
        int size = matrix.length;
        int majorDiagonal = matrix[0][0];
        boolean same = true;
        for (int i = 1; i < size; i++) {
            if (matrix[i][i] != majorDiagonal) {
                same = false;
                break;
            }
        }
        if (same) {
            System.out.println("\nAll " + majorDiagonal + "s on the major diagonal");
        } else
            System.out.println("\nNo same numbers on the major diagonal");
    }

    public static void checkSubDiagonal(int[][] matrix) {
        int size = matrix.length;
        int subDiagonal = matrix[size - 1][0];
        boolean same = true;
        for (int i = 1; i < size; i++) {
            if (matrix[size - i - 1][i] != subDiagonal) {
                same = false;
                break;
            }
        }
        if (same) {
            System.out.println("\nAll " + subDiagonal + "s on the sub-diagonal");
        } else
            System.out.println("\nNo same numbers on the sub diagonal");

    }
}


