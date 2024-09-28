
//program to test if a quadratic equation has real roots.
import java.util.*;
public class Roots {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the three numbers: ");
    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();

    // discriminant

    double d = Math.pow(b, 2) - 4 * a * c;
      if (d > 0) {
        double r1 = (-(b) + Math.sqrt(d) ) / 2 * a;
        double r2 = (-b - Math.sqrt(d)) / 2 * a;

        System.out.println("The equation has 2 real roots: "+ r1 + "and " + r2);



      }else if (d ==  0) {
        double r1 = (-(b) + Math.sqrt(d)) / 2 * a;
        System.out.println("The equation has one real root: " + r1);
      }
      else{
        System.out.println("equation has no real roots");
      }
        
    }

    
}
