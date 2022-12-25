import java.util.ArrayList;

public class BankComputer {
    private ArrayList<Card> cards;

    public boolean verifyCard(Card card){
        return cards.contains(card);
    }
    
}
