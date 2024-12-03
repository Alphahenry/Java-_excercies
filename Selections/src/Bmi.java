//Application that calculates BMI and checks if person is overweight,obese,normal underweight
/*
* take user name
* input weight
* inputh height
* input inches and feet
* Bmi = weight in kg / height ^2
* bmm< 18.5..underweight
* bmi >= 30 ..obese
* 25 <= bmi < 30 ..overweight
* 18.5<= bmi < 25
* */
import java.util.Scanner;
public class Bmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name: ");
        String name = input.next();

        System.out.println(name + "Enter your weight in kg: ");
        double weight = input.nextDouble();

        System.out.println(name + "Enter you height in feet and inches: ");
        double feet = input.nextDouble();
        double inches = input.nextDouble();

        //convert feet int inches
        double feet_inches = feet * 12;
        double total_inches = inches + feet_inches;

        //convert inches into metres
        double heightMetres = total_inches * 0.0254;

        double bmi = weight / heightMetres * heightMetres;

        if (bmi >= 30){
            System.out.println("You are obese");
        } else if (bmi >= 25) {
            System.out.println("You are Overweight");
        } else if (bmi >= 18.5) {
            System.out.println("You are normal");
        }else
            System.out.println("Underweight");

    }
}
