public class Card {
    private long cardNumber;
    private int pin;
    private CardType  cardType;
    private Account account;

    public boolean verifyPin(int pin){
        return pin == this.pin;
    }
    public CardType getCardType(){
        return cardType;
    }
    public Account getAccount(){
        return this.account;
    }

    
    
}
