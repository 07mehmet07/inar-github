package week_10.assignment.exercise_24;

public class Question_10_24 {
    public static void main(String[] args) {

        MyCharacter ch1 = new MyCharacter('a');
        MyCharacter ch2 = MyCharacter.valueOf('z');

        System.out.println(ch1);
        System.out.println(ch2);

        System.out.println(MyCharacter.compare('z', 'a'));
        System.out.println(MyCharacter.compare('a', 'a'));
        System.out.println(MyCharacter.compare('a', 'z'));

        System.out.println(ch1.compareTo(ch2));

        System.out.println(ch1.equals(new MyCharacter('a')));
        System.out.println(ch1.equals(ch2));

        System.out.println(MyCharacter.isDigit('a'));
        System.out.println(MyCharacter.isDigit('0'));

        System.out.println(MyCharacter.isLetter('@'));
        System.out.println(MyCharacter.isDigit('e'));

        System.out.println(MyCharacter.isLetterOrDigit('0'));
        System.out.println(MyCharacter.isLetterOrDigit('*'));

        System.out.println(MyCharacter.toLowerCase('Z'));
        System.out.println(MyCharacter.toLowerCase('*'));
        System.out.println(MyCharacter.toUpperCase('z'));
        System.out.println(MyCharacter.toUpperCase('*'));

    }
}
