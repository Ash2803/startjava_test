import java.util.Scanner;
import java.util.Random;

class GuessNumber{
 
    Player[] players = new Player[2];
    int num;
 
    public GuessNumber(Player player1, Player player2){
        Random random = new Random();
        players[0] = player1;
        players[1] = player2;
        num =  random.nextInt(10);
        }

        public void play() {
        int player = 0;
        int scannerNum = -1;
        while (scannerNum != num) {
            player = player == 1 ? 0 : 1;
            System.out.println("Player " + players[player].getName());
            Scanner scanner = new Scanner(System.in);
            scannerNum = scanner.nextInt();
        }
            System.out.println("Угадал Player " + players[player].getName());
        }
}