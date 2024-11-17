//totsl sum of numbers between 20 and 30
public class Sum {
    public static void main(String[] args) {
        int sum = 0;
        int i = 20;

        while (i < 30){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
