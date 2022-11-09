public class Player {
    private String name;
    private Faces coinOption;

    Player(String name){
        this.name = name;
    }

    public void setCoinOption(Faces opponentFlip){
        if (opponentFlip == Faces.heads){
            this.coinOption = Faces.tails;
            System.out.println(this.name + " chooses " + Faces.tails);
        }
        else{
            this.coinOption = Faces.heads;
            System.out.println(this.name + " chooses " + Faces.heads);
        }
    }

    public Faces getRandomCoinOption(){
        if (Math.random() > 0.5){
            this.coinOption = Faces.heads;
            System.out.println(this.name + " chooses " + Faces.heads);
            return Faces.heads;
            
        }
        else{
            this.coinOption = Faces.tails;
            System.out.println(this.name + " chooses " + Faces.tails);
            return Faces.tails;
        }
    }
    
    public void didPlayerWin(Faces winningFlip){
        if (winningFlip == coinOption){
            System.out.println(this.name + " Wins with flip of " + this.coinOption );
        }
        else{
            System.out.println(this.name + " Looses with flip of " + this.coinOption );
        }
    }
}
