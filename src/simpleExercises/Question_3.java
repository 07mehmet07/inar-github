package simpleExercises;

public class Question_3 {
    public static void main(String[] args) {
        String s = "adelbc";
        System.out.println(delString(s));
    }

    private static String delString(String s) {
        if (s.length() >= 4 && s.substring(1, 4).equals("del")) {
            return s.substring(0, 1) + s.substring(4);
        }
        return s;
    }
}
