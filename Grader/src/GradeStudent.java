import java.util.Scanner;
public class GradeStudent {
    public static void main(String[] args) {

        //grade calculator


        Scanner input = new Scanner(System.in);
        // no of students
        System.out.println("Enter no of students");
        int num_students = input.nextInt();

        //registration no of students
        String[] reg_no = new String[num_students];

        //name of students
        String[] names = new String[num_students];

        //marks
        double[] marks = new double[num_students];

        //grade
        char[] grade = new char[num_students];

        //enter data for students
        for (int i = 0; i < num_students; i++) {
            System.out.println("Name:  ");
            names[i] = input.next();

            System.out.println("Reg No:  ");
            reg_no[i] = input.next();

            System.out.println("Marks: ");
            marks[i] = input.nextDouble();

            grade[i] = gradeCalc(marks[i]);

        }

        //display results

        System.out.print("..............Student Grade Resuts.................................");
        System.out.print("Name\t.RegNo\t.marks\t. grade\t\n");

        for (int i = 0; i < num_students; i++) {
            System.out.printf("%s\t%s\t\t%f\t\t%c", names[i], reg_no[i], marks[i], grade[i]);
        }


    }
    public static char gradeCalc(double marks){
        if (marks >= 90){
            return 'A';
        } else if (marks >= 80) {
            return  'B';

        } else if (marks >= 70) {
            return 'C';

        } else if (marks >= 60) {
            return  'D';
        }else
            return 'F';
    }


}







