package triangle;
//testing the program
public class Main {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.setSide1(5);
        t1.setSide2(10);
        t1.setSide3(56);
        t1.setColor("red");
        t1.setIsfilled(true);
        System.out.println(t1.getArea());
        System.out.println(t1.toString());


    }

}
