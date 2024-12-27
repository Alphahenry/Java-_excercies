package chaining;
//superclass person
public class Person {
    //data fields
    private int age;
    private String name;
    private  String gender;

    //paramaterless arguments

    public  Person(){

    }

    public Person(int age, String name, String gender){
        this.age = age;
        this.name = name;
        this.gender = gender;


    }

    //setters methods


    public void setAge(int age) {
        this.age = age;
    }

    public  void setName(String name){
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    //getter methods


    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }


    public  void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: "+ gender);
    }
}
