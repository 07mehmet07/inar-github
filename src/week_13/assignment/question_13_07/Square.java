package week_13.assignment.question_13_07;

import week_13.assignment.question_13_06.GeometricObject;

public class Square extends GeometricObject implements Colorable {

private double side ;


    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean isFilled, double side) {
        super(color, isFilled);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side,2);
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
