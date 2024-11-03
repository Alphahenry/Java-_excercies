import java.security.SecureRandom;
public class Random {
    public static void main(String[] args) {
        //create secure object
        SecureRandom randomNumbers = new SecureRandom();

        for (int i =0; i <= 20; i++){
            int face = 1 + randomNumbers.nextInt(6);
            System.out.printf("%d", face);
        }
    }
}
