package week_08.assigment;

public class Question_10 {
    public static void main(String[] args) {
        int[][] randomlyMatrix = getMatrix();


        int largestRowIndex = getLargestRowIndex(randomlyMatrix);
        int largestColumnIndex = getLargestColumnIndex(randomlyMatrix);

       displayMatrix(randomlyMatrix);

        System.out.println("The largest row index: " + largestRowIndex);
        System.out.println("The largest column index: " + largestColumnIndex);
    }

    public static int[][] getMatrix() {
        int[][] matrix = new int[4][4];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                matrix[row][column] = (int) (Math.random() * 2);

            }

        }
        return matrix;
    }

    public static int getLargestRowIndex(int[][] matrix) {
        int maxRowIndex = 0;
        int max = 0;
        for (int row = 0; row < matrix.length; row++) {
            int count = 0;
            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column] == 1)
                    count++;
            }
            if (count > max) {
                max = count;
                maxRowIndex = row;
            }
        }
        return maxRowIndex;
    }

    public static int getLargestColumnIndex(int[][] matrix) {
        int maxColumnIndex = 0;
        int max = 0;
        for (int row = 0; row < matrix.length; row++) {
            int count = 0;
            for (int column = 0; column < matrix[0].length; column++) {

                if (matrix[row][column] == 1) {
                    count++;
                }

            }
            if (count > max) {
                max = count;
                maxColumnIndex = row;
            }

        }
        return maxColumnIndex;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }
}



