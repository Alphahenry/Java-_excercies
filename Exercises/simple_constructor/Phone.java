package simple_constructor;

//This creates a class Phone
public class Phone {
    String model;
    double     cost;

    //constructor
    public  Phone(String model, int i){
        this.model = model;
        this.cost = cost;
    }

    public void display(){
        System.out.println("The phone is :" + model);
        System.out.println("Cost is:" + cost);
    }
}
