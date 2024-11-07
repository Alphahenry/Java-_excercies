//write a program to analysze numbers find averge in an array and no of element greater than average
import  java.util.Scanner;
public class AnalyseNum {
    public static void main(String[] args) {
        //creating scanner object
        Scanner input = new Scanner(System.in);

        //create array
        System.out.println("Enter no of elements: ");
        int n = input.nextInt();
        double [] numbers = new double[n];
        double sum = 0;

        //loop over the array and assign values
        System.out.println("Enter values: ");
        for (int i = 0; i< n; i++) {
            numbers[i] = input.nextDouble();
            sum = sum + numbers[i];

        }

        //loop over array and print
        for (int i = 0; i< numbers.length; i++){
            System.out.println(numbers[i]);
        }

//get average
        double average = sum / n;
        int count = 0;

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > average)
                count++;
        }
        System.out.println("The average is " + average);
        System.out.println("The sum of numbers exceeding average is: " + count);
    }
}
