import java.util.Scanner;
public class Multi {
    public static void main(String[] args) {
      
        
        Scanner input = new Scanner(System.in);

        //enter an integer between 2 and 10

        System.out.println("Enter an integer between 1 and 10: ");

        int num = input.nextInt();


        for(int i = 0; i < 11; i++){
            int ans = num * i;
            System.out.println(ans);
        }
    }

}
    