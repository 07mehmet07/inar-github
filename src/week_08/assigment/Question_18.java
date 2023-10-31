package week_08.assigment;

public class Question_18 {
    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};

        shuffle(m);

        for (int row = 0; row < m.length; row++) {
            System.out.println("{" + m[row][0] + ", " + m[row][1] + "} ");
        }
    }


    public static void shuffle(int[][] m) {
        for (int i = 0; i < m.length; i++) {

            int randomIndex = (int) (Math.random() * m.length);

            int[] temp = m[i];
            m[i] = m[randomIndex];
            m[randomIndex] = temp;
        }
    }
}
