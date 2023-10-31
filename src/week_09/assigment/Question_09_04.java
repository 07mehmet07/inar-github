package week_09.assigment;

import java.util.Random;

public class Question_09_04 {
    public static void main(String[] args) {

        Random random = new Random(1000);

        System.out.println("Random numbers are\n");

        for (int i = 0; i < 50; i++) {
            int randomNumbers = random.nextInt(100);
            System.out.print(randomNumbers + " ");

            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

    }
}
