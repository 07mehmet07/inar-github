package simpleExercises;

public class Question_2 {
    public static void main(String[] args) {
        String example2 = "     Mehmet      ";
        String example = example2.trim();
        System.out.println(example);

        String result = replaceString(example);
        System.out.println(example + "===>" + result);
    }

    private static String replaceString(String example) {
        if (example.length() < 1) {
            return example;
        }

        String mid = example.substring(1, example.length() - 1);
        return example.charAt(example.length() - 1) + mid + example.charAt(0);
    }
}
