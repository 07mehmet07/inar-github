package week_07.assigment;

public class Question_06 {
    public static void main(String[] args) {

        int[] primeNumbers = new int[50];
        primeNumbers[0] = 2;
        int number = 3;
        int count = 1;


        while (count < primeNumbers.length) {
            boolean isPrime = true;

            for (int i = 0; primeNumbers[i] <= Math.sqrt(number); i++) {
                if (number % primeNumbers[i] == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primeNumbers[count] = number;
                count++;
            }
            number++;
        }

        for (int j = 0; j < primeNumbers.length; j++) {

            if (j % 10 == 9) {
                System.out.print(primeNumbers[j] + "\n");
            } else
                System.out.print(primeNumbers[j] + "\t");
        }
    }

}
