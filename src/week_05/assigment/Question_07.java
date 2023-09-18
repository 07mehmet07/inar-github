package week_05.assigment;

public class Question_07 {
    public static void main(String[] args) {
        int tuition = 10000;
        final double rate = 0.05;
        double totalcost = 0;
        int year;

        for (year = 1; year < 11; year++) {
            tuition += tuition * rate;
        }

        System.out.println("Tution in ten years is; " + tuition);

        for (year = 1; year < 5; year++) {
            tuition += tuition * rate;
            totalcost += tuition;

        }
        System.out.println("Total cost for four years worth of tuition after the tenth year: " + totalcost);


    }


}

