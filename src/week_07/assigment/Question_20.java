package week_07.assigment;
import java.util.Arrays;
import java.util.Scanner;

public class Question_20 {
    public static void main(String[] args) {
        double[] numbers = new double[10];

        Scanner in = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = in.nextDouble();
        }
        selectionSort(numbers);
        System.out.println(Arrays.toString(numbers));


    }


    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {

            double currentMin = list[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}
