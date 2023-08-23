package week_03.assigment;

import java.util.Scanner;

public class Question_17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("scissor(0) , rock(1) , paper(2): ");
        int guess = input.nextInt();
        int random = (int) (Math.random() * 3);

        if (random == guess) {
            if (random == 0) {
                System.out.println("The random is scissor.You are scissor too.It is a draw");
            } else if (random == 1) {
                System.out.println("The random is rock.You are rock too.It is a draw");
            } else if (random == 2) {
                System.out.println("The random is paper.You are paper too.It is a draw");
            }
        } else if (random == 0 && guess == 1) {
            System.out.println("The random is scissor.You are rock.You won.");
        } else if (random == 0 && guess == 2) {
            System.out.println("The random is scissor.You are paper.You lost.");
        } else if (random == 1 && guess == 0) {
            System.out.println("The random is rock.You are scissor.You lost.");
        } else if (random == 1 && guess == 2) {
            System.out.println("The random is rock.You are paper.You won.");

        } else if (random == 2 && guess == 1) {
            System.out.println("The random is paper.You are rock.You lost.");
        } else if (random == 2 && guess == 0) {
            System.out.println("The random is paper.You are scissor.You won.");
        }
    }
}
