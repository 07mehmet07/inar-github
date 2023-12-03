package week_13.assignment.question_13_06;

import org.jetbrains.annotations.NotNull;

public class Circle extends GeometricObject implements Comparable<Circle> {
    private double radius;


    public Circle() {

    }
    public Circle(double newRadius) {
        this.radius=newRadius;

    }

    public Circle(String color, boolean isFilled, double radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nRadius : " + radius +
                "\nArea : " + getArea() +
                "\nPerimeter : " + getPerimeter();


    }

    @Override
    public int compareTo(Circle o) {
        return 0;
    }
}
