package Inheritane2;

public class Smartphone extends Phone{
    private int screenSize;
    private boolean bluetooth;
    private String core;


    public Smartphone(){

    }

    public Smartphone(int screenSize, boolean bluetooth, String core, String brand, String model, int price, int memory){
        this.bluetooth = bluetooth;
        this.core = core;
        this.screenSize = screenSize;

        setBrand(brand);
        setMemory(memory);
        setModel(model);

    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public String getCore() {
        return core;
    }

    public  void  setScreenSize(int screenSize){
        this.screenSize = screenSize;
    }

    public void setCore(String core) {
        this.core = core;
    }

    public  void setBluetooth(boolean bluetooth){
        this.bluetooth = bluetooth;
    }


    //specific information
    public  void specificInfo(){
        System.out.println("Screen size: " + screenSize);
        System.out.println("bluetooth: " + bluetooth);
        System.out.println("core: "+ core);

    }

}
