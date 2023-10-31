package week_08.assigment;

import java.util.Scanner;

public class Question_27 {
    public static void main(String[] args) {

        double[][] matrix = getMatrixFromUser();
        sortColumns(matrix);
        displayMatrix(matrix);

    }

    private static double[][] getMatrixFromUser() {
        Scanner input = new Scanner(System.in);

        double[][] arrays = new double[3][3];
        System.out.println("Enter a 3-by-3 matrix row by row:");

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[0].length; j++) {
                arrays[i][j] = input.nextDouble();
            }
        }
        return arrays;
    }

    private static double[][] sortColumns(double[][] m) {
        for (int i = 0; i < m[0].length; i++) {
            for (int j = 0; j < m.length - 1; j++) {

                double currentMin = m[j][i];
                int currentMinIndex = j;

                for (int k = j + 1; k < m.length; k++) {
                    if (currentMin > m[k][i]) {
                        currentMin = m[k][i];
                        currentMinIndex = k;
                    }
                }
                if (currentMinIndex != j) {
                    m[currentMinIndex][i] = m[j][i];
                    m[j][i] = currentMin;
                }
            }

        }

        return m;
    }


    private static void displayMatrix(double[][] matrix) {

        System.out.println("\nThe column-sorted array is :");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}