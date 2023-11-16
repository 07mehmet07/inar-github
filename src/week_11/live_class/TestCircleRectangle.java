package week_11.live_class;

public class TestCircleRectangle {
    public static void main(String[] args) {

        CircleFromSimpleGeometricObject circle = new CircleFromSimpleGeometricObject(1);
        System.out.println("a circle  :" + circle);
        System.out.println(" a color ; " + circle.getColor());
        System.out.println("the radius : " + circle.getRadius());
        System.out.println("the area is :" + circle.getArea());
        System.out.println("the diameter is : " + circle.getDiameter());

        System.out.println("\n-----------------");
RectangleFromSimpleGeometricObject rectangle = new RectangleFromSimpleGeometricObject(2,4);
        System.out.println("\n A rectangle " + rectangle.toString());
        System.out.println("the area is : " + rectangle.getArea());
        System.out.println("the perimeter is " + rectangle.getPerimeter());








    }
}
