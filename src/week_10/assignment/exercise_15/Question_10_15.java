package week_10.assignment.exercise_15;

import java.util.Scanner;

public class Question_10_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] points = new double[5][2];

        System.out.print("Enter 5 points: ");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = scanner.nextDouble();
            }
        }

        MyRectangle2D rectangle = MyRectangle2D.getRectangle(points);

        System.out.printf("""
                                
                The bounding rectangle`s center (%.1f, %.1f), width, %.1f height: %.1f
                """, rectangle.getX(), rectangle.getY(), rectangle.getWidth(), rectangle.getHeight());
    }
}

