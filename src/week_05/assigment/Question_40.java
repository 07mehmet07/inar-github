package week_05.assigment;

public class Question_40 {
    public static void main(String[] args) {

        int countOfHeads = 0;
        int countOfTails = 0;

        for (int i = 0; i < 1000000; i++) {
            int number = (int) (Math.random() * 2);

            if (number == 0) {
                countOfHeads++;
            } else {
                countOfTails++;
            }
        }

        System.out.print("Heads : " + countOfHeads + "\nTails : " + countOfTails);
    }
}