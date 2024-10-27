//Target heart rate  and maximum heart rate calculator
package HeartRateCalc;

public class Heartrates {
    private String firstName;
    private String lastName;
    private  int date_of_birth;
    private  String month_of_birth;
    private  int year_of_birth;

    public  Heartrates(String firstName, String lastName, int date_of_birth, int year_of_birth, String month_of_birth) {
        this.date_of_birth = date_of_birth;
        this.month_of_birth = month_of_birth;
        this.year_of_birth = year_of_birth;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    //providing setName and getName for attributes

    public void  setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setDate_of_birth(int date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public int getDate_of_birth() {
        return date_of_birth;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }
    public  void setYear_of_birth(int year_of_birth){
        this.year_of_birth = year_of_birth;
    }

    public int getYear_of_birth() {
        return year_of_birth;
    }

    public void setMonth_of_birth(String month_of_birth) {
        this.month_of_birth = month_of_birth;
    }

    public String getMonth_of_birth() {
        return month_of_birth;
    }

    public  int ageCalc(){
        int age = 2024 - year_of_birth;
        return  age;
    }

    public  double heartRate(){
        double max_heart_rate;
        max_heart_rate = 220- year_of_birth;
        return  max_heart_rate;
    }

    public  double targetRate(){
        double target_heartRate = 0.5 * heartRate();
        return target_heartRate;
    }

    //method to display information
    public  void displayinfo(){
      System.out.println("Name: " + firstName+ "" + lastName + "\n date of birth: " + date_of_birth +
      "\n month born: " + month_of_birth + "\n year born: " + year_of_birth);

    }



}
