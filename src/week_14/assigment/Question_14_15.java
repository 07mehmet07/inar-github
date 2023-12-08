package week_14.assigment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question_14_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements (n): ");
        int n = input.nextInt();
        System.out.println("Enter the elements of the ArrayList (each in the range [1,n]) :");

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(input.nextInt());
        }


        Map<Integer, Boolean> map = new HashMap<>();
        ArrayList<Integer> missNumbers = new ArrayList<>();

        for (int num : list) {
            map.put(num, true);
        }
        System.out.println(map);
        for (int i = 1; i <= list.size(); i++) {
            if (!map.containsKey(i)){
                missNumbers.add(i);
            }
        }

        System.out.println("Number missing from the Arraylist : " + missNumbers);
    }

}
