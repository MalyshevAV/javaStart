import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя первого игрока:");
        Player player1 = new Player(scanner.nextLine());
        System.out.println("Введите имя второго игрока:");
        Player player2 = new Player(scanner.nextLine());
        boolean playOnceAgain = true;
        while (playOnceAgain) {
            int hiddenNumber = new Random().nextInt(100) + 1;
           System.out.println("Компьютер загадал число: " + hiddenNumber);
            boolean winner = false;
            while (!winner) {
                winner = GuessNumber.guessNumber(player1, scanner, hiddenNumber);
                if (!winner) {
                    winner = GuessNumber.guessNumber(player2, scanner, hiddenNumber);
                }
            }
            String answer = "";
            while (!answer.equals("yes") && !answer.equals("no")) {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                answer = scanner.nextLine();
            }
            playOnceAgain = answer.equals("yes");
        }
    }
}

