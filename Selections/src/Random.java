//program to find the difference between two numbers
/*
* initiliaze two variables and assign value using Math.random
if first value is less than second value swap thm
* ask user for the dufference between the two
* take input user_answer
*  check if answer is correct
*
* */
import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        //creating scanner object
        Scanner input = new Scanner(System.in);

        int num1 = (int) (Math.random() *10);
        int num2 = (int) (Math.random()*10);

        //swap the values if num1 is less than num2

        if (num1<num2){
            int temp = num1;
            num1 = num2;
            num2 = num1;
        }
        int correctAnswer = num1 - num2;
        //ask the user question and take input

        System.out.println("What is  " + num1 + "-" + num2 + "?" );
        int userAnswer = input.nextInt();

        if (userAnswer == correctAnswer){
            System.out.println("You got the right answer");
        }else
            System.out.println("Wrong answer!");

    }
}
