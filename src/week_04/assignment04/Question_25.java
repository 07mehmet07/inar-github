package week_04.assignment04;

public class Question_25 {
    public static void main(String[] args) {

        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        int num3 = (int) (Math.random() * 10);
        int num4 = (int) (Math.random() * 10);

        int letter1 = (int) (65 + Math.random() * 26);
        int letter2 = (int) (65 + Math.random() * 26);
        int letter3 = (int) (65 + Math.random() * 26);

        char p1 = (char) letter1;
        char p2 = (char) letter2;
        char p3 = (char) letter3;

        System.out.println("" + p1 + p2 + p3 + num1  + num2 + num3 + num4);
    }
}

