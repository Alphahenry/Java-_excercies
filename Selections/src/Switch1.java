import java.util.Scanner;

//using switch case
public class Switch1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 4: ");
        int n = input.nextInt();
        switch (n){
            case 1:
                System.out.println("correct");
                break;

            case 2:
                System.out.println("finally");
                break;
            case  3:
                System.out.println("self made billionare");

            default:
                System.out.println("try again");
        }
    }
}
