//pass array as a method
public class Passarray {
    public static void main(String[] args) {
        int [] even = {2,3,4,6,8};
        change(even);
        for (int i=0; i < even.length; i++ ){
            System.out.println(even[i]);
        }
    }
    public static void change(int[] even){
        even[0] = 10;
        even[1] = 12;
        even[2] = 14;
        even[3] = 16;
        even[4] = 18;
    }

}
