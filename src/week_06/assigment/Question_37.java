package week_06.assigment;

import java.util.Scanner;

public class Question_37 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number and its width: ");
        int number = input.nextInt();
        int width = input.nextInt();
        System.out.print(number + " formatted to width " + width + ": " + format(number, width));
    }
    public static String format(int number,int width){
        String numStr = String.valueOf(number);

        if(numStr.length() >= width)
            return numStr;
        else{
            for(int i = numStr.length(); i < width; i++){
                numStr = "0" + numStr;
            }
            return numStr;
        }
    }
}
