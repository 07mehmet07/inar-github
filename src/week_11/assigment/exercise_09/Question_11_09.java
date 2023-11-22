package week_11.assigment.exercise_09;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size n: ");
        int n = input.nextInt();
        int matrix[][] = fillMatrix(n);

        ArrayList<Integer> row = getRow(matrix);
        ArrayList<Integer> column = getColumn(matrix);

        displayMatrix(matrix);
        System.out.println("The largest row index : " + row);
        System.out.println("The largest column index : " + column);

    }

    public static int[][] fillMatrix(int n) {
        int array[][] = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = (int) (Math.random() * 2);

            }
        }
        return array;

    }

    public static void displayMatrix(int[][] matrix) {
        System.out.println("The random array is:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }


    public static ArrayList<Integer> getRow(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();

        int max = 0;
        int count;


        for (int i = 0; i < matrix.length; i++) {
            count = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }

            }
            if (count > max) {
                max = count;
                list.clear();
                list.add(i);
            } else if (max == count) {
                list.add(i);
            }

        }

        return list;


    }


    public static ArrayList<Integer> getColumn(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();

        int max = 0;
        int count;
        for (int i = 0; i < matrix[0].length; i++) {
            count = 0;
            for (int j = 0; j < matrix.length; j++) {

                if (matrix[j][i] == 1) {
                    count++;
                }
            }

            if (count > max) {
                max = count;
                list.clear();
                list.add(i);
            } else if (count == max) {
                list.add(i);
            }


        }

        return list;
    }

}
