package week_08.assigment;

public class Question_16 {
    public static void main(String[] args) {

        int[][] m = {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}};


        sort(m);

    }

    public static void sort(int[][] m) {

        for (int i = 0; i < m.length - 1; i++) {

            int minRow = m[i][0];
            int minCol = m[i][1];
            int minIndex = i;

            for (int j = i + 1; j < m.length; j++) {
                if (minRow > m[j][0]) {
                    minRow = m[j][0];
                    minCol = m[j][1];
                    minIndex = j;

                } else if (minRow == m[j][0] && minCol > m[j][1]) {
                    minCol = m[j][1];
                    minIndex = j;
                }

            }
            if (minIndex != i) {
                m[minIndex][0] = m[i][0];
                m[i][0] = minRow;
                m[minIndex][1] = m[i][1];
                m[i][1] = minCol;

            }

        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
        }

    }
}
