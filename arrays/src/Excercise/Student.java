package Excercise;
/*
* (Assign grades) Write a program that reads student scores, gets the best score, and
then assigns grades based on the following scheme:
Grade is A if score is Ú best -5
Grade is B if score is Ú best -10;
Grade is C if score is Ú best -15;
Grade is D if score is Ú best -20;
Grade is F otherwise.
The program prompts the user to enter the total number of students, and then
prompts the user to enter all of the scores, and concludes by displaying the grades.
*
* -----------------------------------------------------------------------------------
*
*
* */
import java.util.Scanner;
public class Student {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //request no of students
        System.out.println("enter number of students: ");
        int numStudents = input.nextInt();

        // Track HighestScore
        int highestScore = 0;

        //use array to store students grades
        int[] marks = new int[numStudents];
        for (int i = 0; i <numStudents; i++){
            System.out.println("Enter student marks: ");
            marks[i] = input.nextInt();
            if (marks[i] > highestScore){
                highestScore = marks[i];
            }
        }
        /*
        * Grade is A if score is Ú best -5
        Grade is B if score is Ú best -10;
        Grade is C if score is Ú best -15;
        Grade is D if score is Ú best -20;
        Grade is F otherwise.
        *
        * */

        for (int i = 0; i < numStudents;i++ ){
            char grade;
            int mark = marks[i];
            if (mark >= highestScore -5){
                grade = 'A';

            } else if (mark >= highestScore -10) {
                grade = 'B';

            } else if (mark >= highestScore -15) {
                grade = 'c';
            }
            else if (mark >= highestScore - 20) {
                grade = 'D';
            }
            else
                grade = 'F';

            System.out.println("Student " + (i + 1) + " score: " + mark + " - Grade: " + grade);
        }



    }
}
