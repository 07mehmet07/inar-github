package week_14.assigment;

import java.util.*;

public class Question_14_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter the size n for Arraylist A :");
        int number = input.nextInt();
        System.out.print("Enter " + number + " integers for Arraylist A :");
        for (int i = 0; i < number; i++) {
            list.add(input.nextInt());
        }





        ArrayList<Integer> list1 = new ArrayList<>();

        System.out.print("\nEnter the size 'n' for ArrayList B: ");
        int numbers2 = input.nextInt();
        System.out.print("Enter " + numbers2 + " Integers for ArrayList B: ");
        for (int i = 0; i < numbers2; i++) {
            list1.add(input.nextInt());
        }
        list.addAll(list1);
        Collections.sort(list);

        HashSet<Integer> list2 = new HashSet<>();

        System.out.println("Merged and sorted ArrayList C");
        for (int i = 0; i < list.size(); i++) {
            list2.add(list.get(i));
        }
        System.out.println(list2);

    }
}
