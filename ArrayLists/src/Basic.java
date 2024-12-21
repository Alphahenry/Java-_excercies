
//practice on Arraylists
/*
* Create an integer array of size 5.
Assign values to each index.
Print all elements using a for loop.
Find the sum of all elements.
*
*
* */

public class Basic {
    public static void  main (String[] args){
        int [] numbers = new int[5];

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 5;
        numbers[4] = 6;

        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }

}
