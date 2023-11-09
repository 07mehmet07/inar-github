package week_10.assignment.exercise_17;

import java.math.BigInteger;

public class Question_10_17 {
    public static void main(String[] args) {


        long sqrt = (long) (Math.sqrt(Long.MAX_VALUE)) + 1;
        BigInteger num = new BigInteger(sqrt + "");

        System.out.println(Long.MAX_VALUE);
        for (int i = 0; i < 10; i++) {
            System.out.println(num.multiply(num));
            num = num.add(BigInteger.ONE);

        }

    }
}
