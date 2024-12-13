package Rectangle;

public class Main {
    public static void main(String[] args) {
        //create an object
        Rect r1 = new Rect();
        r1.setLength(4);
        r1.setWidth(7);

        System.out.println("The area is : " + r1.getArea());
        System.out.println("The parameter is : " + r1.getParameter());
    }
}
