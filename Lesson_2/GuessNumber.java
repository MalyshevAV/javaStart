import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private Scanner scanner;

    public GuessNumber(Player player1, Player player2, Scanner scanner) {
        this.player1 = player1;
        this.player2 = player2;
        this.scanner = scanner;
    }
    public void run() {
        int hiddenNumber = new Random().nextInt(100) + 1;
        System.out.println("Компьютер загадал число: " + hiddenNumber);
        boolean winner = false;
        while (!winner) {
            winner = guessNumber(player1, scanner, hiddenNumber);
            if (!winner) {
                winner = guessNumber(player2, scanner, hiddenNumber);
            }
        }
    }
    private static boolean guessNumber(Player player, Scanner scanner, int hiddenNumber) {
        System.out.print(player.getName() + ", ваша очередь угадать число: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        if (number > hiddenNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
            return false;
        }
        if (number < hiddenNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер");
            return false;
        }
        System.out.println("Поздравляем, игрок " + player.getName() + ", вы угадали число и победили!");
        return true;
    }
}
