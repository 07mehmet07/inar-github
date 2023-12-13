package week_14.assigment;

import java.util.*;

public class Question_14_25 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            list.add((int) (Math.random() * 100 + 1));
        }
        System.out.println(list);

        int generated = (int) (Math.random() * 100 + 1);
        System.out.println("Generated Target : " + generated);

        ArrayList<Integer> numbers = sumOfNumbers(list, generated);
        if (numbers.size() == 2) {
            System.out.println("Number are : " + numbers.get(0) + " , " + numbers.get(1));
            System.out.println("Result : True");
        } else {
            System.out.println("There are not these two numbers");
            System.out.println("Result : False");
        }


    }

    private static ArrayList<Integer> sumOfNumbers(List<Integer> list, int generated) {
        Set<Integer> sumOfList = new HashSet<>(list);
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int nums : sumOfList) {
            int complement = generated - nums;
            if (sumOfList.contains(complement)) {
                numbers.add(nums);
                numbers.add(complement);
                return numbers;
            }

        }
        return numbers;

    }


}