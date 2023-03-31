package main.bowlinggame;

public class Game {

    private int total = 0;
    private final int[] rolls = new int[21];
    private int currentRoll = 0;

    public void roll(int pins) {
        rolls[currentRoll] = pins;
        currentRoll++;
    }

    public int score() {
        for (int i = 0; i < rolls.length; i++) {
            total += rolls[i];
            if (i > 1 && i % 2 == 0) {
                if (rolls[i - 2] + rolls[i - 1] == 10) {
                    total += rolls[i];
                }
            }
        }
        return total;
    }
}
