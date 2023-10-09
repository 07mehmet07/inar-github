package week_07.assigment;

public class Question_24 {
    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;

        }

        for (int i = 0; i < deck.length; i++) {
            int index = (int) (Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;

        }

        int countPicks = 0;
        int anotherSuits = 0;
        int j = 0;
        int i = 0;

        while (anotherSuits < 4){

            if (deck[i] / 13 == j) {
                System.out.println(ranks[deck[i] % 13] + " of " + suits[deck[i] / 13]);
                anotherSuits++;
                j++;
            }
        i++;
        countPicks++;
    }
     System.out.println("Number of picks : " + countPicks);
    }
}