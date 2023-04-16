package TaskNo1Encapsulation;

import java.text.NumberFormat;
import java.util.Objects;

/**
 * Created by Admin on 4/13/2023
 *
 * @author : Admin
 * @date : 4/13/2023
 * @project : Inheritance
 */
public class BankAccount {
    private NumberFormat fmt = NumberFormat.getCurrencyInstance();
    private double acctNumber;
    private double balance;

    public BankAccount(double acctNumber, double balance) {
        this.acctNumber = acctNumber;
        this.balance = balance;
    }

    public double getAcctNumber() {
        return acctNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {
        if (amount < 0) {
            System.out.println ();
            System.out.println ("Error: Deposit amount is invalid.");
            System.out.println (acctNumber + " " + fmt.format(amount));
        }
        else
            balance = balance + amount;
        return balance;
    }
    public double withdraw(double amount) {
        if (amount < 0) // withdraw value is negative
        {
            System.out.println ();
            System.out.println ("Error: Withdraw amount is invalid.");
            System.out.println ("Account: " + acctNumber);
            System.out.println ("Requested: " + fmt.format(amount));
        }
        else
        if (amount > balance) // withdraw value exceeds balance
        {
            System.out.println ();
            System.out.println ("Error: Insufficient funds.");
            System.out.println ("Account: " + acctNumber);
            System.out.println ("Requested: " + fmt.format(amount));
            System.out.println ("Available: " + fmt.format(balance));
        }
        else
            balance = balance - amount;
        return balance;
    }
    public void transfer(BankAccount from, BankAccount to, double amount) {
        from.withdraw(amount);
        to.deposit(amount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Double.compare(that.acctNumber, acctNumber) == 0 && Double.compare(that.balance, balance) == 0 && Objects.equals(fmt, that.fmt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fmt, acctNumber, balance);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "acctNumber=" + acctNumber +
                ", balance=" + balance +
                '}';
    }
}
