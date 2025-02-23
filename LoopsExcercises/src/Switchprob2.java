import java.util.Scanner;

public class Switchprob2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter type of pet: ");
        String animal = input.nextLine();

        switch (animal) {
            case "cat" -> System.out.println("Pretty");
            case "dog" -> System.out.println("Loyal");
            case "horse" -> System.out.println("HP");
            case "donkey" -> System.out.println("Workaholic");
            default -> System.out.println("Try again!")

        }
    }

} 
