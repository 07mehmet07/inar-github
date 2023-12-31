package week_10.assignment.exercise_27;

public class MyStringBuilder1 {
    private String s;

    public MyStringBuilder1(String s) {
        this.s = s;
    }

    public MyStringBuilder1 append(MyStringBuilder1 s) {
        this.s = this.s + s.toString();
        return this;
    }


    public MyStringBuilder1 append(int i) {
        this.s = this.s + i;
        return this;
    }


    public int length() {
        return this.s.length();
    }


    public char charAt(int index) {
        return this.s.charAt(index);
    }


    public MyStringBuilder1 toLowerCase() {
        this.s = s.toLowerCase();
        return this;
    }


    public MyStringBuilder1 substring(int begin, int end) {
        this.s = s.substring(begin, end);
        return this;
    }

    public String toString() {
        return this.s.toString();
    }
}
