package week_03.live_class;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter three coordinats :");
        int dist1= Math.abs(input.nextInt());
        int dist2= Math.abs(input.nextInt());
        int dist3= Math.abs(input.nextInt());

        int gym= Math.min(dist1,dist2);
        int gym2= Math.min(gym,dist3);
        














    }
}
