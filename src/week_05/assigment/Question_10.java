package week_05.assigment;

public class Question_10 {
    public static void main(String[] args) {

        int count = 0;

        for (int i =100; i < 1001; i++) {
            if (i % 5 == 0 && i % 6 == 0) {
                System.out.print(i + " ");
                count++;
            }

            if (count % 10 == 0) {
                System.out.println();
            }


        }

    }


}
