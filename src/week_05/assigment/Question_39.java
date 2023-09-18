package week_05.assigment;

import java.util.Scanner;

public class Question_39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int baseSalary = 5000;
        int earn = 30000;
        double comission = 0;
        double salesAmount;
        double sales = 0;

        for (salesAmount = 0; comission < (earn - baseSalary); salesAmount++) {
            if (0 <= salesAmount && salesAmount <= 5000) {
                comission = salesAmount * 0.08;
            } else if (salesAmount <= 10000) {
                comission = 5000 * 0.08 + (salesAmount - 5000) * 0.1;
            } else {
                comission = 5000 * 0.08 + 5000 * 0.1 + (salesAmount - 10000) * 0.12;
            }
            sales += 0.01;
        }
        System.out.println("Minimum sales to earn $" + earn + " : $" + salesAmount);
    }
}
