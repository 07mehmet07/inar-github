package week_08.assigment;

public class Question_03 {
    public static void main(String[] args) {


        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        int[][] studentAndScores = new int[answers.length][2];


        for (int row = 0; row < answers.length; row++) {

            int correctCount = 0;

            for (int column = 0; column < answers[row].length; column++) {
                if (answers[row][column] == keys[column]) {
                    correctCount++;
                }
                studentAndScores[row][0] = correctCount;
                studentAndScores[row][1] = row;
            }

        }


        for (int i = 0; i < studentAndScores.length - 1; i++) {
            for (int j = i + 1; j < studentAndScores.length; j++) {

                if (studentAndScores[j][0] < studentAndScores[i][0]) {
                    int[] temp = studentAndScores[i];

                    studentAndScores[i] = studentAndScores[j];
                    studentAndScores[j] = temp;
                }

            }


        }
        for (int a = 0; a < studentAndScores.length; a++) {
            System.out.println("Student " + studentAndScores[a][1] + "` s correct count is " + studentAndScores[a][0]);
        }
    }
}

