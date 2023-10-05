package week_07.assigment;

public class Question_07 {
    public static void main(String[] args) {

        System.out.println("Count for each number between 0 and 9 :");
        int[] count = new int[10];
        int ranNumber ;

        for (int i = 0; i < 100; i++) {

            ranNumber = (int) (Math.random() * 10);

            count[ranNumber]++;
        }


        for (int i = 0; i < count.length; i++) {
            System.out.println(i + "s :" + count[ i ]);
        }
    }
}
