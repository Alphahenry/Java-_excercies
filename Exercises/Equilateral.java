//program to calculate area and volume of an equilateral triangle
/*import scanner
 * take length of sides.
 * claculate area = (Math.squareroot(3) * 4) * math.Pow(sides, 2)
 * calculate volume = area * length
 * output to the screen
 */

import java.util.Scanner;

public class Equilateral{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //take sides of triangle

    System.out.println("Enter length of the triangle: ");
    double length = input.nextDouble();

    double area = ((Math.sqrt(3)/4) * Math.pow(length, 2));
    System.out.println("The area is :" +  area);

    double volume = area * length;

    System.out.println("The volume is: " + volume);
    }
 }