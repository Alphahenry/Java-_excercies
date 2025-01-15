package taxes;

import java.util.Scanner;

// program to calculate Tax for single,married filing jointly,married filing separately and head of family

public class Tax {
    public static void main(String[] args) {

        //creating scanner object
        Scanner input = new Scanner(System.in);

        //take inpput from user
        System.out.println("Single : 0");
        System.out.println("Married Filing separately: 1");
        System.out.println("Married filling jointly: 2");
        System.out.println("Head of family: 3");

        System.out.println("Select Tax bracket: ");

    
        int Tax_bracket = input.nextInt();

        System.out.println("Enter your income: ");
        int income = input.nextInt();

        double tax = 0;

        if (Tax_bracket == 0) {
            if (income <= 8350) {
                tax = 8350 * 0.1;
                
            }
            else if (income <= 33950) {
                tax = 8350 * 0.1 + (income - 83950) * 0.15;
            }
            else if (income <= 82250) {
                tax = 8350 * 0.1 + 83950 * 0.15 + (income - 82250) * 0.25;
                
            }
            else{
                tax = 8350 * 0.1 + 83950 * 0.15 + 82250 * 0.25 + (income - 171000) * 0.33;
            }
        }

        else if(Tax_bracket == 1){
            if (income <= 16700) {
                tax = 16700 * 0.1;
                
            }
            else if (income <= 67900) {
                tax = 16700 * 0.1 + (income - 67900) * 0.15;
            }
            else if (income <= 137050) {
                tax = 16700 * 0.1 + 67900 * 0.15 + 137050* 0.25;
                
            }
            else{
                tax = 16700 * 0.1 + 67900 * 0.15 + 137050* 0.25 + (income - 208850) * 0.33;
            }
        }

      System.out.println("Your total tax is : " + tax);
        
    }

}
