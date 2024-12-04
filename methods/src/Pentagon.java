/*
*(Math: pentagonal numbers) A pentagonal number is defined as n(3n-1)/2 for
n = 1 , 2 , …, and so on. Therefore, the first few numbers are 1, 5, 12, 22,
. . . . Write a method with the following header that returns a pentagonal
n
* public static int getPentagonalNumber(int n)
*
*
* */

public class Pentagon {
    public static void main(String[] args){
        System.out.println(getPentagonalNumber(2));
    }
    public static int getPentagonalNumber(int n){
        return  n*(3*n-1)/2;
    }
}
