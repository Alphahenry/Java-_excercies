package triangle;

/*
* (The Triangle class) Design a class named Triangle that extends
GeometricObject. The class contains:
■■ Three double data fields named side1, side2, and side3 with default val-
ues 1.0 to denote three sides of a triangle.
■■ A no-arg constructor that creates a default triangle.
■■ A constructor that creates a triangle with the specified side1, side2, and
side3.
■■ The accessor methods for all three data fields.
■■ A method named getArea() that returns the area of this triangle.
■■ A method named getPerimeter() that returns the perimeter of this triangle.
■■ A method named toString() that returns a string description for the triangle.
*
* */

import java.util.Date;

//superclass gemetric object
public class GeomObj {
    //data fields
    private String  color;
    private boolean isfilled;
    private Date dateCreated;

    //default constructor
    public GeomObj(){
     dateCreated = new Date();
    }

    //specific constructor

    public GeomObj(String color, boolean isfilled){
        this.color = color;
        this.isfilled = isfilled;
        this.dateCreated = new Date();

    }

    //setter methods
  public void setColor(String color){
        this.color = color;
  }

  public  void setIsfilled(boolean isfilled){
        this.isfilled = isfilled;
  }

  //getter methods

    public String getColor(){
        return color;
    }


    public boolean getIsfilled(){
        return  isfilled;
    }


    public Date getDateCreated(){
        return dateCreated;
    }


    public String toString() {
        return "color: " + color + "\nIsFilled: " + isfilled + "\ndatecreated: " + dateCreated;
    }
}
