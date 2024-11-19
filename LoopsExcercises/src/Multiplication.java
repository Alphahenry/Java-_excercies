//while loop demo to create a multiplication table
public class Multiplication {
    public static void main(String[] args) {
        //print between 1 and 9
        System.out.println("Multiplication table ");
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + i);
        }
        System.out.println("\n ----------------------");

        for (int i =0; i <10; i++){
            System.out.print(i + " | ");
            for (int j= 0; j < 10; j++){
                System.out.printf(" %4d", i * j);

            }
            System.out.println();
        }
    }
}
