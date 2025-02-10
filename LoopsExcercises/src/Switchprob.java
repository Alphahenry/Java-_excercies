//furnitures and price

import java.util.Scanner;
public class Switchprob {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Enter furniture you need

        System.out.println("Enter the furniture: ");
        String name = input.nextLine();
        switch (name) {
            case "Kitchen Table":
            System.out.println("This is sh 1500 ");
                break;

            case "Study Table":
                System.out.println("This is sh 4500");
                break;

            case "4x6 bed":
                System.out.println("This is sh 5500 ");
                break;      
        
            default: 
            System.out.println("Item not found!");
                break;
        }
        input.close();
    }

}
