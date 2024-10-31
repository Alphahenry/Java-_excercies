package Accountpolicy;

public class Insurancetest {
    public static void main(String[] args) {
        //create object

        Insurancepolicy policy1 = new Insurancepolicy(789766,"mazda csx5", "WA");
        System.out.println("Your policy is:"+ policy1.isnoFaultstate());
    }
}
