import java.util.*;
public class Divisible {
    public static void main(String[] args) {
     
     
   //write a program to find if a number is divisible by 2 and 3, 2 or 3, 2 or 3 but not both
   Scanner input = new Scanner(System.in);

   System.out.println("Enter number: ");
   int number = input.nextInt();

   if(number % 2 == 0 && number % 3 ==0){
    System.out.println("Number is divisible by 2 and 3");

   }else if (number % 2 == 0 || number % 3 == 0) {
    System.out.println("Number is divisible by either 2 or 3");

   }else if (number % 2 == 0 ^ number % 3 == 0) {
    System.out.println("number is divisible by 2 or 3 but not both");

   }else{
    System.out.print("Invalid input");
   }

    }
}
