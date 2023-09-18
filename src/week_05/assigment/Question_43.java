package week_05.assigment;

public class Question_43 {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i < 8; i++) {
            for (int j = i + 1; j < 8; j++) {
                System.out.println(i + " " + j);
                counter++;
            }
        }
        System.out.println("The total number of all combinations is " + counter);
    }
}
