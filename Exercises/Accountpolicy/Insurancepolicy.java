
//program to check fault policy law
package Accountpolicy;

public class Insurancepolicy {
    //initializa variables

    private int accountNumber;
    private  String make_model;
    private String state;

    //create constructor
    public  Insurancepolicy(int accountNumber, String make_model, String state){
        this.accountNumber = accountNumber;
        this.make_model = make_model;
        this.state = state;

    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setMake_model(String make_model) {
        this.make_model = make_model;
    }

    public String getMake_model() {
        return make_model;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }


    //method to check no faultstate law



    public boolean isnoFaultstate(){
        boolean noFaultState;

        switch (getState()){
                case "ny": case "nj": case "WA":
                    noFaultState = true;
                    break;
            default:
                noFaultState = false;


        }
        return noFaultState;
    }
}
