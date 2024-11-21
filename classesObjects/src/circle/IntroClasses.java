package circle;

/*
* calculate the area and parameter of a circle
*
* Datafields(Attributes):
* radius and point
*
* methods
* getArea
* getOarameter
*setRadius
* setCentre
*
* */
import java.util.Scanner;
public class IntroClasses {
    public static void main(String[] args) {

        Circle mycircle1 = new Circle(26);

        System.out.println("The area of the circle is: " + mycircle1.getArea());
        System.out.println("The parameter of the circle is: " + mycircle1.getParameter());

    }
}
