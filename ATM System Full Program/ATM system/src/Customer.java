import java.util.*;

public class Customer {
    private String name;
    private String address;
    private String IdNo;
    private ArrayList<Account> accounts = new ArrayList<>();

    Customer(String name, String address, String IdNo) {
        this.name = name;
        this.address = address;
        this.IdNo = IdNo;
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }
}
