package tv;

public class Main {
    public static void main(String[] args) {
      Tv tv1 = new Tv();
      tv1.setChannel(12);
      tv1.setVolume(7);

        System.out.println("channel is at: " + tv1.channel);
        System.out.println("The volume is at: " + tv1.volume);
    }
}
