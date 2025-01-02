package airithmeticException;
//an arithmetic exception error
/*if you enter zero as num2 a arithmetic exception is raised
*
* */
import java.util.Scanner;
public class Quotient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //asking user for input
        try {
            System.out.println("Enter first number: ");
            int num1 = input.nextInt();

            System.out.println("Enter second number: ");
            int num2 = input.nextInt();


            int res = num1 / num2;

            System.out.println("The answer is: " + res);
        }
        catch (ArithmeticException e ){
            System.out.println("Youve entered zero dawg!");
        }

    }
}

