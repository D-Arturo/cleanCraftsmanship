package main.bowlinggame;

public class Game {

    private int score = 0;
    private final int[] rolls = new int[21];
    private int currentRoll = 0;

    public void roll(int pins) {
        rolls[currentRoll] = pins;
        currentRoll++;
    }

    public int score() {
        int indexFrame = 0;
        for (int frame = 0; frame < 10; frame++) {
            if (isSpare(indexFrame)) {
                score += rolls[indexFrame] + rolls[indexFrame + 1] + rolls[indexFrame + 2];
                indexFrame += 2;
            } else {
                score += rolls[indexFrame] + rolls[indexFrame + 1];
                indexFrame += 2;
            }
        }
        return score;
    }

    private boolean isSpare(int i) {
        return rolls[i] + rolls[i + 1] == 10;
    }
}
