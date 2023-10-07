package week_07.assigment;

import java.util.Scanner;

public class Question_15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten number: ");
        int[] numbers = new int[10];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }
        int[] distinct = eliminateDuplicates(numbers);
        System.out.print("The distinct numbers are: ");
        for(int num : distinct){
                if (num >0)
                System.out.print(num + " ");
        }

    }
    public static int[] eliminateDuplicates(int[] list){
        int[] newList = new int[list.length];
        for(int i = 0; i < list.length; i++){
            boolean isSameNum = true;
            for(int j = i + 1;j < list.length; j++){
                if(list[i] == list[j])
                    isSameNum = false;
            }
            if(isSameNum)
                newList[i] = list[i];
        }
        return newList;
    }

}
