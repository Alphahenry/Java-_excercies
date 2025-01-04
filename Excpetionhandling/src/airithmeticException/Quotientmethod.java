package airithmeticException;

import java.util.Scanner;

public class Quotientmethod {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter First Number: ");
         int num1 = input.nextInt();
        System.out.println("Enter Second Number: ");
         int num2 = input.nextInt();
        try {


            int res = quotient(num1, num2);

            System.out.println("num1 / num2 =  " + res);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }

    public  static  int quotient(int num1, int num2){
        if (num2 == 0)
            throw new ArithmeticException("Nani!.You cant divide an integer with zero.Bakayarou!");
        return  num1 / num2;
    }
}
