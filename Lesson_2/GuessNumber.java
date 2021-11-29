import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private Scanner scanner;
    private int hiddenNumber; 

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.scanner =  new Scanner(System.in);
        this.hiddenNumber = 0;
    }

    public void run() {
        hiddenNumber = new Random().nextInt(100) + 1;
        System.out.println("Компьютер загадал число: " + hiddenNumber);
        while (!guessNumber(player1)) {
            if (!guessNumber(player2)) {    
            }
        }
    }

    private boolean guessNumber(Player player) {
        System.out.print(player.getName() + ", ваша очередь угадать число: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        if (number > hiddenNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else if (number < hiddenNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер");
        } else {
            System.out.println("Поздравляем, игрок " + player.getName() + ", вы угадали число и победили!");
            return true;
        }
        return false;
    }
}