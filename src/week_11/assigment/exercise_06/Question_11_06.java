package week_11.assigment.exercise_06;


import java.util.ArrayList;
import java.util.Objects;
import java.util.Date;

public class Question_11_06 {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(new Loan());
        objects.add(new Date());
        objects.add(new String("Inar Academy"));
        objects.add(new Circle());

        for (Object o : objects) {
            System.out.println(o);
            System.out.println("-----------------------");
        }
    }


}

