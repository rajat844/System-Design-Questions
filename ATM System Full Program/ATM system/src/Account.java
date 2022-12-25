import java.util.Random;
import java.util.*;

public class Account {
    private Customer customer;
    private long accountNo;
    private ArrayList<Card> cards;
    private int balance;
    private Transaction transactions;

    public Account(Customer customer) {
        Random rand = new Random();
        this.customer = customer;
        this.accountNo = rand.nextInt(1000000, 9999999);
    }

    public void getTransactions() {
        transactions.getDetails();
    }

    public void creditAmount(int amount) {
        transactions.addCredit(amount, this.balance + amount);
        this.balance += amount;
        transactions.getLastTransactions();
    }

    public void debitAmount(int amount) {
        if (this.balance > amount) {
            transactions.addDebit(amount, this.balance - amount);
            this.balance -= amount;
            transactions.getLastTransactions();
        } else {
            System.out.println("Insufficient Funds");
        }
    }

}
