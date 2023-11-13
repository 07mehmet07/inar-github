package week_10.assignment.exercise_28;

public class Question_10_28 {
    public static void main(String[] args) {

        char[] chars = {'F', 'e', 'n', 'e', 'r', 'b', 'a', 'h', 'c', 'e'};

        MyStringBuilder2 str1 = new MyStringBuilder2("1907");
        MyStringBuilder2 str2 = new MyStringBuilder2(chars);

        System.out.print("Insert s2 into s1 at index 2 --------> ");
        MyStringBuilder2 str3= str1.insert(2, str2);
        System.out.println(str3);

        System.out.println("Reverse s2 --------------------------> " + str2.reverse().toString());

        System.out.println("Substring of s3 beginning index 10 --> " + str3.substring(7));

        System.out.println("S2 to upper case --------------------> " + str2.toUpperCase());
    }
}

