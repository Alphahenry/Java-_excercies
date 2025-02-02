
//Write a program that prompts the user to enter two
//positive integers and displays the gcd.


/*
 * 1. a and b be two numbers such that a > b.

  2. Divide the larger number a by, the smaller number b
3.  Replace ‘a’ with ‘b’ and ‘b’ with the remainder from step-2
4 . Repeat step-1 and step-2 until the remainder is zero.
Once you get the remainder 0, the divisor will be the GCD of a and b at this stage.
 * 
 * 
 * 
 */

import java.util.Scanner;
public class Gcd {
    public static void main(String[] args) {

   Scanner input = new Scanner(System.in);

   System.out.println("Enter first number: ");
    int n1 = input.nextInt();


    System.out.println("Enter second number: ");
    int n2 = input.nextInt();

    //get the maximum of the two
    int max_value = Math.max(n1, n2);
    int min_value = Math.min(n1, n2);

    System.out.println("The large number is: " + max_value );
    System.out.println("The smaller number is: " + min_value);


    

 //lets get the minimum of the two;

 int remainder;
       
do {
    remainder = max_value % min_value;


    @SuppressWarnings("unused")
     int temp = max_value;
      max_value = min_value;
      min_value = remainder;  

      

    
} while (remainder != 0);
//when remainder is zero max_value is the gcd since its the last number

System.out.println("GSd is :" + max_value);
  
    }

}
