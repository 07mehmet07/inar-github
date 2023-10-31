package week_08.assigment;

public class Question_22 {
    public static void main(String[] args) {

        int[][] matrix = getRandomMatrix();

        printMatrix(matrix);

        boolean haveEvenForRow = printStatusRows(matrix);
        System.out.println((haveEvenForRow) ? "\nEvery row have an even number of 1's" : "\nEvery row have not an even number of 1's");

        boolean haveEvenForColumn = printStatusColumns(matrix);
        System.out.println((haveEvenForColumn) ? "\nEvery column have an even number of 1's" : "\nEvery column have not an even number of 1's");

    }

    public static int[][] getRandomMatrix() {

        int[][] matrix = new int[6][6];

        for (int rows = 0; rows < matrix.length; rows++) {
            for (int column = 0; column < matrix[0].length; column++) {
                matrix[rows][column] = (int) (Math.random() * 2);
            }

        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static boolean printStatusRows(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int counter = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 1) {
                    counter++;
                }
            }
            if (counter % 2 != 0) {
                return false;
            }
        }
        return true;

    }


    public static boolean printStatusColumns(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            int counter = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 1) {
                    counter++;
                }
            }
            if (counter % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
