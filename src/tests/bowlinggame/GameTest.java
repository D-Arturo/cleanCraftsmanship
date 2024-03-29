package tests.bowlinggame;

import main.bowlinggame.Game;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {

    public Game game = new Game();

    @BeforeEach
    public void initEach() {
        Game game = new Game();
    }

    private void rollSame(int pins, int n) {
        for (int i = 1; i <= n; i++) {
            game.roll(pins);
        }
    }

    @Test
    public void ShouldScoreZero_WhenZeroPinsKnocked() {
        rollSame(0, 20);
        assertEquals(0, game.score());
    }

    @Test
    public void ShouldScoreTwenty_WhenAllOnesPinsKnocked() {
        rollSame(1, 20);
        assertEquals(20, game.score());
    }

    @Test
    public void ShouldScoreEighty_WhenAllFoursPinsKnocked() {
        rollSame(4, 20);
        assertEquals(80, game.score());
    }

    @Test
    public void ShouldScoreSixteen_WhenSpareAndThreePinsKnocked() {
        game.roll(5);
        game.roll(5);
        game.roll(3);
        rollSame(0, 17);
        assertEquals(16, game.score());
    }

    @Test
    public void ShouldIdentifyFrame_WhenRollsBelongToDifferentFrames() {
        game.roll(0);
        game.roll(5);
        game.roll(5);
        game.roll(3);
        rollSame(0, 16);
        assertEquals(13, game.score());
    }
}
