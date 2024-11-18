
//use while loop to add two numbers
import java.util.Scanner;
public class AddNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("enter number1: ");
        int number1 = input.nextInt();

        System.out.println("Enter number2: ");
        int number2 = input.nextInt();



        int answer1 = input.nextInt();

        while (number1 + number2 != answer1) {
            System.out.println("Wrong answer!" + "What is " + number1 + " + " + number2 + "?");
            answer1 = input.nextInt();
        }

        System.out.println("What is " + number1 + " - " +number2 + "?");
        int answer2 = input.nextInt();

        if (number1 < number2){
            int temp = number1;
            number1 = number2;
            number2 = temp;

        }

        while (number1 - number2 != answer2){
            System.out.println("What is " + number1 + " - " +number2 + "?");
            answer2 = input.nextInt();
        }
    }
}
