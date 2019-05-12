

import java.util.Date;
import java.text.NumberFormat;

public class Deposit {
    private double amount;
    private Date date;
    private String account;
    NumberFormat formatter = NumberFormat.getCurrencyInstance();



    Deposit(double amount, Date date, String account){
        this.amount = amount;
        this.date = date;
        this.account = account;
    }


    public String toString(){
        return "Deposit of: " + formatter.format(amount) + "\tDate:" + date + "\tinto account:"  + account;
    }
}