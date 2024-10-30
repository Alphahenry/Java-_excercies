
//program to analyse whether 10 students passed or failed
import  java.util.Scanner;
 public class Analysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //initialize variables
        int passes = 0;
        int failed = 0;
        int studentCounter = 1;

        //loop to ask 10 students

        while (studentCounter <= 10){
            System.out.println("Did you pass or fail?(1==pass and 2 = failed)");
            int result = input.nextInt();
        //if statement to check if its pass or fail
            if (result == 1)
                passes += 1;
            else
                failed += 1;
            studentCounter ++;
        }

        //display no of passes and failed
        System.out.printf("Passes: %d%n  Failed: %d%n", passes,failed);

        //check if teacher qualifies for bonus
        if (passes >= 8){
            System.out.println("Bonus coming through");
        }
        else
            System.out.println("No bonus mister");

    }
}
