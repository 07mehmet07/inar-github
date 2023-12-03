package week_13.assignment.question_13_06;

public class ComparableCircle1 extends Circle {


    public ComparableCircle1() {

    }

    public ComparableCircle1(double newRadius) {
        super(newRadius);
    }

    public ComparableCircle1(String color, boolean isFilled, double radius) {
        super(color, isFilled, radius);
    }

    public int compareTo(ComparableCircle1 object) {
        return Double.compare(this.getArea(), object.getArea());
    }


}
