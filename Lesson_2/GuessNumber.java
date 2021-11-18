
import java.util.Scanner;

public class GuessNumber {
    public static boolean guessNumber(Player player, Scanner scanner, int hiddenNumber) {
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




