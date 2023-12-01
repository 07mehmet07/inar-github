package week_13.assignment.question_13_02;

import java.util.ArrayList;

public class Question_13_02 {
    public static void main(String[] args) {

        ArrayList<Number> list = new ArrayList<>();

        list.add(1);
        list.add(1.5);
        list.add(10);
        list.add(1.53);
        list.add(5);
        list.add(12.5);
        list.add(65);

        System.out.println("Before shuffle ..." + "\n" + list);
        shuffle(list);
        System.out.println("After shuffle ..." + "\n" + list);


    }

    private static void shuffle(ArrayList<Number> list) {

        for (int i = 0; i < 1000; i++) {
            int index = (int) (Math.random() * list.size());
            Number number = list.get(index);
            list.remove(index);
            list.add(number);

        }

    }


}
