import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Game Test
 */
public class GameTest {

    @Test
    public void stringWithOneRollGameWithOneFrame() {
        String annotation = "00";
        int [][] expectedFrames = new int [10][2];
        expectedFrames[0][0] = 0;
        expectedFrames[0][1] = 0;
        Game game = new Game(annotation);
        assertArrayEquals("game must have 1 frame with 2 rolls", expectedFrames, game.frames);
    }

    @Test
    public void stringWithOneRollAndPinDownsReturnGameWithOneFrameAndPinByRollDefined()
    {
        String annotation = "01";
        int [][] expectedFrames = new int [10][2];
        expectedFrames[0][0] = 0;
        expectedFrames[0][1] = 1;
        Game game = new Game(annotation);
        assertArrayEquals("game must have 1 frame with 2 roll and 1 pin in last roll", expectedFrames, game.frames);
    }
}