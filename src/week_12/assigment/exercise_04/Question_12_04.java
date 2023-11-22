package week_12.assigment.exercise_04;

public class Question_12_04 {
    public static void main(String[] args) {

        try {

            LoanWithException loan = new LoanWithException(0, 7, 0);
            loan.toString();

        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}