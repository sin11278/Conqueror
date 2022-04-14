
package ca.sheridancollege.project;

import org.junit.Assert;
import static org.hamcrest.CoreMatchers.not;
import org.junit.Before;
import org.junit.Test;
/**
 *
 * @author Admin
 */
public class PlayerTest {
    
    public PlayerTest() {
    }
    private Player testPlayer;
    private Player testPlayer1;
    @Before
    public void setUp() {
        testPlayer = new Player("Nav");
        testPlayer1 = new Player("Veer");
    }

    /**
     * Test of getNameGood method, of class Player.
     */
    @Test
    public void testGetNameGood() {
        System.out.println("getNameGood");
        String expected = "Nav";
        String actual = testPlayer.getName();
        Assert.assertEquals(expected, actual);
    }
         /**
     * Test of getNameBad method, of class Player.
     */
    @Test
    public void testGetNameBad() {
        System.out.println("getNameBad");
        String expected = "Dev";
        String actual = testPlayer.getName();
        Assert.assertThat(expected, not(actual));
    }

    /**
     * Test of setNameGood method, of class Player.
     */
    @Test
    public void testSetNameGood() {
        String expected = "JeetGood";
        testPlayer.setName("JeetGood");
        String actual = testPlayer.getName();
        Assert.assertEquals(expected, actual);
        // TODO review the generated test code and remove the default call to fail.
        
    }

        /**
     * Test of setNameBad method, of class Player.
     */
    @Test
    public void testSetNameBad() {
        String expected = "Par";
        testPlayer.setName("Jeet");
        String actual = testPlayer.getName();
       Assert.assertThat(expected, not(actual));
        // TODO review the generated test code and remove the default call to fail.
        
    }
    /**
     * Test of getHandGood method, of class Player.
     */
    @Test
    public void testSetHandGood() {
        Hand expected = new Hand();
        testPlayer.setHand(expected);
        Hand actual = testPlayer.getHand();
        Assert.assertEquals(expected, actual);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    /**
     * Test of getHandBad method, of class Player.
     */
    @Test
    public void testSetHandBad() {
        Hand expected = new Hand();
        testPlayer1.setHand(expected);
        Hand actual = testPlayer.getHand();
         Assert.assertThat(expected, not(actual));
        // TODO review the generated test code and remove the default call to fail.
       
    }

    
    
}
