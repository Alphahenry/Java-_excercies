//finding class average using countercontrolled loop
import  java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //initialize total number of students
        int total = 0;
        //intitialize grade conunter starting from first value
        int gradecounter = 1;

        //while loop to ensure grades are 10
        while (gradecounter <= 10) {
            System.out.println("Enter your grade: ");
            int grade = input.nextInt();
            total += grade;
            gradecounter++;
        }

        //average
        int average = total / 10;

        System.out.printf("Total grades is %d\n", total);
        System.out.printf("The avearge of the grades is %d\n", average);
    }
}
