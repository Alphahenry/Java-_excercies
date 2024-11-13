//printing out a multidimensional array
public class MultidimArray {
    public static void main(String[] args) {

        int[][] num = {{2,4,6}, {3,5,7}};
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++) {
                System.out.print(num[i][j]);
            }
            System.out.println();
        }



    }
}
