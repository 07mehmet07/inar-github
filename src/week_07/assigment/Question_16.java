package week_07.assigment;


import java.util.Arrays;

public class Question_16 {
    public static void main(String[] args) {
        int[] randomNum = new int[100_000];
        for (int i = 0; i < randomNum.length; i++) {
            randomNum[i] = (int) (Math.random() * 100_000);
        }

        int key = (int) (Math.random() * 100_000);


        long startTime = System.currentTimeMillis();
        linearSearch(randomNum, key);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;


        long startTime2 = System.currentTimeMillis();
        binarySearch(randomNum, key);
        long endTime2 = System.currentTimeMillis();
        long executionTime2 = endTime2 - startTime2;

        System.out.print("\nExecution time of invoking the linearSearch in miliseconds : " + executionTime);
        System.out.print("\nExecution time of invoking the binarySearch in miliseconds : " + executionTime2);

    }

    public static int linearSearch(int[] randomNum, int key) {
        for (int i = 0; i < randomNum.length; i++) {
            if (key == randomNum[i]) {
                return i;
            }
        }
        return -1;
    }


    public static int binarySearch(int[] randomNum, int key) {
        int[] sortedNumber = sortNumbers(randomNum);
        int low = 0;
        int high = sortedNumber.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < sortedNumber[mid]) {
                high = mid - 1;
            } else if (key == sortedNumber[mid]) {
                return mid;
            } else
                low = mid + 1;
        }
        return -low - 1;
    }

    public static int[] sortNumbers(int[] randomNum) {
        for (int i = 0; i < randomNum.length; i++) {
            int currentMin = randomNum[i];
            int currentMinIndex = i;

            for (int j = 0 + i; j < randomNum.length; j++) {
                if (currentMin > randomNum[j]) {
                    currentMin = randomNum[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                randomNum[currentMinIndex] = randomNum[i];
                randomNum[i] = currentMin;
            }
        }
        return randomNum;

    }
}




