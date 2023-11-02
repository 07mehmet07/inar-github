package week_09.assigment;

public class QuadraticEquation {

    private double a;
    private double b;
    private double c;

    QuadraticEquation(double a, double b, double c) {

        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getA() {
        return a;
    }


    public double getB() {
        return b;
    }


    public double getC() {
        return c;
    }


    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        return (-this.b + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public double getRoot2() {
        return (-this.b - Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public String toString() {

        String result;

        if (getDiscriminant() < 0) {
            result = "The equation has no real roots";

        } else if (getDiscriminant() == 0) {
            result = "The equation has one real root " + this.getRoot1();

        } else
            result = "The equation has two real roots " + this.getRoot1() + "\t" + this.getRoot2();

        return result;

    }


}
