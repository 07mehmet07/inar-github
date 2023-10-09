package week_07.assigment;

public class Question_29 {
    public static void main(String[] args) {
        String[] rank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        int sum;

        String card1;
        String card2;
        String card3;
        String card4;


        do {
            card1 = rank[(int) (Math.random() * 52) % 13];
            card2 = rank[(int) (Math.random() * 52) % 13];
            card3 = rank[(int) (Math.random() * 52) % 13];
            card4 = rank[(int) (Math.random() * 52) % 13];

            sum = sumOfCards(card1, card2, card3, card4);

        } while (sum != 24);

        printCards(card1, card2, card3, card4);
    }



    public static int sumOfCards(String... cards) {
        int sum = 0;

        for (String card : cards) {
            switch (card) {
                case "Jack" -> sum += 11;
                case "Queen" -> sum += 12;
                case "King" -> sum += 13;
                case "Ace" -> sum += 1;
                default -> sum += Integer.parseInt(card);
            }
        }
        return sum;
    }

    public static void printCards(String... cards) {
        System.out.println("The number of picks that yields the sum of 24 : "
                + cards[0] + " " + cards[1] + " " + cards[2] + " " + cards[3]);
    }}
