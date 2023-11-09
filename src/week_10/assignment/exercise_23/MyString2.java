package week_10.assignment.exercise_23;

public class MyString2 {
    private char[] chars;

    public MyString2(String s) {
        this.chars = s.toCharArray();
    }

    public MyString2 substring(int begin) {
        String s = "";
        for (int i = begin; i < chars.length; i++) {
            s += chars[i];
        }
        return new MyString2(s);
    }
    public int compare(String s) {
        if (chars.length < s.length()) {
            return -1;

        } else if (chars.length == s.length()) {
            for (int i = 0; i < s.length(); i++) {
                if (chars[i] < s.charAt(i)) {
                    return -1;
                } else if (chars[i] > s.charAt(i)) {
                    return 1;
                } else {
                    return 0;
                }
            }
            return 0;
        }
        return 1;
    }
    public MyString2 toUpperString() {
        String s = "";
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = (char) ((chars[i] - 'a') + 'A');
            }
            s += chars[i];
        }
        return new MyString2(s);
    }

    public char[] toChars() {
        return chars;
    }

    public static MyString2 valueOf(boolean b) {
        return b ? new MyString2("true") : new MyString2("false");
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < chars.length; i++) {
            s += chars[i];
        }
        return s;
    }
}


