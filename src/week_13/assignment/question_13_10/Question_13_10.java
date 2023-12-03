package week_13.assignment.question_13_10;

public class Question_13_10 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(3, 5);
        Rectangle rectangle2 = new Rectangle(3, 5);
        Rectangle rectangle3 = new Rectangle(3, 8);


        System.out.println("Rectangle Area1 : " + rectangle1.getArea());
        System.out.println("Rectangle Area2 : " + rectangle2.getArea());
        System.out.println("Rectangle Area3 : " + rectangle3.getArea());

        if (rectangle1.equals(rectangle2)) {
            System.out.println("is equal");
        } else
            System.out.println("is not equal");

        if (rectangle1.equals(rectangle3)) {
            System.out.println("is equal");
        } else
            System.out.println("is not equal");

    }
}
