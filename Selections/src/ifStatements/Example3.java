package ifStatements;
//else if statement
//comparing 3 numbers
public class Example3 {
    public static void main(String[] args) {
        int x = 4;
        int y =8;
        int z = 10;


        if (x > y && x > z)
            System.out.println(x);

        else if (y > x && y > z)
            System.out.println(y);

        else
            System.out.println(z);
    }
}
