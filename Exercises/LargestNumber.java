//program to find the largest number
import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //declare the variables
        int counter = 0;
        int number = 0;
        int largest = Integer.MIN_VALUE;
        while (counter <= 10){
            System.out.println("Enter number: ");
            number = input.nextInt();

            if (number > largest)
                largest = number;
            counter++;

        }
        System.out.println("The largest Number is: " + largest);
    }
}
