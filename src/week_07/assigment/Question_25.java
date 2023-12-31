package week_07.assigment;

import java.util.Scanner;

public class Question_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter values for a, b and c : ");
        double[] eqn = new double[3];
        double[] roots = new double[2];

        for (int i = 0; i < eqn.length; i++) {
            eqn[i] = input.nextDouble();
        }


        int countOfRoots =  solveQuadratic(eqn, roots);

        if (countOfRoots > 0){
            System.out.print("The number of real roots : " + countOfRoots + "\t");

        } else {
            System.out.println("The equation has no real root!");
        }


        if (countOfRoots == 1){
            System.out.print("\nThe root of equation : " + roots[0]);

        } else if (countOfRoots == 2) {
            System.out.print("\nThe root of equation : " + roots[0] + " and " + roots[1]);
        }

    }



public static int solveQuadratic( double[] eqn, double[] roots){

            double a = eqn[0];
            double b = eqn[1];
            double c = eqn[2];

            double discriminant = (b * b) - (4 * a * c);
            if (discriminant > 0) {
                roots[0] = (-b + Math.sqrt(discriminant)) / (2 * a);
                roots[1] = (-b - Math.sqrt(discriminant)) / (2 * a);
                return 2;

            } else if (discriminant == 0) {
                roots[0] = (-b + Math.sqrt(discriminant)) / (2 * a);
                return 1;

            }

            return 0;
        }

    }


