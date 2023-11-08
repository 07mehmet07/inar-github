package week_10.assignment.Exercise_03;

public class MyInteger {

    private int value;

    public MyInteger(int newValue) {

        this.value = newValue;

    }


    public boolean isEven() {
        if (value % 2 == 0)
            return true;
        else
            return false;

    }

    public boolean isOdd() {
        if (value % 2 != 0)
            return true;
        else
            return false;

    }

    public boolean isPrime() {
        for (int i = 2; i <= value / 2; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int a) {
        if (a % 2 == 0)
            return true;
        else
            return false;

    }

    public static boolean isOdd(int a) {
        if (a % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPrime(int value) {
        for (int i = 2; i <= value / 2; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger a) {
        return a.isEven();

    }

    public static boolean isOdd(MyInteger a) {
        return a.isOdd();
    }

    public static boolean isPrime(MyInteger a) {
        return a.isPrime();
    }

    public boolean equals(int a) {
        if (this.value == a) {
            return true;
        } else
            return false;
    }

    public boolean equals(Integer a) {
        if (this.value == a) {
            return true;
        } else {
            return false;
        }
    }

    public static int parseInt(char[] chars) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            stringBuilder.append(chars[i]);
        }
        String str = stringBuilder.toString();
        int result = Integer.parseInt(str);
        return Integer.parseInt(str);
    }

    public static int parseInt(String str) {
        return Integer.parseInt(str);
    }

    public int getValue() {
        return value;
    }


}
