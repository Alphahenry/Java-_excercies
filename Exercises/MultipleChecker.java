//program to check if a number is multiple of another
import java.util.Scanner;
public class MultipleChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int number1  = input.nextInt();

        System.out.println("Enter second number: ");
        int number2 = input.nextInt();

        if (ismultiple(number1,number2)){
            System.out.println( number1 +"is a multiple of " + number2);
        }else
            System.out.println("no multiples");

    }
    public static  boolean ismultiple(int num1, int num2) {
        if (num2 == 0){
            System.out.println("wrong input!");
            return  false;
        }else
            return num1 % num2 == 0;
    }
}
