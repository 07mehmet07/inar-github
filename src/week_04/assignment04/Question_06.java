package week_04.assignment04;

public class Question_06 {
    public static void main(String[] args) {

        double angle1 = (int) (Math.random() * 361);
        double angle2 = (int) (Math.random() * 361);
        double angle3 = (int) (Math.random() * 361);

        angle1 = Math.toRadians(angle1);
        angle2 = Math.toRadians(angle2);
        angle3 = Math.toRadians(angle3);

        final int radıus = 40 ;

        double x1= radıus * Math.cos(angle1);
        double x2 = radıus * Math.cos(angle2);
        double x3 = radıus * Math.cos(angle3);

        double y1 = radıus * Math.sin(angle1);
        double y2 = radıus * Math.sin(angle2);
        double y3 = radıus * Math.sin(angle3);

        double side1 = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));
        double side2 = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
        double side3 = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));

        double degree1 = Math.acos((side1 * side1 - side2 * side2 - side3 * side3) / ( -2 * side2 * side3));
        double degree2 = Math.acos((side2 * side2 - side1 * side1 - side3 * side3) / (-2 * side1 * side3));
        double degree3 = Math.acos((side3 * side3 - side2 * side2 - side1 * side1) / (-2 * side1 * side2));
        
        
        degree1 = Math.toDegrees(degree1);
        degree2 = Math.toDegrees(degree2);
        degree3 = Math.toDegrees(degree3);

        System.out.printf("The three angles are %2.2f %2.2f %2.2f" , degree1 , degree2, degree3);





    }
}
