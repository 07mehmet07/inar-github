package week_13.assignment.question_13_05;

public class Circle extends GeometricObject {

    private int radius;


    public Circle() {

    }

    public Circle(String color, boolean isFilled, int radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
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
}
