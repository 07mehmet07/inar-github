package week_08.assigment;

import java.util.Scanner;

public class Question_06 {
    public static void main(String[] args) {
        System.out.print("Enter the matrix1");
        double[][] matrix1 = getMatrix();
        System.out.print("Enter the matrix2");
        double[][] matrix2 = getMatrix();

        double[][] sum = multiplyMatrix(matrix1, matrix2);

        displayResult(matrix1, matrix2, sum);

    }

    public static double[][] getMatrix() {
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[3][3];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextDouble();
            }
        }
        return matrix;
    }

    public static double[][] multiplyMatrix(double[][] a, double[][] b) {

        double[][] result = new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a.length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    public static void displayResult(double[][] matrix1, double[][] matrix2, double[][] sum) {
        System.out.println("The matrices are added as follows :");
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.print((i == 1) ? "  *  " : "     ");

            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.print((i == 1) ? "  =  " : "     ");

            for (int j = 0; j < sum[i].length; j++) {
                System.out.printf("%2.1f  ", sum[i][j]);
            }
            System.out.println();
        }
    }
}




