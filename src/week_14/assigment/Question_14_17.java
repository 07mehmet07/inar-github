package week_14.assigment;

import java.util.*;

public class Question_14_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Integer> list1 = new ArrayList<>();

        System.out.println("Enter integers (enter 0 to stop) : ");
        int num ;
        while ((num = input.nextInt()) != 0) {
            list1.add(num);
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int numbers : list1) {
            int newRepeat = map.getOrDefault(numbers, 0) + 1;
            map.put(numbers, newRepeat);
        }
        int maxNumber = Collections.max(map.values());

        List<Integer> theMostTimes = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxNumber) {
                theMostTimes.add(entry.getKey());
            }
        }
        System.out.println("Number(s) with the most Occurrences :\n");
        System.out.println(theMostTimes + "==> " + maxNumber);


    }
}
