package triangle;




//subclass triangle
public class Triangle extends GeomObj {
    //datafields for the subclass triangle
   private double side1 = 1.0;
   private double side2 = 1.0;
   private double side3 = 1.0;

   //default constructor
    public Triangle(){

    }

    public  Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    //specific constructor

    public Triangle(double side1, double side2, double side3, String color, boolean isfilled){
        super(color,isfilled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }

    //setter methods


    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2){
        this.side2 = side2;
    }

    public  void  setSide3(double side3){
        this.side3 = side3;
    }


    //getter methods

    public double getSide1(){
        return  side1;
    }

    public  double getSide2(){
        return  side2;
    }

    public  double getSide3(){
        return  side3;
    }
    //return area method

    public double getArea(){
        double base = side1 / 2;
        double area = 0.5 * base * side2;

        return  area;
    }

    @Override
    public String toString() {
        return super.toString();


    }

}
