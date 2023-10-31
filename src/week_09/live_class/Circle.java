package week_09.live_class;

public class Circle {

    double radius;


  public  Circle() {
        radius = 1;
    }

  public  Circle(double newRadius) {
        radius = newRadius;
    }


  public   double getArea() {
        return radius * radius * Math.PI;

    }

  public  double getPerimeter() {
        return 2 * radius * Math.PI;
    }

 public  double setRadius (double newRadius){
       return radius = newRadius ;
    }


}
