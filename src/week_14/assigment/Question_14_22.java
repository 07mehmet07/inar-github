package week_14.assigment;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Question_14_22 {

    public static boolean isHappyNumber(int number) {
        Set<Integer> set = new HashSet<>();
        while (number != 1 && !set.contains(number)) {
            set.add(number);
            number = sumOfSquare(number);

        }

        return number == 1;
    }

    public static int sumOfSquare(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += (int) (Math.pow(digit, 2));

            number /= 10;
        }

        return sum;
    }
}