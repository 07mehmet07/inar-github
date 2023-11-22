package week_12.assigment.exercise_10;

public class Question_12_10 {
    public static void main(String[] args) {

        try {
            int[] array = new int[Integer.MAX_VALUE];
        } catch (OutOfMemoryError e) {
            System.out.println("OutOfMemoryException occurs! : Java heap space");
        }
    }
}

