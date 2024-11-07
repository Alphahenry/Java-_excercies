//get the average of numbers in an array
public class LoopAverage {
    public static void main(String[] args) {
        int [] numbers = {45,67,56,44,35,46,78,75,73,24,33,55,66,88};

        int sum = 0;
        double average;

        //loop to sum the numbers
        for (int number : numbers){
            sum += number;
        }
        int no_of_elements = numbers.length;
        average = ((double)sum / (double)no_of_elements);

        System.out.println("The average is :" + average);
    }
}
