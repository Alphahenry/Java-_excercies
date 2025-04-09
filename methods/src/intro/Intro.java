//the difference between void  method and a mthod that returns a value
package intro;
import  java.util.Scanner;
public class Intro {

    public static void main(String[] args) {
     // int res =   sum();
        int res2 = sum2();
        System.out.println("rsult is " + res2);
        
    }

    static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 number to calculate avaerage");
        System.out.println("Enter first  number: ");
        int first_number = input.nextInt();

        System.out.println("Enter second number: ");
        int sec_number = input.nextInt();


        int avg = (first_number + sec_number) / 2;


    }


    static  int  sum2(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 number to calculate avaerage");
        System.out.println("Enter first  number: ");
        int first_number = input.nextInt();

        System.out.println("Enter second number: ");
        int sec_number = input.nextInt();


        int avg = (first_number + sec_number) / 2;
        System.out.println("The average is " + avg);
        return  avg;

    }

}
