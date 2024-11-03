//A type of void method.
public class Voidmethod {
    public static void main(String[] args) {
        System.out.println("Your grade is");
        printGrade(78);
    }

    //print grade method
    public  static  void  printGrade(int grade){
        if (grade >= 90)
            System.out.println("A");
        else if (grade >= 80 ) {
            System.out.println("B");
        }
        else if (grade >= 70) {
            System.out.println("C");
        }
        else if (grade >= 60) {
            System.out.println("D");
        }
        else
            System.out.println("F");
    }
}
