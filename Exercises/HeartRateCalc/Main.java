package HeartRateCalc;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //create scanner object
        Scanner input =new Scanner(System.in);
        //prompt the persons information
        System.out.println("Enter your firstname");
        String firstName = input.next();

        System.out.println("enter your last name: ");
        String lastName =input.next();



        System.out.println("Enter date, month and year of birth:");
        int date = input.nextInt();
        String month = input.next();
        int year = input.nextInt();

        //instantiate an object
        Heartrates myheartrate1 = new Heartrates(firstName,lastName,date,year,month);
        myheartrate1.displayinfo();
        System.out.print("Maximum Heart rate : "+ myheartrate1.heartRate());
        System.out.println("target rate: " + myheartrate1.targetRate());

    }
}
