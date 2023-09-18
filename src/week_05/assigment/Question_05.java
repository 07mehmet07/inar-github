package week_05.assigment;

public class Question_05 {
    public static void main(String[] args) {
        final double rate = 2.2;
        System.out.println("Kilograms   Pounds     |          Pounds        Kilograms");

        for (int i = 1, k = 20; i < 200 && k < 516; i += 2, k += 5) {
            System.out.printf("%-12d%6.1f%6s%10s", i, i * 2.2, "|", "          " );
            System.out.printf("%-17d %6.1f" , k ,k / rate);
            System.out.println();
        }
    }}