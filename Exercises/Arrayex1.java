import java.util.Scanner;

//intialize and print out an array
public class Arrayex1 {
    public static void main(String[] args) {
        //one way of initiliazing
        int[] myList = {1,2,3,4,5};

        //using for loop
        int[] my_num =  new int[12];

        for (int x = 0; x < my_num.length; x++) {
            my_num[x] = x;

            //System.out.println(my_num[x]);
        }

        //using input
        java.util.Scanner input  = new Scanner(System.in);

        double [] my_numbers =  new double[10];

        for (int i = 0; i < my_numbers.length; i++){
            my_numbers[i] = input.nextDouble();
            System.out.println(my_numbers[i]);
        }

        // sum elements in a list
        int total = 0;
        int [] even = new int[10];
        for (int i = 0; i < even.length; i++){
            System.out.println("Enter the even numbers: ");
            even[i] = input.nextInt();
            total += even[i];
            System.out.println("The total is: ");
            System.out.println(total);
        }



    }
}
