package Excercise;

public class Testarray {
    public static void main(String[] args) {
        int x = 1;
        int [] y = new int[10];

        m(x,y);

        System.out.println("int x is: " + x);
        System.out.println("int[0] y is: " + y[0]);
    }
    public  static void  m(int number, int[] numbers){
        number = 1000;
        numbers[0] = 5555;
    }
}
