package com.startjava.lesson_2_3_4.game;

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
    }

    public void run() {
        player1.clearHistory();
        player2.clearHistory();
        hiddenNumber = new Random().nextInt(100) + 1;

        System.out.println("Компьютер загадал число: " + hiddenNumber);
        System.out.println("У каждого игрока по " + Player.MAX_ATTEMPTS + " попыток");

        while(!guessNumber(player1) && !guessNumber(player2)) {
            System.out.println("Попробуем снова...");
        }

        System.out.println("Игрок " + player1.getName() + " называл числа: " + player1.getHistory());
        System.out.println("Игрок " + player2.getName() + " называл числа: " + player2.getHistory());
    }

    private boolean guessNumber(Player player) {
        if (!player.nextAttempt()) {
            System.out.println("У игрока " + player.getName() + " закончились попытки");
            return true;
        }

        System.out.print(player.getName() + ", ваша очередь угадать число, попытка " + player.getAttempts() + ": ");
        int number = scanner.nextInt();
        scanner.nextLine();

        player.saveHistory(number);

        if (number > hiddenNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else if (number < hiddenNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер");
        } else {
            System.out.println("Игрок " + player.getName() + " угадал число " + number + " c " + player.getAttempts() + " попытки");
            return true;
        }
        return false;
    }
}