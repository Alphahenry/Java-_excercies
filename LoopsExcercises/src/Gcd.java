
//Write a program that prompts the user to enter two
//positive integers and displays the gcd.

import java.util.Scanner;
public class Gcd {
    public static void main(String[] args) {

   Scanner input = new Scanner(System.in);

   System.out.println("Enter first number: ");
    int n1 = input.nextInt();


    System.out.println("Enter second number: ");
    int n2 = input.nextInt();


    

 //lets get the minimum of the two;

       if(n1 < n2){
           int remainder = n2 % n1;
       }
       else{
           int remainder = n1 % n2;
       }

    
    
 
    }

}
