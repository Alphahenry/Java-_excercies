package circle;


import java.awt.*;

public class Circle {
    //fields

    double radius;

    //constructor
    public Circle(double radius){
        this.radius = radius;

    }

    public double getParameter() {
        return 2 * 3.147 * radius;
    }
    public double getArea(){
        return  3.147 * radius * radius;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }
}
