
public class Maxnumber {
    public static void main(String[] args) {

       int [] numbers = {2,3,4,5,6,7,8,9,12,34,56};
      // int max = 0;
       maxNum(numbers);

    }
    public static void maxNum(int[] numbers){
       int max = 0;
        for (int i = 0; i<numbers.length; i++){
            if (numbers[i] > max)
                max = numbers[i];

        }
        System.out.println(max);

    }

}
