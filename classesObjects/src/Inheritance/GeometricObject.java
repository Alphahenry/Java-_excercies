package Inheritance;

import java.util.Date;

public class GeometricObject {
    //datafields
    private  String color;
    private  boolean filled;
    private Date dateCreated;

    //constructor

    public  GeometricObject(){

    }
    public  GeometricObject(String color, boolean filled){
        this.filled = filled;
        this.color = color;

        this.dateCreated = new Date();

    }

    //getter methods

    public String getColor() {
        return color;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public boolean isFilled() {
        return filled;
    }

    //setter methods


    public void setColor(String color) {
        this.color = color;
    }


    public void setFilled(boolean filled) {
        this.filled = filled;
    }



    //display information


    public String toString(){
        return "date created: \n" + dateCreated+ "Color: \n" + "Filled" + filled;
    }
}
