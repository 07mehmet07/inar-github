package week_14.assigment;

import java.util.*;

public class Question_14_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 100));
        }
        System.out.print("The Original List\n" + list);

        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0){
                odd.add(list.get(i));

            }else {
                even.add(list.get(i));
            }
        }
        odd.addAll(even);
        System.out.println("\nRearranged List : " + odd);





    }
}
