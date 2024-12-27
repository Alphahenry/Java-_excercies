package chaining;
//project to  show constructor chaining

public class Main {
    public static void main(String[] args) {
        //initialize object employee

        Employee person1 = new Employee();


        person1.setGender("male");
        person1.setIsemployed(true);
        person1.setIspermanent(false);
        person1.setAge(24);
        person1.setName("Wanda wanda");


        person1.printInfo();




    }
}
