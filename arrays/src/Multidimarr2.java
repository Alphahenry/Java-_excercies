public class Multidimarr2 {
    public static void main(String[] args) {
        String [][]  books = {
                {"harry potter", "business", "velma"},
                {"econ", "math", "phys"},
                {"hist", "geo", "fgm"}};



        System.out.println(books.length);

        for (int i = 0; i < books.length; i++){
            System.out.println();
            for (int j = 0; j< books[i].length; j++)
                System.out.print(books[i][j] + " ");
        }
    }
}
