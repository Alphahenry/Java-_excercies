package Inheritane2;
//Superclass phone

public class Phone {
    // data field

    private String brand;
    private String model;
    private  int price;
    private int memory;

    //default construcor
    public  Phone(){

    }

    //specific constructor

    public Phone(String brand, String model, int price, int memory ){
        this.brand = brand;
        this.memory = memory;
        this.model = model;
        this.price = price;
        this.memory = memory;

    }

    //setters methods


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }


    public void setPrice(int price) {
        this.price = price;
    }



    //getter methods


    public int getMemory() {
        return memory;
    }

    public int getPrice() {
        return price;
    }

    public  String getBrand(){
        return brand;
    }

    public String getModel() {
        return model;
    }


    public  void displayInfo(){
        System.out.println( "General information:");
        System.out.println("Brand: " + brand);
        System.out.println("model: " + model);
        System.out.println("price: " + price);
        System.out.println("Memory: " + memory);
    }
}


