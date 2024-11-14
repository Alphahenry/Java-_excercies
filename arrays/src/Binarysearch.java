//bianry search is an algorithm that works by eliminating least half of the array
public class Binarysearch {
    public static void main(String[] args) {


        int[] myArray = {3, 4, 5, 6, 7, 8, 9, 34, 23, 46, 78, 66};
        int target = 8;

        int result = binarySearch(myArray, target);
        System.out.println("The target  index is : " + result);
    }
    public static int binarySearch(int [] myArray, int target ){
        int low = 0;
        int high = myArray.length - 1;



        while (high >= low){
            int mid = (low + high) / 2;
            if (target < myArray[mid] ){
                high = mid -1;
            }
            else if (target == myArray[mid]) {
                return  mid;

            }else
                return low = mid + 1;
        }
        return -1;
    }
}
