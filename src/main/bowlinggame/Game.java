package main.bowlinggame;

public class Game {

    private int total = 0;

    public void roll(int pins) {
        total += pins;
    }

    public int score() {
        return total;
    }
}
