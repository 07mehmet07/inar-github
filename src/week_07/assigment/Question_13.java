package week_07.assigment;

import java.util.Scanner;

public class Question_13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] myNumbers = new int[10];

        System.out.print("Enter ten numbers to exclude from random (1- 54): ");

        for (int i = 0; i < myNumbers.length; i++) {
            myNumbers[i] = input.nextInt();
        }
        int randomNum = getRandom(myNumbers);
        System.out.print("Number generated : " + randomNum);

    }

    public static int getRandom(int... numbers){
boolean isEqual = true;
int randomNum = 0;
while(isEqual){
    randomNum = (int) (Math.random()*53 + 1);
    for (int i = 0; i < numbers.length; i++) {
        if (randomNum == numbers[i]){
            isEqual= true;
        break;
    }else
        isEqual= false ;

}}

return randomNum ;
    }




}
