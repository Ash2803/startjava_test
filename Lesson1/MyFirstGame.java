public class MyFirstGame {
    public static void main(String[] args) {
        
        int compNum = (int) (Math.random() * 100);
        int playerNum = (int) (Math.random() * 100);
        while(compNum != playerNum) {
          
        if(compNum > playerNum) {
            playerNum++;
            System.out.println("Данное число меньше того, что загадал компьютер");
        } else if(compNum < playerNum) {
            playerNum--;
            System.out.println("Данное число больше того, что загадал компьютер");
            } 
        }

        if(compNum == playerNum) {
            System.out.println("Поздравляю, число угадано!");
            System.out.print(playerNum);
        }
    }
}
