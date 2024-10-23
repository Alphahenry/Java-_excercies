import java.util.Scanner;
public class Account_test {
    public static void main(String[] args) {
        // create scanner object
        Scanner input = new Scanner(System.in);
        //create Account object
        Account myAccount = new Account();

        //initial name
        System.out.printf("initial name is %s%n: ", myAccount.getName());
        System.out.println("enter the name: ");
        String theName = input.nextLine();
        myAccount.setName(theName);
        System.out.println();

        System.out.printf("name in object is:", myAccount.getName() );

    }
}
