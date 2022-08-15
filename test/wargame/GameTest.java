
package wargame;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author noor-e-maisah ghannoo
 */
public class GameTest {
    
    
    /**
     * Test of play method, of class Game.
     */
    @Test
    public void testPlayGood() {
        System.out.println("playGoodTest");
        Game instance = new Game();
        instance.play();
        fail("The test case is a prototype.");
    }

    @Test
    public void testPlayBad() {
        System.out.println("playBadTest");
        Game instance = new Game();
        instance.play();
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testPlayBoundary() {
        System.out.println("playBoundaryTest");
        Game instance = new Game();
        instance.play();
        fail("The test case is a prototype.");
    }
    
}
