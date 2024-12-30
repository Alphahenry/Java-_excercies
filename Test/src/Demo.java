//program to print 2d array
public class Demo {
    public static void main(String[] args) {

        int [][] numbers = {{1,2}, {3,4}};

        for (int[] row: numbers){
            for (int i: row ){
                System.out.println(i);
            }
        }

    }
}
