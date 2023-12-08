package week_14.assigment;

import java.util.*;

public class Question_14_13 {
    public static void main(String[] args) {
        final  int  Size_Of_Number  = 10;

        List<Integer> list1 = new ArrayList<>(10);
        for (int i = 0; i < Size_Of_Number; i++) {
            list1.add((int) (Math.random() * 3));
        }
        System.out.print("Generated integers : " + list1);

        Map<Integer, Integer> map = new HashMap<>();
        for (int numbers : list1) {
            int newRepeat = map.getOrDefault(numbers, 0) + 1;
            map.put(numbers, newRepeat);
        }

        List<Integer> theMostTimes = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > (Size_Of_Number / 3)) {
                theMostTimes.add(entry.getKey());
            }
        }
        System.out.println("\nElements appearing more than n/3 times : " + theMostTimes);

    }
}
