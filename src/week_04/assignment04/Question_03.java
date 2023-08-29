package week_04.assignment04;

import java.util.Scanner;

public class Question_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double atlantaX1 = 33.7489954;
        double atlantaY1 = -84.3879824;

        double orlandoX2 = 28.5383355;
        double orlandoY2 = -81.379236499;

        double savannahX3 = 32.0835407;
        double savannahY3 = -81.0998341999998;

        double charlotteX4 = 35.2270869;
        double charlotteY4 = -80.84312669999997;

        atlantaX1 = Math.toRadians(atlantaX1);
        atlantaY1 = Math.toRadians(atlantaY1);

        orlandoX2 = Math.toRadians(orlandoX2);
        orlandoY2 = Math.toRadians(orlandoY2);

        savannahX3 = Math.toRadians(savannahX3);
        savannahY3 = Math.toRadians(savannahY3);

        charlotteX4 = Math.toRadians(charlotteX4);
        charlotteY4 = Math.toRadians(charlotteY4);

        double radius = 6371.01;

        double distanceofAtlantaCharlotte = radius * Math.acos(Math.sin(atlantaX1) * Math.sin(charlotteX4) + Math.cos(atlantaX1) * Math.cos(charlotteX4) * Math.cos(atlantaY1-charlotteY4));
        double distanceOfCharlotteSavannah = radius * Math.acos(Math.sin(charlotteX4) * Math.sin(savannahX3) + Math.cos(charlotteX4) * Math.cos(savannahX3) * Math.cos(charlotteY4 - savannahY3));
        double distanceOfAtlantaOrlando = radius * Math.acos(Math.sin(atlantaX1) * Math.sin(orlandoX2) + Math.cos(atlantaX1) * Math.cos(orlandoX2) * Math.cos(atlantaY1 - orlandoY2));
        double distanceOfOrlandoSavannah =  radius * Math.acos(Math.sin(orlandoX2) * Math.sin(savannahX3) + Math.cos(orlandoX2) * Math.cos(savannahX3) * Math.cos(orlandoY2 - savannahY3));
        double distanceOfAtlantaSavannah = radius * Math.acos(Math.sin(atlantaX1) * Math.sin(savannahX3) + Math.cos(atlantaX1) * Math.cos(savannahX3) * Math.cos(atlantaY1 - savannahY3));

        double s1 = (distanceOfAtlantaSavannah + distanceofAtlantaCharlotte + distanceOfCharlotteSavannah) / 2;
        double area1 = Math.sqrt(s1 * (s1-distanceOfAtlantaSavannah) * (s1 - distanceofAtlantaCharlotte) * (s1 - distanceOfCharlotteSavannah));
        double s2 =  ( distanceOfAtlantaSavannah + distanceOfAtlantaOrlando + distanceOfOrlandoSavannah) / 2;
        double area2 = Math.sqrt(s2 * (s2 - distanceOfAtlantaSavannah) * (s2 - distanceOfAtlantaOrlando) * (s2 - distanceOfOrlandoSavannah));
double totalarea = area1 + area2 ;
        System.out.println("Estimated area enclosed by these four cities: " + totalarea);


    }
}
