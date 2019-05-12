
import java.util.Scanner;
import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Date;
import java.text.NumberFormat;

public class Customer {


    Scanner input = new Scanner(System.in);
    private int accountNumber;
    private ArrayList<Deposit> deposits;
    private ArrayList<Withdraw> withdraws;
    private double checkBalance;
    private double savingBalance;
    private double savingRate;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;

    NumberFormat formatter = NumberFormat.getCurrencyInstance();

    public ArrayList<Deposit> getDeposits() {
        return deposits;
    }

    public void setDeposits(ArrayList<Deposit> deposits) {
        this.deposits = deposits;
    }

    public double getCheckBalance() {
        return checkBalance;
    }

    public void setCheckBalance(double checkBalance) {
        this.checkBalance = checkBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }


    Customer() {
        this.name = "No name";
        this.accountNumber = 0;
    }


    Customer(String name, int accountNumber, double checkBalance, double savingBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.checkBalance = checkBalance;
        this.savingBalance = savingBalance;


    }

    //Requires:  double amt >= 0, Date, String
    //Modifies: this
    //Effects: adds amt into saving or checking balance and prints out final balance

    public void deposit(double amt, Date date, String account) {

        Deposit first = new Deposit(amt, date, account);

        if (amt < 0) {
            System.out.println("Not a valid deposit");
        }

        if (amt > 0) {

            if (account == "checking" || account == CHECKING) {
                checkBalance = checkBalance + amt;
                System.out.println(first);
                System.out.println("final balance is:" + formatter.format(checkBalance));

            }

            else if (account == "saving" || account == SAVING) {
                savingBalance = savingBalance + amt;
                System.out.println(first);
                System.out.println("final balance is:" + formatter.format(savingBalance));
            }

            else {
                System.out.println("this account does not exist");

            }

        }

    }

     //Requires: double, Date, String
    //Modifies: this
    //Effects: Withdraws amt from checking or saving account balance and prints final balance

    public void withdraw(double amt, Date date, String account) {

        Withdraw num1 = new Withdraw(amt, date, account);


        if (account == "checking" || account == CHECKING) {
            checkBalance = checkBalance - amt;
            System.out.println(num1);
            System.out.println("final balance is:" + formatter.format(checkBalance));
        }

       else if (account == "saving" || account == SAVING) {
            savingBalance = savingBalance - amt;
            System.out.println(num1);
            System.out.println("final balance is:" + formatter.format(savingBalance));
        }

        else if (checkBalance < OVERDRAFT || savingBalance < OVERDRAFT) {
            System.out.println("overdraft!");

        }
        else {
            System.out.println("this account does not exist");

        }

    }


    private boolean checkOverdraft(double amt, String account) {

        if (account == "saving") {
            savingBalance = savingBalance - amt;
            if (savingBalance < OVERDRAFT) {
                return true;
            }

        } else if (account == "checking") {
            checkBalance = checkBalance - amt;
            if (checkBalance < OVERDRAFT) {
                return true;

            }
        }


        return false;
    }


    //do not modify
    public void displayDeposits() {
        for (Deposit d : deposits) {
            System.out.println(d);
        }
    }

    //do not modify
    public void displayWithdraws() {
        for (Withdraw w : withdraws) {
            System.out.println(w);
        }
    }
}


