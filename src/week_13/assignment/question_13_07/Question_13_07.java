package week_13.assignment.question_13_07;

import week_13.assignment.question_13_05.Rectangle;
import week_13.assignment.question_13_06.Circle;
import week_13.assignment.question_13_06.GeometricObject;

import java.util.ArrayList;

public class Question_13_07 {
    public static void main(String[] args) {

        ArrayList<GeometricObject> list = new ArrayList<>();
        list.add(new Circle(3));
        list.add(new Circle(4));
        list.add(new Circle(14));
        list.add(new Square(5));
        list.add(new Square(6.5));

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Area of Geometric Object in the index " + (i) + " is : " + list.get(i).getArea());
            if (list.get(i) instanceof Colorable){
                ((Square) list.get(i)).howToColor();
            }
            System.out.println("------------------------------------------------");
        }
    }
}
