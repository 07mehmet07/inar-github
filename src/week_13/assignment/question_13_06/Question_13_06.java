package week_13.assignment.question_13_06;

public class Question_13_06 {
    public static void main(String[] args) {

        ComparableCircle1 circle1 = new ComparableCircle1("blue", true, 16.5);
        ComparableCircle1 circle2 = new ComparableCircle1("purple", true, 28.5);

        System.out.println("ComparableCircle1 : \n" + circle1);
        System.out.println("ComparableCircle2 : \n" + circle2);

        if (circle1.compareTo(circle2) == 1) {
            System.out.println("ComparableCircle1 is the larger of two circles");
        } else if (circle2.compareTo(circle1) == 1) {
            System.out.println("ComparableCircle2 is the larger of two circles");
        } else
            System.out.println("two circles are same!");


    }
}
