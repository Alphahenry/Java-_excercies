import java.util.Scanner;

//program to find the largest between 3 numbers
public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the three Numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        double result = maximum(num1,num2,num3);

        System.out.println("MAximum is : " + result);

    }

    public  static double maximum(double x, double y, double z){
        double max_value = x;

        if (y > x)
            max_value = y;

        if (z > x)
            max_value = z;

        return max_value;

    }

}
