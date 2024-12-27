package Inheritance;

public class Ractangle  extends  GeometricObject{

    //data fields
    private double length;

    private  double width;


    //constructor

    public  Ractangle(){

    }

    //parametrized constructor
    public  Ractangle (double length, double width){
        this.length = length;
        this.width = width;
    }

    public  Ractangle( double length, double width, String color, boolean filled){
        this.length = length;
        this.width = width;
        setColor(color);
        setFilled(filled);


    }
    //setter methods


    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //public void gettter methods
    public double getWidth() {
        return width;
    }

    public double getLength(){
        return length;
    }

    //get area
    public double getArea(){
        return  length * width;
    }


}
