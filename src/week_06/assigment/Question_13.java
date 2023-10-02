package week_06.assigment;

public class Question_13 {
    public static void main(String[] args) {


        System.out.println("\ni            m(i)");
        System.out.println("---------------------");

        for (int i = 1; i <= 20; i++) {
            System.out.printf("%-12d%2.4f" , i , sumSeries(i));
            System.out.println();
        }

    }

    public static double sumSeries(int number) {
        double sum = 0;
        for (double i = 1; i <= number; i++) {
            sum += i / (i + 1);
        }
        return sum;


    }


}
