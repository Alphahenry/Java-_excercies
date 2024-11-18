//program to grade students

import java.util.Arrays;
import  java.util.Scanner;
public class Arrayex2 {
    public static void main(String[] args) {
        //create scanner object

        Scanner input = new Scanner(System.in);
        //input number of students
        System.out.println("Enter number of students: ");
        int n_students = input.nextInt();

        double[] scores = new double[n_students];
        for (double Score : scores) {
            scores = new double[]{input.nextDouble()};
        }
        System.out.println(Arrays.toString(scores));
    }
}
