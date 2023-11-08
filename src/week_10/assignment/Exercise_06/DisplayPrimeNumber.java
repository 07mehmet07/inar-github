package week_10.assignment.Exercise_06;
import week_10.assignment.Exercise_05.StackOfIntegers;

public class DisplayPrimeNumber {
    public static void main(String[] args) {

        StackOfIntegers stack = new StackOfIntegers();

        for (int number = 2; number < 120; number++) {
            boolean isPrime = true;
            for (int divider = 2; divider <= number / 2; divider++) {
                if(number % divider == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                stack.push(number);
            }
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }
    }

