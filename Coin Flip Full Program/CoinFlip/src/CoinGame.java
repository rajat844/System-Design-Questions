public class CoinGame {
    Player player1;
    Player player2;
    Coin coin = new Coin();

    CoinGame(String player1,String player2){
        this.player1 = new Player(player1);
        this.player2 = new Player(player2);
    }
    public void playGame() {

        if (Math.random() > 0.5) {
            player2.setCoinOption(player1.getRandomCoinOption());

        } else {
            player1.setCoinOption(player2.getRandomCoinOption());
        }

        Faces win = coin.getCoinOption();

        player1.didPlayerWin(win);
        player2.didPlayerWin(win);
    }
}
