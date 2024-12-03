/*program to check if number is divisble by 4 and 5...&&
* by 4 or 5...||
* by 4 or 5 but not both
* */

import java.util.Scanner;
public class Divisible {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = input.nextInt();
        //int num = input.nextInt();

        if (num % 4 == 0 && num % 5 == 0  ){
            System.out.println("number is a multiple of both 4 and 5");
        }
        else if (num % 4 == 0 || num % 5 == 0) {
            System.out.println("number is a multiple of 4 or 5");
        }
        else if (num % 5 == 0 ^ num % 4 == 0 ) {
            System.out.println("divisible by 4 or 5 but not both");
        }
        else
            System.out.println("wrong input!");
    }
}
