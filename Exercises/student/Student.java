/* cretaing a class student where you can get students name and avaerage score*/
package student;

public class Student {
    //declare instance variables
    private String name;
    private double average;

    //create a constructor

    public  Student(String name, double average){

        this.name = name;

        //validate aveerage is between 0.0 and 100.0 otherwise initialize to 0.0
        if (average > 0.0)
            if (average <= 100)
                this.average = average;
    }

    //setName and getName method for students name
    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //setAverage and getaverage method for students average

    public void setAverage(double average) {
        if (average > 0.0)
            if (average <= 100.0)
                this.average = average;
    }

    public double getAverage() {
        return average;
    }

    //method for getting letter grade
    public String getletterGrade(){
        String gradeLetter = "";
        if (average <= 100)
            gradeLetter = "A";
        else  if (average >= 80)
            gradeLetter = "B";
        else if (average>= 70)
            gradeLetter = "c";
        else if (average >= 60)
            gradeLetter = "D";
        else
            gradeLetter = "F";

        return gradeLetter;
    }



}
