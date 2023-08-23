package week_03.assigment;

import java.util.Scanner;

public class Question_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lottery = (int) (Math.random() * 900 +100);
        System.out.println("enter your lottery pick (three digits): ");
        int guess = input.nextInt();
        System.out.println("the lottery number is " + lottery);

        int lotd1= lottery / 100 ;
        int lotd2= (lottery / 10) % 10;
        int lotd3= lottery % 10;

        int gud1=  guess / 100;
        int gud2= (guess / 10) % 10;
        int gud3=  guess % 10 ;


        if (guess == lottery){
            System.out.println("You win $10000");
        } else if (gud1==lotd1 && gud2==lotd3 && gud3==lotd2 ||
                gud1==lotd2 && gud2==lotd1 && gud3==lotd3 ||
                gud1==lotd2 && gud2==lotd3 && gud3==lotd1 ||
                gud1==lotd3 && gud2==lotd1 && gud3==lotd2 ||
                gud1==lotd3 && gud2==lotd2 && gud3==lotd1)

        {
            System.out.println("You win $3000");
        } else if (gud1 == lotd1 || gud1 == lotd2 || gud1 == lotd3 ||
                gud2==lotd1 || gud2==lotd2 || gud2==lotd3 ||
                gud3==lotd1 || gud3==lotd2 || gud3==lotd3) {
            System.out.println("Match one number. $1000 prize !");
        }else {
            System.out.println("Sorry no match :(");
        }


    }
}
