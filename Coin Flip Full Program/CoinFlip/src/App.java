import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String res;
        do{
            CoinGame game = new CoinGame("Sam","Harley");
            game.playGame();

            System.out.println("Do you wish to play again?");
            res = sc.nextLine();
        } while(res.startsWith("y") || res.startsWith("Y") );

        sc.close();
    }
}
