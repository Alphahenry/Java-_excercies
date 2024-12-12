//creating a multidimesnsionalarray
public class Intro {
    public static void main(String[] args) {
        //create an array of 5 by 5
        int [][] matrix = new int[2][5];
        matrix[0][0] = 0;
        matrix[0][1] = 1;
        matrix[0][2] = 2;
        matrix[0][3] = 3;
        matrix[0][4] = 4;

        matrix[1][0] =5 ;
        matrix[1][1] = 6;
        matrix[1][2] = 7;
        matrix[1][3] = 8;
        matrix[1][4] = 9;


    // getting length
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        System.out.println(matrix[1].length);


        //print elements

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
        }
    }

}
