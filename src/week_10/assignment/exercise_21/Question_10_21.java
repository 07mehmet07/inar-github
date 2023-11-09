package week_10.assignment.exercise_21;

import java.math.BigDecimal;

public class Question_10_21 {
    public static void main(String[] args) {



        BigDecimal number = new BigDecimal(Long.MAX_VALUE + "");
        System.out.println("First ten numbers greater than Long.MAX_VALUE that are divisible by 5 or 6:");

        int count = 0;

        while (count < 10) {

            if (number.remainder(BigDecimal.valueOf(5)).equals(BigDecimal.ZERO) ||
                    number.remainder(BigDecimal.valueOf(6)).equals(BigDecimal.ZERO)) {
                System.out.println(number);
                count++;
            }

            number = number.add(BigDecimal.ONE);
        }
    }



    }

