package week_13.assignment.question_13_05;

import org.jetbrains.annotations.NotNull;

import java.util.Date;

public abstract class GeometricObject implements Comparable<GeometricObject> {
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

    @Override
    public int compareTo(GeometricObject o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() == o.getArea()) {
            return 0;
        } else
            return -1;
    }

    public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
        return o1.compareTo(o2) == 1 ? o1 : o2;
    }
}

