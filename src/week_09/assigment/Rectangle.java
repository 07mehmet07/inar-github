package week_09.assigment;

public class Rectangle {

    double height ;
    double width;

    public Rectangle(){

        height = 1;
        width = 1 ;


    }
public Rectangle( double newWidth , double newHeight){
        width = newWidth ;
        height = newHeight ;

}


    public double getArea() {
        return (height * width);
    }


    public double getPerimeter(){
        return (2 * (width + height)) ;
    }
}
