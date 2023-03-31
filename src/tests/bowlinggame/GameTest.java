package tests.bowlinggame;

import main.bowlinggame.Game;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {

    @Test
    public void ShouldScoreZero_WhenZeroPinsKnocked() {
        Game game = new Game();
        for (int i = 1; i <= 20; i++) {
            game.roll(0);
        }
        assertEquals(0, game.score());
    }
}
