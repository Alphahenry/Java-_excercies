// program to calcylate average miles

import java.util.Scanner;
public class Mileage {
    public static void main(String[] args) {
        //create a scanner object
        Scanner input = new Scanner(System.in);

        //initialize variables
        int total_miles = 0;
        int total_gallons = 0;
        int tripCounter = 0;

        System.out.println("enter miles .");
        System.out.println("Enter -1 to quit");

        while (true){
            System.out.println("Enter number of miles: ");
            int no_miles = input.nextInt();


            if (no_miles == -1)

                break;


            System.out.println("enter no of gallons");
            int gallons = input.nextInt();

            if (gallons<=0){
                continue;
            }

            total_miles++;
            total_gallons++;
            tripCounter++;

            //calculate average mpg
            double mpg = (double) total_miles/ total_gallons;



        }
        //display mpg
        System.out.println("miles per gallon is " + mpg);
        System.out.println("Total no of miles is" + total_miles);
        System.out.println("Total no of gallons is" + total_gallons);
        System.out.println("Total trips is " + tripCounter);



    }
}
