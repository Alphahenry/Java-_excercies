/*
* (Sum the digits in an integer) Write a method that computes the sum of the digits
in an integer. Use the following method header:
public static int sumDigits(long n)
*
*
* */
import java.util.Scanner;
public class SumInt {
    public static void main(String[] args) {
        long number = 123456;
        int totalSum = sumDigits(number);
        System.out.println(totalSum);
    }

    public  static int sumDigits(long n){
        int sumIntegers = 0;
        while (n != 0){
            sumIntegers += n % 10;
            n /= 10;
        }
        return sumIntegers;

    }
}
