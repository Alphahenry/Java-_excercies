//Display time after input of seconds
import  java.util.Scanner;
public class Time {
    public static void main(String[] args) {
      Scanner sec = new Scanner(System.in);

        System.out.println("Enter number of seconds: ");

        int seconds = sec.nextInt();

        int minutes = seconds / 60;

        int rem_minutes = minutes % 60;

        System.out.println("The time is : " + minutes + "and " + seconds + "seconds");
    }
}
