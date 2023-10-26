package week_08;

import java.util.Scanner;

public class Question_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] points = new double[3][2];
        System.out.print("Enter x1, y1, x2, y2, x3, y3: ");

        for (int row = 0; row < points.length; row++) {
            for (int column = 0; column < points[row].length; column++) {
                points[row][column] = input.nextDouble();

            }
        }

        double result = getTriangleArea(points);

        if (result == 0) {
            System.out.println("The three points are on the same line");
        } else {
            System.out.printf("The area of the triangle is %.2f",result);
        }
    }

    public static double getTriangleArea(double[][] points) {

        if (isSameLine(points)) {
            return 0;
        }
        double s1 = findSide(points[0][0],points[0][1],points[1][0],points[1][1]);
        double s2 = findSide(points[1][0],points[1][1],points[2][0],points[2][1]);
        double s3 = findSide(points[0][0],points[0][1],points[2][0],points[2][1]);

        double s = (s1 + s2 + s3) / 2;

        double area = Math.sqrt((s * (s - s1) * (s - s2) * (s - s3)));

        return area ;
    }

    public static double findSide(double x1, double y1, double x2, double y2) {
        return Math.pow(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2), 0.5);
    }

    private static boolean isSameLine(double[][] pts) {
        double determinant = (pts[1][0] - pts[0][0]) * (pts[2][1] - pts[0][1]) - (pts[2][0] - pts[0][0]) * (pts[1][1] - pts[0][1]);

        return determinant == 0;

    }
}
