
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
     * Test of getName method, of class Player.
     */
    @Test
    public void testGetNameGood() {
        System.out.println("getName");
        String expected = "Nav";
        String actual = testPlayer.getName();
        Assert.assertEquals(expected, actual);
    }
         /**
     * Test of getName method, of class Player.
     */
    @Test
    public void testGetNameBad() {
        System.out.println("getName");
        String expected = "Dev";
        String actual = testPlayer.getName();
        Assert.assertThat(expected, not(actual));
    }

    /**
     * Test of setName method, of class Player.
     */
    @Test
    public void testSetNameGood() {
        String expected = "Jeet";
        testPlayer.setName("Jeet");
        String actual = testPlayer.getName();
        Assert.assertEquals(expected, actual);
        // TODO review the generated test code and remove the default call to fail.
        
    }

        /**
     * Test of setName method, of class Player.
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
     * Test of getHand method, of class Player.
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
     * Test of getHand method, of class Player.
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
