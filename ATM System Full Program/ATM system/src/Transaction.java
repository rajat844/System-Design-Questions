import java.util.ArrayList;
import java.time.LocalDateTime;

public class Transaction {
    private ArrayList<String> details = new ArrayList<>();

    public void addDebit(int amount, int balance) {
        LocalDateTime dateTime = LocalDateTime.now();
        details.add("Debited amount :" + amount + "closing Balance :" + balance + "Time :" + dateTime);
    }

    public void addCredit(int amount, int balance) {
        LocalDateTime dateTime = LocalDateTime.now();
        details.add("Credited amount :" + amount + "closing Balance :" + balance + "Time :" + dateTime);
    }

    public void getDetails() {
        for (int i = 0; i < details.size(); i++) {
            System.out.println(details.get(i));
        }
    }
    public void getLastTransactions(){
        System.out.println(details.get(details.size()));
    }

}
