import java.lang.reflect.Array;
import java.util.Arrays;

public class MathArray {
    public static void main(String[] args) {
        int [] numbers = {2,3,5,7,8};
        product(numbers);
    }
    public static void product(int [] numbers){
        int product = 1;
        for (int i = 0; i < numbers.length; i++)
            product *= numbers[i];
        System.out.println(Arrays.toString(numbers));
        System.out.println(product);
    }


}
