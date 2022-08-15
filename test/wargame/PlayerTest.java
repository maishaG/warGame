
package wargame;

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
public class PlayerTest {
    
    public PlayerTest() {
    }

    @Test
    public void testSetPlayerID1Good() {
        System.out.println("setPlayerID1");
        int givenID1 = 0;
        Player instance = new Player();
        instance.setPlayerID1(givenID1);
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetPlayerID1Bad() {
        System.out.println("setPlayerID1");
        int givenID1 = 0;
        Player instance = new Player();
        instance.setPlayerID1(givenID1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetPlayerID1Boundary() {
        System.out.println("setPlayerID1");
        int givenID1 = 0;
        Player instance = new Player();
        instance.setPlayerID1(givenID1);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayerID2 method, of class Player.
     */
    @Test
    public void testSetPlayerID2() {
        System.out.println("setPlayerID2");
        int givenID2 = 0;
        Player instance = new Player();
        instance.setPlayerID2(givenID2);
        fail("The test case is a prototype.");
    }

    /**
     * Test of play method, of class Player.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        Player instance = new Player();
        instance.play();
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayer1 method, of class Player.
     */
    @Test
    public void testGetPlayer1() {
        System.out.println("getPlayer1");
        Player instance = new Player();
        String expResult = "";
        String result = instance.getPlayer1();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayer1 method, of class Player.
     */
    @Test
    public void testSetPlayer1() {
        System.out.println("setPlayer1");
        String player1 = "";
        Player instance = new Player();
        instance.setPlayer1(player1);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayer2 method, of class Player.
     */
    @Test
    public void testGetPlayer2() {
        System.out.println("getPlayer2");
        Player instance = new Player();
        String expResult = "";
        String result = instance.getPlayer2();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayer2 method, of class Player.
     */
    @Test
    public void testSetPlayer2() {
        System.out.println("setPlayer2");
        String player2 = "";
        Player instance = new Player();
        instance.setPlayer2(player2);
        fail("The test case is a prototype.");
    }
    
}
