package week_09.assigment;
import java.util.Date;
public class Question_09_03 {
    public static void main(String[] args) {

        int startElapsedNum = 10_000;
        long endElapsedNum = 100_000_000_000L;

        Date date = new Date();

        for (long i = startElapsedNum; i <= endElapsedNum; i *= 10) {

            date.setTime(i);

            System.out.println("For elapsed " + (i) + " time is " + date.toString());
        }

    }

}
