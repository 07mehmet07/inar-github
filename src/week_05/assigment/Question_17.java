package week_05.assigment;

import java.util.Scanner;

public class Question_17 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter the number of lines: ");
        int numberOfLines = input.nextInt();

        
        for (int sequence = 1; sequence <= numberOfLines; sequence++) {
        
            for (int d = numberOfLines - sequence; d >= 1; d--) {
                System.out.print("  ");
            }
            
            for (int l = sequence; l >= 2; l--) {
                System.out.print(l + " ");
            }
            for (int s = 1; s <= sequence; s++) {
                System.out.print(s + " ");
            }

            System.out.println();
        }
    }
}
