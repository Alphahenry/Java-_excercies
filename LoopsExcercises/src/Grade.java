/*
 * 
 * Pass or fail) Write a program that prompts a student to enter a Java score. If the
score is greater or equal to 60, display “you pass the exam”; otherwise, display “you
don’t pass the exam”. Your program ends with input -1.
 * 
 */

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        //get user name  and subject
        

        System.out.println("Enter your grade: ");
        int grade = input.nextInt();
        


        while (grade != -1) {
            if (grade >= 60) {
                System.out.println("Very nice!");
                break;
            }else{
                System.out.println("You have to do better!");
            }
        }
            
        
    }

}
