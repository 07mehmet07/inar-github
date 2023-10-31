package week_09.live_class;

public class CircleTest {
    public static void main(String[] args) {

        Circle circle1 = new Circle();
        System.out.println("the radius of circle1 : " + circle1.radius);
        System.out.println("the area of circle1 : " + circle1.getArea());
        System.out.println("the perimeter of circle1 : " + circle1.getPerimeter());


        Circle circle2 = new Circle(7);
        System.out.println("\nthe radius of circle2 : " + circle2.radius);
        System.out.println("the area of circle2 : " + circle2.getArea());
        System.out.println("the perimeter of circle2 : " + circle2.getPerimeter());

    }
}
