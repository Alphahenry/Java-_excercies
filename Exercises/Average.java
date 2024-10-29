//finding class average using sentinelcontrolled  loop
import  java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //intialize v
        int total = 0;
        int counter = 0;

        //prompt user to enter grade
        System.out.print("Enter grade or -1 ");
        int grade = input.nextInt();

        while(grade != -1){
            total = total + grade;
            grade++;

            System.out.print("Enter grade or -1 ");
            grade = input.nextInt();

        }





        if (counter != 0){
            //calculate average
            int average = total/ counter;
            //print average
            System.out.println("The avearage is: " + average);
        }
        else
            System.out.println("no grades were entered");
    }
}
