package week_13.assignment.question_13_18;

import week_13.assignment.question_13_14.Rational;
import week_13.assignment.question_13_15.Rational2;

import java.math.BigInteger;

public class Question_13_18 {
    public static void main(String[] args) {

        double sum = 0;

        for (int i = 1; i < 100; i++) {
           sum += new Rational2(new BigInteger((i + "")) , new BigInteger((i + 1) + "")).doubleValue();

        }
        System.out.println(sum);

    }

}

