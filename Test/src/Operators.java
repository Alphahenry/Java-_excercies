import  java.util.Scanner;
public class Operators {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int number = value.nextInt();

        System.out.println("Enter second number: ");
        int number2 = value.nextInt();

        int res = number / number2;

        System.out.println("The answer is: " + res);
    }
}
