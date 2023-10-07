package week_07.assigment;

import java.util.Scanner;

public class Question_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.print("Enter ten numbers: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        bubbleSort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "\t");
        }
    }

public static void bubbleSort(double[] list){
        double temp ;
    for (int i = 0; i < list.length; i++) {
        for (int j = 0; j < list.length -1; j++) {
            if (list[j] > list[j + 1]) {
                temp = list[j];
                list[j] = list[j + 1];
                list[j + 1] = temp;

            }
        }
    }
}


}





