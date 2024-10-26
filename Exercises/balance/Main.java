package balance;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     
        System.out.println("What is your name?");
        String username = input.nextLine();

        // create object

        Balance myAccount1 = new Balance(username,890000);

        myAccount1.displayInfo();
    }
}
