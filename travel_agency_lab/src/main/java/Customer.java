import java.util.HashMap;

public class Customer {

    private String name;
    private double wallet;


    public Customer(String name, double wallet){
        this.name = name;
        this.wallet = wallet;
    }


    //PayMethod

    public double pay(double amount){
        if (amount > wallet) {
            return 0;
        }
        else {
            return wallet -= amount;
        }
    }

    public boolean canAfford(double amount){
        if (amount <= wallet){
            return true;
        }
        else {
            return false;
        }

    }


//Getters and Setters

    public void setName(){
        this.name = name;
    }


    public String getName(){
        return name;
    }

    public void setWallet(){
        this.wallet = wallet;
    }


    public double getWallet(){
        return wallet;
    }



}
