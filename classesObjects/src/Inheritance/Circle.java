package Inheritance;

//suclacc/childclass
public class Circle extends GeometricObject {
    //datafield

    private  double radius;

    public Circle(){

    }

    //constructor

    public  Circle(double radius){
      this.radius = radius;
    }

    public  Circle(double radius,String color, boolean filled){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }


    //set radius
    public void setRadius(double radius){
        this.radius= radius;
    }

    //get radius

    public double getRadius(){
        return radius;
    }

    //get area

    public  double getArea(){
        return  Math.PI * radius * radius;
    }


    //print circle inforation

    public void printInfo(){
        System.out.println("Created on : " + getDateCreated() + "Rdius is : " + getRadius()) ;
    }



}
