import java.util.Scanner;

public class Player {
    Scanner scanner = new Scanner(System.in);
    private String name;
    private int num;

    public Player() {
        this.name = scanner.next();
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }
}