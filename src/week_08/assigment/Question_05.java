package week_08.assigment;

import java.util.Scanner;

public class Question_05 {
    public static void main(String[] args) {

        System.out.print("Enter the matrix1");
        double[][] matrix1 = getMatrix();
        System.out.print("Enter the matrix2");
        double[][] matrix2 = getMatrix();

        double[][] sum = addMatrix(matrix1, matrix2);

        displaySum(matrix1, matrix2, sum);

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

    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] sum = new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }

    public static void displaySum(double[][] matrix1, double[][] matrix2, double[][] sum) {
        System.out.println("The matrices are added as follows :");
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.print((i == 1) ? "  +  " : "     ");

            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.print((i == 1) ? "  =  " : "     ");

            for (int j = 0; j < sum[i].length; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}


