package student;

public class Main {
    public static void main(String[] args) {
        //create object

        Student student1 = new Student("Alpha", 77);

        //call methods

        System.out.println("Students name  is: " + student1.getName() + " and grade is: " + student1.getletterGrade());
    }
}
