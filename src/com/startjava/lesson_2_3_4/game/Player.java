package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player { 

    public static final int MAX_ATTEMPTS = 10;

    private String name;
    private int attempts;
    private int[] history;

    public Player(String name) {
        this.name = name;
        this.attempts = 0;
        this.history = new int[MAX_ATTEMPTS];
    }

    public String getName() {
        return name;
    }

    public int getAttempts() {
        return attempts;
    }

    public String getHistory() {
        int[] partial = Arrays.copyOf(history, attempts);
        StringBuilder s = new StringBuilder();
        for (int number : partial) {
            s.append(number).append(" ");
        }
        return s.toString();
    }

    public boolean nextAttempt() {
        if (attempts < MAX_ATTEMPTS) {
            attempts++;
            return true;
        }
        return false;
    }

    public void clearHistory() {
        Arrays.fill(history, 0, attempts, 0);
        attempts = 0;
    }

    public void saveHistory(int number) {
        history[attempts - 1] = number;
    }
}
