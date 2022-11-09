public class Coin {
    private Faces coinOption;

    Coin(){
        if (Math.random() > 0.5){
            this.coinOption = Faces.heads;
        }
        else{
            this.coinOption = Faces.tails;
        }
    }

    public Faces getCoinOption(){
        return this.coinOption;
    }
    
}
