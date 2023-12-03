package week_13.assignment.question_13_05;

public class Question_13_05 {
    public static void main(String[] args) {


        System.out.println("The larger of the two circles is : ");
        System.out.println(Circle.max(new Circle("green", false, 5), new Circle("green", true, 4)));
        System.out.println("\nThe larger of the two rectangle is : ");
        System.out.println(Rectangle.max(new Rectangle("green", true, 12, 10), new Rectangle("yellow", false, 6, 5)));


    }
}
