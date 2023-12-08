package week_14.assigment;

import java.util.*;


public class Question_14_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();


        System.out.print("Enter the integer numbers for ArrayList (enter -1 to stop) : ");
        int num = input.nextInt();
        while (num != -1) {
            list.add(num);
            num = input.nextInt();
        }
        for (Integer s : list) {
            System.out.print(s + " ");
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 0) {
                list.remove(i);
                list.add(0);
            }
        }

        System.out.println("\nArrayList after moving zeros the end\n" + list);


    }
}
