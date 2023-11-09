package week_10.assignment.exercise_22;

import java.util.Arrays;

public class MyString1 {
    private char[] chars;

    public MyString1(char[] chars) {
        this.chars = chars.clone(); // Kopya alarak orijinal diziyi koru
    }

    public char charAt(int index) {
        return chars[index];
    }

    public int length() {
        return chars.length;
    }

    public MyString1 substring(int begin, int end) {
        char[] result = new char[end - begin];
        System.arraycopy(chars, begin, result, 0, end - begin);
        return new MyString1(result);
    }

    public MyString1 toLowerCase() {
        char[] result = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            result[i] = Character.toLowerCase(chars[i]);
        }
        return new MyString1(result);
    }

    public boolean equals(MyString1 s) {
        return Arrays.equals(chars, s.chars);
    }

    public static MyString1 valueOf(int i) {
        return new MyString1(String.valueOf(i).toCharArray());
    }
    public String toString() {
        String s = new String(chars);
        return s;
    }
}
