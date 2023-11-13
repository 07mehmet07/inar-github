package week_10.assignment.exercise_27;

public class Question_10_27 {
    public static void main(String[] args) {


        MyStringBuilder1 str = new MyStringBuilder1("La Casa De Papel--");
        System.out.println(str);

        MyStringBuilder1 str2 = new MyStringBuilder1("@El Profesor");
        str.append(str2);
        System.out.println(str.toString());

        System.out.println(str.append(4161));


        System.out.println(str.length());

        System.out.println(str.charAt(11));

        System.out.println(str.toLowerCase());
        System.out.println(str);

        System.out.println(str.substring(19, 30));
        System.out.println(str);


    }
}
