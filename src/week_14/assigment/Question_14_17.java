package week_14.assigment;

import java.util.*;

public class Question_14_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Integer> list1 = new ArrayList<>();

        System.out.println("Enter integers (enter 0 to stop) : ");
        int num;
        while ((num = input.nextInt()) != 0) {
            list1.add(num);
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int numbers : list1) {
            int newRepeat = map.getOrDefault(numbers, 0) + 1;
            map.put(numbers, newRepeat);
        }
        int maxNumber = Collections.max(map.values());


        for (Integer i : map.keySet()) {
            if (map.get(i) == maxNumber) {
                System.out.println(i + " ==> " + map.get(i) + " times ");
            }
        }


    }
}
