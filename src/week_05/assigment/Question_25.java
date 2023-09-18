package week_05.assigment;

import java.util.Scanner;

public class Question_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

double value1 = 0;
  double  value2 = 0 ;
    double    value3= 0 ;

        for (double i = 0 ; i <=100000.0 ; i += 10000 ){


            if (i == 10000){
                System.out.println("pi1 :" + value1);
            } else if (i == 20000) {
                System.out.println("pi2 : " + value2);

            } else if (i == 100000) {

                System.out.println("pi3 : " + value3);

            }


        }


    }
}
