package week_08.Assigments;

import java.util.Scanner;

public class Questıon_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] list1 = new int[3][3];
        System.out.print("Enter list1: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list1[i][j] = input.nextInt();
            }
        }
        int[][] list2 = new int[3][3];
        System.out.print("\nEnter list2:  ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list2[i][j] = input.nextInt();
            }
        }
        if (equals(list1, list2)) {
            System.out.println("The two arrays are identical.");
        } else {
            System.out.println("The two arrays are not identical.");
        }
    }

    public static boolean equals(int[][] m1, int[][] m2) {

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
