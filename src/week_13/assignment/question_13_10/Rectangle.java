package week_13.assignment.question_13_10;

import org.jetbrains.annotations.NotNull;
import week_13.assignment.question_13_06.GeometricObject;
import week_13.assignment.question_13_09.Circle;

public class Rectangle extends GeometricObject implements Comparable<Rectangle> {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle(String color, boolean isFilled, double height, double width) {
        super(color, isFilled);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (height + width);
    }


    public int compareTo(Rectangle o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() == o.getArea()) {
            return 0;
        } else
            return -1;
    }


    public boolean equals(Object obj) {

        if (obj instanceof Rectangle) {
            return this.compareTo((Rectangle) obj) == 0;
        }
        return false;
    }
}
