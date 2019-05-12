
import com.sun.tools.javac.comp.Check;
import org.junit.Before;
import org.junit.Test;
import java.text.NumberFormat;
import java.util.Date;
import java.text.NumberFormat;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class BankTest {



    @Before

    public void setUp(){


    }

    @Test

    public void testDeposit(){
        Date date = new Date();
       Customer test1 = new Customer("Kim", 78374924, 50.00, 50.00);
        test1.deposit(123.45, date, "checking");
        assertEquals(173.45, test1.getCheckBalance(), 0.00001);
    }


    @Test

    public void testWithdraw(){
        Date date1 = new Date();
        Customer test2 = new Customer("sara", 543543, 10.00, 20.00);
        test2.withdraw(5.00, date1, "saving");
        assertEquals(15.00, test2.getSavingBalance(), 0.00001);

    }


    @Test

    public void testDepositToString(){
        Date date2 = new Date();
        double amount = 15.00;
        String account = "check";
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        Deposit test = new Deposit(amount, date2, account);
        test.toString();
        String expected = "Deposit of: " + formatter.format(amount) + "\tDate:" + date2 + "\tinto account:"  + account;
        assertEquals(expected, test.toString());
        System.out.println("expected:" + expected + "\nactual:" + test.toString());



    }

    @Test

    public void testWithdrawToString(){
        Date date3 = new Date();
        double amount = 20.00;
        String account = "saving";

        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        Withdraw test = new Withdraw(amount, date3, account);
        test.toString();
        String expected = "Withdraw of:" + formatter.format(amount) + "\tDate:" + date3 + "\tfrom account:"  + account;
        assertEquals(expected, test.toString());
        System.out.println("expected:" + expected + "\nactual:" + test.toString());


    }





}
