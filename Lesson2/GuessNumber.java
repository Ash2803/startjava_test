import java.util.Scanner;

public class GuessNumber {

    private Player pl1;
    private Player pl2;
    int gameNum = (int) (Math.random() * 100);

    public GuessNumber(Player pl1,  Player pl2) {
        this.pl1 = pl1;
        this.pl2 = pl2;
    }

    public double gaming() {
        Scanner sc = new Scanner(System.in);
            while ((gameNum != pl1.getNum()) && (gameNum != pl2.getNum())) {
                System.out.println("Player 1 enter the number: ");
                    pl1.setNum(sc.nextInt());
                        if(gameNum > pl1.getNum()) {
                            System.out.println("This number is lower then computer's");
                        } else if(gameNum < pl1.getNum()) {
                            System.out.println("This number is higher then computer's");
                        } else if(gameNum == pl1.getNum()) {
                            System.out.println(pl1.getName() + " win");
                        }
                            System.out.println("Player 2 enter the number: ");
                                pl2.setNum(sc.nextInt());
                                    if((gameNum > pl2.getNum())) {
                                        System.out.println("This number is lower then computer's");
                                    } else if(gameNum < pl2.getNum()) {
                                        System.out.println("This number is higher then computer's");
                                    } else if(gameNum == pl2.getNum()) {
                                        System.out.println(pl2.getName() + " win");
                                    }
                } return 0;
        } 
}

