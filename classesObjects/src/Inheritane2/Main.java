package Inheritane2;
//program showing superclass phone and its subclass
public class Main {
    public static void main(String[] args) {
        Smartphone phone1 = new Smartphone();

        phone1.setCore("Snapdragon qualcomm");
        phone1.setBluetooth(true);
        phone1.setScreenSize(14);
        phone1.setBrand("Huawei");
        phone1.setModel("Y7 prime");
        phone1.setMemory(256);
        phone1.setPrice(34_000);
        phone1.displayInfo();
        phone1.specificInfo();
    }
}
