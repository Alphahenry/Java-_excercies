/* Write a program that calculates the energy needed
to heat water from an initial temperature to a final temperature. Your program
should prompt the user to enter the amount of water in kilograms and the initial
and final temperatures of the water. The formula to compute the energy is
Q = M * (finalTemperature – initialTemperature) * 4184*/

import java.util.Scanner;
public class Energy {
    public static  void main(String[] args) {

        //create scanner object
        Scanner input = new Scanner(System.in);

        System.out.println("Enter amount of water in kg: ");

        double water_kg = input.nextDouble();

        System.out.print(" Enter Initial temperature of water: ");
        double init_temp = input.nextDouble();

        System.out.print("Enter Final temperature: ");
        double final_temp = input.nextDouble();

        //Q = M * (finalTemperature – initialTemperature) * 4184*

        double Q = water_kg * (final_temp - init_temp) * 4184;

        System.out.println("The needed energy is: " + Q);


    }



}
