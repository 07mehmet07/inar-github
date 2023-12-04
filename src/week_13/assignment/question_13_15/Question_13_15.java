package week_13.assignment.question_13_15;

import java.math.BigInteger;

public class Question_13_15 {
    public static void main(String[] args) {
        Rational2 r1 = new Rational2(new BigInteger("5"), new BigInteger("6"));
        Rational2 r2 = new Rational2(new BigInteger("1"), new BigInteger("4"));


        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r2 + " is " + r2.doubleValue());
    }
}
