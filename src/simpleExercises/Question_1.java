package simpleExercises;

public class Question_1 {
    public static void main(String[] args) {

        String simpleInput = "example";
        int indexToRemove = 5;


        String result = removeCharIndex(simpleInput, indexToRemove);
        System.out.println("Original String ; " + simpleInput);
        System.out.println("String after removing charecters at index " + indexToRemove + " : " + result);
    }


    private static String removeCharIndex(String simpleInput, int indexToRemove) {
        if (indexToRemove < 0 || indexToRemove > simpleInput.length()) {
            throw new IndexOutOfBoundsException("Invalid Input");
        }
        String result = simpleInput.substring(0, indexToRemove) + simpleInput.substring(indexToRemove + 1);

        return result;
    }

}