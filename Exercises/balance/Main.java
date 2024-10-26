package balance;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     //get account holder name for user1
        System.out.println("What is your name?");
        String username1 = input.nextLine();
     //accountholder name for user 2
      System.out.println("what is your name:");
        String username2 = input.nextLine();

        // create object for user1

        Balance UserAccount1 = new Balance(username1,890000);

        // creating object for user2
        Balance Useraccount2 = new Balance(username2, 78000);

        //displaying balance for user
        //initial balance for user1
        System.out.println("initail balance user1: "+ UserAccount1.getBalance());
        System.out.println("Intial balance for user2: " + Useraccount2.getBalance());

        //add deposit for user1
        System.out.println(username1 + "  Enter your deposit:" );
        double deposit = input.nextDouble();
        UserAccount1.add(deposit);

        //add deposit for user2
        System.out.println(username2 +"  Enter your deposit ");
        deposit = input.nextDouble();
        Useraccount2.add(deposit);

        // get new  balance

        System.out.println("name: " + username1 + " final balance is: " + UserAccount1.getBalance() );
        System.out.println("name: " + username1 + " final balance is: " + Useraccount2.getBalance() );
    }
}
