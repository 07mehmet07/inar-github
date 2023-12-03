package week_13.assignment.question_13_05;

public class Rectangle extends GeometricObject {


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

    @Override
    public String toString() {
        return super.toString() +
                "\nheight=" + height +
                "\nwidth=" + width +
                "\nArea : " + getArea() +
                "\nPerimeter : " + getPerimeter();
    }
}
