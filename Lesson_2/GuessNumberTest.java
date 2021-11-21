import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.nextLine());
        GuessNumber game = new GuessNumber(player1, player2, scanner);
        boolean playOnceAgain = true;
        while (playOnceAgain) {
            game.run();
            String answer = "";
            while (!answer.equals("yes") && !answer.equals("no")) {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                answer = scanner.nextLine();
            }
            playOnceAgain = answer.equals("yes");
        }
    }
}