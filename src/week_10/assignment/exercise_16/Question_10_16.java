package week_10.assignment.exercise_16;

import java.math.BigDecimal;


public class Question_10_16 {
    public static void main(String[] args) {

        BigDecimal number = new BigDecimal("10").pow(49);

        int count = 0;

        while (count < 10) {

            if (number.remainder(BigDecimal.valueOf(2)).equals(BigDecimal.ZERO) ||
                    number.remainder(BigDecimal.valueOf(3)).equals(BigDecimal.ZERO)) {
                System.out.println(number);
                count++;
            }

            number = number.add(BigDecimal.ONE);
        }
    }
}


