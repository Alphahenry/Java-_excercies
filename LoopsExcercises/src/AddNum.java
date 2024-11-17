
//use while loop to add two numbers
import java.util.Scanner;
public class AddNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("enter number1: ");
        int number1 = input.nextInt();

        System.out.println("Enter number2: ");
        int number2 = input.nextInt();

        System.out.println("What is " + number1 + " + " +number2 + "?");
        int answer = input.nextInt();

        while (number1 + number2 != answer){
            System.out.println("Wrong answer!" + "What is " + number1 + " + " +number2 + "?");
            answer = input.nextInt();
        }
        System.out.println(answer);

    }
}
