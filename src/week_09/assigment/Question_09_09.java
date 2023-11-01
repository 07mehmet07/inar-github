package week_09.assigment;

public class Question_09_09 {
    public static void main(String[] args) {

        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6 , 4);
        RegularPolygon polygon3 = new RegularPolygon(10 , 4 , 5.6 , 7.8);

        System.out.println("First regularPolygon perimeter is:"+polygon1.getPerimeter()+" area is:"+polygon1.getArea());
        System.out.println("Second regularPolygon perimeter is:"+ polygon2.getPerimeter()+" area is:"+ polygon2.getArea());
        System.out.println("Third regularPolygon perimeter is:"+ polygon3.getPerimeter()+" area is:"+ polygon3.getArea());

    }
}
