package week_08.assigment;

import java.util.Scanner;

public class Question_02 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter a 4-by-4 matrix row by row : ");

        double[][] matrix = new double[4][4];


        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextDouble();

            }

        }

        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonqal(matrix));
    }

    public static double sumMajorDiagonqal(double[][] m) {

        double sum = 0;
        int row = 0;

        for (int column = 0; column < m.length; column++) {

            sum += m[row++][column];

        }
        return sum ;

    }
}
