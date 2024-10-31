//program to sum even numbers0 and 100
public class Evensum {
    public static void main(String[] args) {
        int total = 0;

        for (int i = 0;i <= 100; i+= 2 )
            total += i;

        System.out.println("Sum of even numbers is: " + total);
    }
}
