import java.util.Scanner;
 
public class GuessNumberTest {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String answer = "Yes";
        while(!"No".equalsIgnoreCase(answer)) {
            System.out.println("Enter Player 1 name");
            Player pl1 = new Player(sc.next());
            System.out.println("Here is " + pl1.getName());
            System.out.println("Enter Player 2 name");

            Player pl2 = new Player(sc.next());
            System.out.println("Here is " + pl2.getName());

            GuessNumber game = new GuessNumber(pl1, pl2);
            game.start();

            do {
                System.out.println("Do you want to contiune? [Yes/No]");
                answer = sc.next();
            } while (!"Yes".equalsIgnoreCase(answer) && !"No".equalsIgnoreCase(answer));
        }
    }
}