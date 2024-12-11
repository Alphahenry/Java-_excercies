package Excercise;
/*
*
* Write a program that reads 11 integers, compares each
integer with the 11th integer, and displays whether the integers are “greater”,
“smaller”, or “equal” to the 11th integer.
*
* // take input and store in  an array
* //use if statements inside for loop to check if greater, smaller or equal
*
* */

import java.util.Scanner;
public class Occurence {
    public static void main(String[] args) {
        //creating scanner object

        Scanner input = new Scanner(System.in);

        //array to store the integers

        int [] numbers = new int[12];

        for ( int i = 0; i < numbers.length; i++){
            System.out.println("Enter Numbers: ");
            numbers[i] = input.nextInt();
        }

        //display numbers
        for (int number : numbers) {
            System.out.print(number);
        }

        for (int j = 0; j < numbers.length; j++){
            if (numbers[j] > numbers[11]){
                System.out.println("Greater");
            } else if (numbers[j] == numbers[11]) {
                System.out.println("Equal");

            }else
                System.out.println("Smaller");
        }
    }
}
