package week_02.assigment;

import java.util.Scanner;

public class Question_08 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long totalLocalSeconds = System.currentTimeMillis();
        long totalSeconds = totalLocalSeconds / 1000;
        long currentSeconds = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        long currentHours = totalHours % 24;

        System.out.print("Enter the time zone offset to GMT: ");
        long zoneOffSet = input.nextLong();
        System.out.println((currentHours + zoneOffSet) % 24 + ":" + currentMinutes + ":" + currentSeconds);

    }



}
