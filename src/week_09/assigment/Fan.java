package week_09.assigment;

public class Fan {

    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private int speed;

    private boolean on;

    private double radius;
    private String color;


    Fan() {

        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";

    }


    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {


        String text;
        if (on) {
            text = "Fan speed : " + this.speed + ", color : " + this.color + ", radius : " + this.radius;
        } else
            text = "Fan color : " + this.color + ", radius : " + this.radius + "\nFan is off ";

        return text;
    }
}
