package airithmeticException;

import java.util.Scanner;

public class Quotientmethod {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Number1: ");
         int num1 = input.nextInt();
        System.out.println("Number2: ");
         int num2 = input.nextInt();
        try {


            int res = quotient(num1, num2);

            System.out.println("num1 / num2 =  " + res);
        }
        catch (ArithmeticException e){
            System.out.println("You entered zero bruv");
        }
    }

    public  static  int quotient(int num1, int num2){
        return  num1 / num2;
    }
}
