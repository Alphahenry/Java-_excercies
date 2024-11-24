package time;

public class Main {
    public static void main(String[] args) {
        Time1 time = new Time1();
        System.out.println();

        time.setTime(5,7,8);
        System.out.println(time.toUniversaltime());
    }
}
