//getting size of an array using for each
public class Countsize {
    public static void main(String[] args) {

        int[] numbers = {3,4,5,6,823,45,66,77};
        int size= 0;

        for(int num : numbers){
            size ++;
        }
        System.out.println("Size of the array is: " + size);
    }
}
