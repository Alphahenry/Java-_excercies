//program tp show how linear search algorithm works
public class Linear {
    public static void main(String[] args) {
        // declare the array
        int[] myNumbers = {45,67,89,34,23,45,67,88,99,67,33,24};
        // number being searched
        int target = 88;

        // call the linearsearch mehtod and store value in result
        int result = LinearSearch(myNumbers, target);
        if (result == -1){
            System.out.println("target not found");
        }else
            System.out.println("TArget is at  : " + result);
    }
    //method linearsearch for looping through the array
    public  static int LinearSearch(int[] myNumbers, int target){
        for (int i = 0; i < myNumbers.length; i++){
            if ( myNumbers[i] == target)
                return i;// returns index of the target
        }
        return  -1;//if target is absent
    }
}
