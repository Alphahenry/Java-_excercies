package bank;


import java.util.Date;
import java.util.Scanner;

public class Account {
    private String accountName;
    private int accountNumber;
    private int balance;
    private Date dateCreated;


    public Account(){

    }


    public Account(String accountName, int accountNumber, int balance){
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.dateCreated = new Date();

    }

    //setters


    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }


    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    //getters

    public Date getDateCreated() {
        return dateCreated;
    }

    public String getAccountName() {
        return accountName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    //deposit amount

    public  void depositAmount(double amount){
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter amount to deposit: ");
        amount = input.nextDouble();


        balance += (int) amount;

    }

    public String toString(){
        String x;
        x = "dateCreated: " + dateCreated + "\naccountname: " + accountName + "\n accountnumber: " + accountNumber + "\n balance : " + balance;

        return x;
    }





}
