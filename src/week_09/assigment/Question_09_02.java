package week_09.assigment;

public class Question_09_02 {
    public static void main(String[] args) {

Stock stock = new Stock("ORCL", "Oracle Corporation");
        System.out.println("Stock Name   :  " + stock.name);
        System.out.println("Stock Symbol :  " + stock.symbol);
        System.out.println("price-change percentage :  " + stock.getChangePercent(34.5, 34.35));

    }
}
