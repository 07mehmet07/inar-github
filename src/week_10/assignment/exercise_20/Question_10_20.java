package week_10.assignment.exercise_20;

import java.math.BigDecimal;

public class Question_10_20 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            display(i * 100);
        }
    }

    public static void display(int numbers) {
        BigDecimal e = BigDecimal.ONE;
        for (int i = 1; i <= numbers; i++) {
            BigDecimal b = BigDecimal.ONE.divide(factorial(i), 25, BigDecimal.ROUND_UP);
            e = e.add(b);
        }
        System.out.printf(" %-4d is: %s\n", numbers, e);

    }

    public static BigDecimal factorial(long n) {
        BigDecimal result = BigDecimal.ONE;
        for (int i = 1; i <= n; i++)
            result = result.multiply(new BigDecimal(i + ""));
        return result;
    }

}
