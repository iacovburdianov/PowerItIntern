package TaskNo1Encapsulation;

/**
 * Created by Admin on 4/13/2023
 *
 * @author : Admin
 * @date : 4/13/2023
 * @project : Inheritance
 */
public class Main {
    public static void main(String[] args) {
        BankAccount A1 = new BankAccount(123,105);
        BankAccount B2 = new BankAccount(234,95);
        BankAccount C3 = new BankAccount(345,35);

        //get the balance of all accounts and then display it in the console
        System.out.println("The balance of all accounts : \n" +
                "account number: " + A1.getAcctNumber() + " balance: " + A1.getBalance() +
                "\naccount number: " + B2.getAcctNumber() + " balance: " + B2.getBalance() +
                "\naccount number: " + C3.getAcctNumber() + " balance: " + C3.getBalance() );

        //transfer $50 from account A1 to account B2
        A1.transfer(A1,B2,50);

        //transfer $50 from account C3 to accountB2
        C3.transfer(C3,B2,50);
        //transfer $50 from account A1 to account C3
        A1.transfer(A1,C3,50);
        //transfer $50 from account A1 to account B2
        A1.transfer(A1,B2,50);
        System.out.println("The balance of all accounts : \n" +
                "account number: " + A1.getAcctNumber() + " balance: " + A1.getBalance() +
                "\naccount number: " + B2.getAcctNumber() + " balance: " + B2.getBalance() +
                "\naccount number: " + C3.getAcctNumber() + " balance: " + C3.getBalance() );




    }
}
