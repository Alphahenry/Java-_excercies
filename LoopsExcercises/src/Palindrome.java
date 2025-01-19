
//program to check if a word is palindrome
//A palindrome word 

//example of palindrome words is: mom, wow etc

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        //scanner object
        Scanner input = new Scanner(System.in);

        System.out.print("Enter word: ");
        String word = input.nextLine();

        //first character index
        int first_index  = 0;

        //last index

        int last_index = word.length()-1;
try {

    boolean ispalindrome = true;
    while (last_index > first_index) {
    
        if (word.charAt(first_index) != word.charAt(last_index)){
            ispalindrome = false;
            break;

           
        }
        last_index++;
        first_index--;
        if (ispalindrome) {
            System.out.println(word + "is a palindrome");
        }else{
            System.out.println(word+ "is not  a palindrome");
        }
         
    }
    
} catch (StringIndexOutOfBoundsException e) {

    System.out.println(e.getMessage());
}
    
        input.close();
    }
    
}
