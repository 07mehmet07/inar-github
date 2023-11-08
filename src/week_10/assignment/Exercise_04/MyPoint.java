package week_10.assignment.Exercise_04;

public class MyPoint {
    private double x;
    private double y;

    public MyPoint(){
    }
    public MyPoint(double x , double y){
        this.x = x;
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double distance(double newX, double newY) {
        return Math.sqrt(Math.pow(newX - x, 2) + Math.pow(newY - y, 2));
    }
    public double distance(double x1,double y1,double x2,double y2){
        return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
    }

}

