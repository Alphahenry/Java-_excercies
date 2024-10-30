//Apllication to calculate   credit limit for customers in a departmental store
import java.util.Scanner;
public class Credit {
    public static void main(String[] args) {
        //create scanner object

        Scanner input = new Scanner(System.in);

        //Enter the details of customers
        System.out.println("Enter account number: ");
        int account_number = input.nextInt();

        System.out.println("enter begining balance: ");
        int beg_bal = input.nextInt();

        System.out.println("Enter items charged by cust this month: ");
        int total_items_charged = input.nextInt();

        System.out.println("Total amount of credits applied to cust account this month: ");
        int creditAmount = input.nextInt();

        System.out.println("enter credit Limit: ");
        int credit_limit = input.nextInt();


        int new_bal = beg_bal + (total_items_charged - creditAmount);
        System.out.println("New balance is " + new_bal );

        if (new_bal > credit_limit)
            System.out.println("Credit limit exceeded!");


    }
}
