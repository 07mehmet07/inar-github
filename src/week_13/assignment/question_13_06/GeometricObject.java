package week_13.assignment.question_13_06;

import java.util.Date;

public abstract class GeometricObject {
    private String color;
    private boolean isFilled;
    private Date date;

    protected GeometricObject() {
        this("White", false);
    }

    protected GeometricObject(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
        this.date = new Date();
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "It is created on " + date +
                "\ncolor : " + color +
                "\nfilled : " + isFilled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public boolean equals(Object obj) {
        return this.getArea() == ((week_13.assignment.question_13_01.GeometricObject) obj).getArea();
    }

}
