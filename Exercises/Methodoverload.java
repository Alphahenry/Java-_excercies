//program to demonstrate method overloading
import  java.util.Scanner;
public class Methodoverload {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int number1 = input.nextInt();

        System.out.println("Enter Second number: ");
        int number2 = input.nextInt();

        System.out.println("The larger of the two is: " + largest(number1,number2));

        //check for largest in double
        System.out.println("Enter first number: ");
        double number3 = input.nextDouble();

        System.out.println("Enter Second number: ");
        double number4 = input.nextDouble();

        System.out.println("The larger of the two is: " + largest(number3,number4));




    }

    public static int largest(int num1, int num2){
        if (num2 > num1) {
            return num2;
        }else
            return num1;
    }

    public static  double largest(double num1, double num2){
        if (num2 > num1) {
            return num2;
        }else
            return num1;

    }
}
