/*
* (Compute the volume of a triangle) Write a program that reads in the length of
sides of an equilateral triangle and computes the area and volume using the fol-
lowing formulas:
area =
root 3/4 * (length of sides) ^2

volume = area * length
*
*
* read in lenth
* compute area
* conpute volume
* compute volume
*
* */

import java.util.Scanner;
public class Volume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length of triangle: ");

        double length = input.nextDouble();

        double area = Math.pow(3, 2) * Math.pow(length, 2);

        double volume = area * length;

        System.out.println(volume);
        System.out.println(area);
    }
}
