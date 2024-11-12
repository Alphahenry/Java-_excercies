
import java.util.Arrays;
import  java.util.Scanner;
public class Inputarrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //array that user inputs
        System.out.println("Enter number of integers: ");
        int n = input.nextInt();
        int [] numbers = new int[n];

        //loop to insert numbers
        System.out.println("enter the numbers: ");
        for (int i = 0; i< numbers.length; i++ ){
            numbers[i] = input.nextInt();
        }

      printArray(numbers);
    }
    public static void printArray(int[] numbers){
        System.out.println("The elements are: ");
        System.out.println(Arrays.toString(numbers));

    }
}
