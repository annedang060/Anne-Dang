

import java.util.Date;
import java.text.NumberFormat;

public class Withdraw {
    private double amount;
    private Date date;
    private String account;
    NumberFormat formatter = NumberFormat.getCurrencyInstance();


    Withdraw(double amount, Date date, String account){
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    public String toString(){

        return "Withdraw of:" + formatter.format(amount) + "\tDate:" + date + "\tfrom account:"  + account;
    }
}