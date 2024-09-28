//program to calculate body mass index
/*
 * BMI Interpretation

BMI < 18.5 Underweight
BMI < 25.0 Normal
BMI  < 30.0 Overweight
BMI > or equal 30 obese

bmi = weight in kg / height in metres * height in metres
 */
import java.util.*;
public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your height in metres: ");
        double height = input.nextDouble();

        System.out.println("Enter your kg: ");
        double kg_weight = input.nextDouble();

        double bmi = kg_weight / (height * height);

        if  (bmi > 30 || bmi == 30){
            System.out.println("you are obese");
        } 
        else if(bmi > 25  || bmi == 25){
            System.out.println("you are overweight");
        }
        else if(bmi > 18.5 || bmi == 18.5 ){
          System.out.println("congratulations you have Normal bmi  ");
        }else {
            System.out.println("underweight");
        }
    }
    
}
