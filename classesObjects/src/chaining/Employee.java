package chaining;
//child class
public class Employee extends  Person{
    //data field
    private boolean isemployed;
    private boolean ispermanent;


   public  Employee(){

   }

    public  Employee(boolean isemployed, boolean ispermanent ){
        this.isemployed= isemployed;
        this.ispermanent = ispermanent;


    }


    public  Employee(boolean isemployed, boolean ispermanent, int age, String name, String gender ){

        super(age,name, gender);
        this.isemployed= isemployed;
        this.ispermanent = ispermanent;


    }

    //setter methods


    public void setIsemployed(boolean isemployed){
       this.isemployed = isemployed;
    }

    public  void setIspermanent(boolean ispermanent){
       this.ispermanent = ispermanent;
    }


    //getter methods

    public  boolean isIsemployed(){
       return isemployed;
    }

    public boolean isIspermanent(){
       return ispermanent;
    }

    //display info
    public  void printInfo(){
       super.displayInfo();

        System.out.println("Employed: " + isemployed);
        System.out.println("permanent: " + ispermanent);
    }



}
