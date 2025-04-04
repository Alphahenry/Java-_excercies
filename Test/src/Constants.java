//using final to declare a constant

import java.util.Scanner;

public class Constants {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //declaring a constant

        final double PI = 3.14;
        System.out.println("Enter a radius of the circle: ");
        double radius = input.nextDouble();

        double Area = PI * radius * radius;

        System.out.println("The area of the circle is: " + Area);



    }

}
