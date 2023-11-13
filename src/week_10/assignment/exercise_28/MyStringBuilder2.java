package week_10.assignment.exercise_28;

public class MyStringBuilder2 {
    private String s;


    public MyStringBuilder2() {
        this.s = " ";

    }

    public MyStringBuilder2(char[] chars) {
        this.s = String.valueOf(chars);
    }

    public MyStringBuilder2(String s) {
        this.s = s;
    }

    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {

        String begin = this.s.substring(0, offset);
        String finall = this.s.substring(offset);


        return new MyStringBuilder2(begin + s.toString() + finall);
    }

    public MyStringBuilder2 reverse() {
        StringBuilder newStr = new StringBuilder();
        for (int i = s.length() - 1; 0 <= i; i--) {
            newStr.append(s.charAt(i));
        }
        return new MyStringBuilder2(newStr.toString());
    }

    public MyStringBuilder2 substring(int begin) {
        this.s = s.substring(begin);
        return this;
    }

    public MyStringBuilder2 toUpperCase() {
        this.s = s.toUpperCase();
        return this;
    }


    public String toString() {
        return this.s;
    }
}
