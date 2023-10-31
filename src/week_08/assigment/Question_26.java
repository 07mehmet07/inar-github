package week_08.assigment;

import java.util.Scanner;

public class Question_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a 3-by-3 matrix row by row:");

        double[][] matrix = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        double[][] sortedMatrix = sortRows(matrix);

        System.out.println("The row-sorted array is");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sortedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] sortRows(double[][] m) {
        int rows = m.length;
        int cols = m[0].length;
        double[][] sortedMatrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols - 1; j++) {
                for (int k = 0; k < cols - 1 - j; k++) {

                    if (m[i][k] > m[i][k + 1]) {
                        double temp = m[i][k];
                        m[i][k] = m[i][k + 1];
                        m[i][k + 1] = temp;

                    }
                }
            }

        }
        return m;
    }
}


