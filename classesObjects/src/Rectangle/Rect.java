package Rectangle;

public class Rect {
    double length ;
    double width ;


    Rect(){
     length =1;
     width = 1;
    }
    public Rect(double newLength, double newWidth){
        length = newLength;
        width = newWidth;

    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getParameter(){
        return  2 * (length + width);
    }

    public  double getArea(){
        return length * width;
    }

}
