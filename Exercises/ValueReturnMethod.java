//Temperature converter application to show application of value returning method

import java.util.Scanner;
public class ValueReturnMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the farhenheit temp: ");
        double farhenheit = input.nextDouble();
        System.out.println("The temperature in celcius is: " + convertTOcelcius(farhenheit));
    }
    public static double convertTOcelcius(double farhenheit){
        double celcius = (farhenheit -32) * 5/9;
        return celcius;
    }

}
