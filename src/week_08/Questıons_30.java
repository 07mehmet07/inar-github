package week_08;

import java.util.Scanner;

public class Questıons_30 {
    public static void main(String[] args) {

        double[][] a = new double[2][2];
        double[] b = new double[2];

        getArray1(a);
        getArray2(b);

        double[] result = linearEquation(a, b);
        if (!(a[0][0] * a[1][1] - a[0][1] * a[1][0] == 0)) {
            System.out.println("x is " + result[0] + " and y is " + result[1]);
        } else {
            System.out.println("The equation has no solution.");
        }
    }

    public static void getArray1(double[][] a) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter values of a,b,c,d to solve linear equation:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = input.nextDouble();
            }
        }
    }

    public static void getArray2(double[] b) {
        Scanner input = new Scanner(System.in);
        b[0] = input.nextDouble();
        b[1] = input.nextDouble();
    }

    public static double[] linearEquation(double[][] a, double[] b) {
        double[] result = new double[2];
        result[0] = (b[0] * a[1][1] - b[1] * a[0][1]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
        result[1] = (b[1] * a[0][0] - b[0] * a[1][0]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
        return result;
    }
}