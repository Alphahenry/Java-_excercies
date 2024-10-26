package balance;

public class Balance {
    //declare instance variables
    private String name;
    private double balance;


    // A constructor to initialize the instance variables
    public Balance(String name, double balance){
        this.name = name;
        

        if (balance > 0.0) {
            this.balance = balance;
        }

    }

    // a method to deposit money

    public void  add(double deposit){
        balance = balance + deposit;
    }

    //method that returns balance
    public double getBalance(){
        return balance;
    }

    // method that sets name

    public void setName(String name){
        this.name = name;
    }

    // return name

    public String getName(){
        return name;
    }



}
