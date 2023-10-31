package week_08.assigment;

import java.util.Scanner;

public class Question_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of points : ");
        int sizeOfNumbers = input.nextInt();

        double[][] points = new double[sizeOfNumbers][2];
        System.out.println("Enter the " + sizeOfNumbers + " points :");

        for (int i = 0; i < sizeOfNumbers; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }
            int p1 = 0;
            int p2 = 1;
            double shortestDistance = distance(points[p1][0], points[p1][1], points[p2][0], points[p2][1]);


            for (int k = 0; k < points.length - 1; k++) {
                for (int j = k + 1; j < points.length; j++) {
                    double distance = distance(points[k][0], points[k][1], points[j][0], points[j][1]);

                    if (shortestDistance > distance) {
                        shortestDistance = distance;
                    }
                }

            }


            for (int a = 0; a < points.length - 1; a++) {
                for (int j = a + 1; j < points.length; j++) {
                    double dist = distance(points[a][0], points[a][1], points[j][0], points[j][1]);
                    if (dist == shortestDistance) {
                        System.out.println("The closest two points are (" + points[a][0] + ", " + points[a][1] + ") and (" + points[j][0] + ", " + points[j][1] + ")");
                    }
                }
            }
            System.out.println("Their distance is " + shortestDistance);
        }


    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}
