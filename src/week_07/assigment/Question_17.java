package week_07.assigment;
import java.util.Scanner;
public class Question_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        double[] scores = new double[numberOfStudents];
        String[] names = new String[numberOfStudents];

        System.out.println("Enter the name a score for each student :");

        for (int i = 0; i < names.length; i++) {
            System.out.print("Student " + (i + 1) + " :");
            names[i] = input.next();
            System.out.print("Score: ");
            scores[i] = input.nextDouble();
        }

        sortArray(scores, names);


        for (int i = 0; i < scores.length; i++) {
            System.out.println(names[i] );
        }
    }

    public static void sortArray(double[] scores, String[] names) {

        for (int i = 0; i < scores.length; i++) {
            double currentMax = scores[i];
            int currentIndex = i;
            String temp;

            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] > currentMax) {
                    currentMax = scores[j];
                    currentIndex = j;
                }
            }
            if (currentIndex != i) {
                temp = names[i];
                names[i] = names[currentIndex];
                names[currentIndex] = temp;
                scores[currentIndex] = scores[i];
                scores[i] = currentIndex;
            }
        }
    }
}
