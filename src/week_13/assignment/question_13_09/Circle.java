package week_13.assignment.question_13_09;

import week_13.assignment.question_13_06.GeometricObject;

public class Circle extends GeometricObject implements Comparable<Circle> {
    private double radius;


    public Circle() {

    }

    public Circle(double newRadius) {
        this.radius = newRadius;

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


    public int compareTo(Circle o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() == o.getArea()) {
            return 0;
        } else
            return -1;
    }


    public boolean equals(Object obj) throws ClassCastException {
        boolean result;
        if (obj instanceof Circle) {
            result = this.compareTo((Circle) obj) == 0;
        } else {
            throw new ClassCastException();
        }
        return result;
    }
}
