/*solve a linear equation 3.4x + 50.2y = 44.5
2.1x + 0.55y =5.9

x = c1b2 - c2b1/ a1b2 - a2b1
y= a1c2 - a2c1 / a1b2 - a2b1
* */
public class Linear {
    public  static void main(String [] args){
        double a1 = 3.4;
        double a2 = 2.1;

        double b1 = 50.2;
        double b2 = 0.55;

        double c1 = 44.5;
        double c2 = 5.9;

        double x = ((c1 * b2 - c2*b1) / (a1 * b2 - a2 * b1));

        double y = ((a1 * c2  - a2* c2) / (a1 * b2 - a2 * b1));


        System.out.println("The value of x : " + x );
        System.out.println("The value of y is: " + y);


    }
}
