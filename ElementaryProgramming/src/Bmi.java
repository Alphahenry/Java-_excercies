/*
* (Health application: computing BMI) Body Mass Index (BMI) is a measure of
health on weight. It can be calculated by taking your weight in kilograms and
dividing, by the square of your height in meters. Write a program that prompts the
user to enter a weight in pounds and height in inches and displays the BMI. Note
one pound is 0.45359237 kilograms and one inch is 0.0254 meters
*
* */
import java.util.Scanner;
public class Bmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name; ");
        String name = input.next();

        System.out.println("Enter weight in kg: ");
        double weight = input.nextDouble();

        System.out.println("enter your height in metres: ");
        double height = input.nextDouble();

        //bmi

        double bmi = weight / height * height;

        System.out.println("your Bmi is : " + bmi);
    }
}
