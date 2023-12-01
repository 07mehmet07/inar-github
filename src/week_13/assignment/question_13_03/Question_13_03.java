package week_13.assignment.question_13_03;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question_13_03 {
    public static void main(String[] args) {


        ArrayList<Number> list = new ArrayList<>();
        list.add(1);
        list.add(new BigInteger("456768789"));
        list.add(new BigDecimal("54465768.5467890"));
        list.add(1.53);
        list.add(5);
        list.add(11);
        list.add(12.5);
        list.add(6555657L);


        System.out.println("Before sort --> " + list);
        sort(list);
        System.out.println("After sort --> " + list);
    }

    public static void sort(ArrayList<Number> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int index = i;
            double currentMin = list.get(i).doubleValue();
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).doubleValue() < currentMin) {
                    currentMin = list.get(j).doubleValue();
                    index = j;
                }

            }

            if (index != i) {
                list.set(index, list.get(i));
                list.set(i, currentMin);
            }


        }


    }

}
