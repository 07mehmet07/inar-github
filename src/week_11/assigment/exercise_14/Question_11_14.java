package week_11.assigment.exercise_14;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_14 {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();


        System.out.print("Enter five integers for list1: ");
        getFromUser(list1);

        System.out.print("Enter five integers for list2: ");
        getFromUser(list2);


        System.out.println("the combine list is " + union(list1, list2));


    }

    private static void getFromUser(ArrayList<Integer> list) {
        Scanner input = new Scanner(System.in);
        int numbers;
        for (int i = 0; i < 5; i++) {
            numbers = input.nextInt();
            list.add(numbers);
        }

    }


    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (int i = 0; i < list2.size(); i++) {
            list1.add(list2.get(i));
        }

        return list1;
    }

}
