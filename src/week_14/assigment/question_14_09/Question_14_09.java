package week_14.assigment.question_14_09;

public class Question_14_09 {
    public static void main(String[] args) {
        MyQueue m = new MyQueue();
        m.push(54);
        m.push(42);
        m.push(13);
        m.push(77);
        m.push(22);

        System.out.println(m.pop());
        System.out.println(m.peek());
        System.out.println(m.empty());
        System.out.println(m.getMainStack());
        System.out.println(m.getTempStack());


    }
}
