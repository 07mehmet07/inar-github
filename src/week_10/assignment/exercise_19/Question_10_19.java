package week_10.assignment.exercise_19;

import java.math.BigInteger;

public class Question_10_19 {
    public static void main(String[] args) {


        System.out.printf("%-10s%7s%n", "P", "2 * P -1");

        int numberOfPrimes = 0;

        for (int i = 2; i < 100; i++) {
            if (isPrime(i)) {
                numberOfPrimes++;
                System.out.printf("%-10d%-10s%n", i, getMersennePrime(i));
            }
        }

    }

    static boolean isPrime(long number) {
        long square = (long) Math.sqrt(number);
        for (int i = 2; i <= square; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    static java.math.BigDecimal getMersennePrime(int number) {
        return new java.math.BigDecimal(2).pow(number).subtract(java.math.BigDecimal.ONE);
    }
}
