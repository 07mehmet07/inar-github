package week_04.assignment04;

import java.util.Scanner;

public class Question_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String majorandStatus = input.next();
        majorandStatus = majorandStatus.toLowerCase();
        
        if (majorandStatus.equals("m1")) {
            System.out.println("Mathematics Freshman");
        }else if (majorandStatus.equals("m2")) {
            System.out.println("Mathematics Sophomore");
        }else if (majorandStatus.equals("m3")) {
            System.out.println("Mathematics Junior");
        }else if (majorandStatus.equals("m4")) {
            System.out.println("Mathematics Senior");
        }
        else if (majorandStatus.equals("c1")) {
            System.out.println("Computer Science Fresman");
        }else if (majorandStatus.equals("c2")) {
            System.out.println("Computer Science Sophomore");
        }else if (majorandStatus.equals("c3")) {
            System.out.println("Computer Science Junior");
        }else if (majorandStatus.equals("c4")) {
            System.out.println("Computer Science Senior");
        }
        else if (majorandStatus.equals("ı1")) {
            System.out.println("Information Technology Freshman");
        }else if (majorandStatus.equals("ı2")) {
            System.out.println("Information Technology Sophomore");
        }else if (majorandStatus.equals("ı3")) {
            System.out.println("Information Technology Junior");
        }else if (majorandStatus.equals("ı4")) {
            System.out.println("Information Technology Senior");
        }else {
            System.out.println("Invalid input!");
        }


    }
}
