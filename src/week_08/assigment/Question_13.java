package week_08.assigment;

import java.util.Scanner;

public class Question_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the numbers of rows and columns of the array : ");

        int rows = input.nextInt();
        int columns = input.nextInt();

        System.out.println("Enter the array :");

        double[][] array = new double[rows][columns];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = input.nextDouble();
            }
        }

        int[] result = getTheLargestElement(array);

        System.out.println("\nThe location of the largest element is at (" + result[0] + " , " + result[1] + ")");

    }

    public static int[] getTheLargestElement(double[][] matrix) {

        int[] index = new int[2];
        double maxLocation = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > maxLocation) {
                    maxLocation = matrix[i][j];
                    index[0] = i;
                    index[1] = j;


                }

            }

        }
        return index;
    }

}







