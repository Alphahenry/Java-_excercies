//tabular output of N, N *10, N*100, N*1000
public class Tabular {
    public static void main(String[] args) {

        System.out.println("N  | N*10| N*100");
        for(int N = 1; N <= 5; N++) {
            int N_times10 = N * 10;
            int Ntimes10_times10 = N_times10 * 10;

            System.out.printf("%d  | %d  |  %d\n", N, N_times10, Ntimes10_times10);

        }
    }
}
