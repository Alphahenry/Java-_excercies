/*
*Write a program to reverse an array.
* solution:
*1.initialze the array
* 2.pointer to left side starting at zero
* 3.pointer to right side starting at the right side of the array
*
* while loop to reverse the array with condition left side is less than right
* store the left side in temp array
*
*
* */
public class Reverse {
    public static void main(String[] args) {
   //initialize array
        int[] numbers = {1,2,3,4,5,6,7};

        //pointer variables

        int left = 0;
        int right = numbers.length-1;

        //whileloop to reverse

        while (left < right){
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;

            right--;
            left++;
            
        }
        for (int num : numbers){
            System.out.print(num + " ");
        }


    }
}
