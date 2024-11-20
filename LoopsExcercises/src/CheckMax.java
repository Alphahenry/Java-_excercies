//program to check if num is max
/*
* get user input
* assign input to variabkles
* use if statement to check larger num
*
* */
import java.util.Scanner;
public class CheckMax {
    public static void main(String[] args) {
        //create scanner object

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter second number: ");

        int num2 = input.nextInt();

        if (num1 > num2){
            System.out.println(num1 + "is the larger number");
        }else
            System.out.println(num2 +" is the larger number");
    }
}
