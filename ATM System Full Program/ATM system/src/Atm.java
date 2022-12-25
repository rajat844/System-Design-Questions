import java.util.Scanner;

public class Atm {
    private BankComputer computer;

    public Atm(BankComputer computer) {
        this.computer = computer;
    }

    public void insertCard(Card card) {
        if (computer.verifyCard(card)) {
            int count = 3;
            while (count > 0 && !enterPin(card, count)) {
                count -= 1;
            }
            if (count == 0) {
                System.out.println("Thanks for visiting");
            } else {
                int option = 0;
                if (card.getCardType() == CardType.creditcard) {
                    option = menuCreditCard();

                } else if (card.getCardType() == CardType.debitcard) {
                    option = menuDebitCard();
                }
                switch (option) {
                    case 1:
                        debitMoney(card);
                        break;
                    case 2:
                        viewStatement(card);
                        break;
                    case 3:
                        creditMoney(card);
                        break;
                    default:
                        return;
                }

            }
        }
        System.out.println("Enter the valid Card");
    }

    public boolean enterPin(Card card, int count) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the PIN Number of card, You have " + count + " attempts left");
        int enteredPin = sc.nextInt();
        sc.close();
        return card.verifyPin(enteredPin);
    }

    public int menuCreditCard() {
        System.out.println("1- Debit Money \n2-View Statement \n9-exit");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        sc.close();
        if (option == 1 || option == 2) {
            return option;
        }
        return 0;
    }

    public int menuDebitCard() {
        System.out.println("1- Debit Money \n2-View Statement \n3-Credit Money\n9-exit");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        sc.close();
        if (option == 1 || option == 2 || option == 3) {
            return option;
        }
        return 0;
    }

    public void debitMoney(Card card) {
        Account account = card.getAccount();
        System.out.println("Enter the amount to be Debited");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        account.debitAmount(amount);
        sc.close();
    }

    public void viewStatement(Card card) {
        Account account = card.getAccount();
        account.getTransactions();
    }

    public void creditMoney(Card card) {
        Account account = card.getAccount();
        System.out.println("Enter the amount to be Credited");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        account.creditAmount(amount);
        sc.close();
    }
}
