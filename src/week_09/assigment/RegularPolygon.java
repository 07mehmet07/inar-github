package week_09.assigment;

public class RegularPolygon {

    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;


    RegularPolygon() {

    }

    RegularPolygon(int number, double side) {
        this.n = number;
        this.side = side;

    }

    RegularPolygon(int number, double side, double newX, double newY) {
        this.n = number;
        this.side = side;
        this.x = newX;
        this.y = newY;

    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getPerimeter() {
        return n * side;
    }

    public double getArea() {
        return (n * Math.pow(side, 2) / (4 * Math.tan(Math.PI / n)));
    }
}
