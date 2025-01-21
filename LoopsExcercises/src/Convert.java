/*convert from celcius to farhenheit and print a table
 * print a table
 * celcius is from 0 to 100
 */

import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        //scanner object
        Scanner input = new Scanner(System.in);
       int celcius = 0;
    //    double farhenheit = 0;


     System.out.println("Celcius   Farheinheit");
        while (celcius < 101) {
          double  farhenheit = (int) (celcius * (9/5) +32);
            
            System.out.printf("%d             %4.2f%n", celcius,farhenheit);
            celcius++;
        }
      


    }

}
