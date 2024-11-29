/*
*(Multiply the digits in an integer) Write a program that reads an integer between
0 and 1000 and multiplies all the digits in the integer
*
* use modulus
*
* */
import  java.util.Scanner;
public class Digits {
    public static void main(String[] args) {

        // create scanner object

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number between 0 and 1000: ");
        int num = input.nextInt();

        int first_num = num % 10;

        int new_num = num / 10;

        int secnd_num = new_num % 10;

        int last_num = new_num / 10;



        int mult_total = first_num * secnd_num * last_num;

        System.out.println("Toatal multiplication is :" + mult_total);
    }
}
