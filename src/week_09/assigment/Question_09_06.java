package week_09.assigment;
import java.util.Arrays;
public class Question_09_06 {
    public static void main(String[] args) {


StopWatch stopWatch = new StopWatch();

int[] numbers = new int[100_000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100_000);

        }

        stopWatch.start();
        Arrays.sort(numbers);
        stopWatch.stop();

        System.out.println("The execution time of sorting " + numbers.length + " numbers using selection sort : " + stopWatch.getElapsedTime() + " milliseconds");

    }

}
