
package ca.sheridancollege.project;

import static org.hamcrest.CoreMatchers.not;
import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;
/**
 *
 * @author Admin
 */
public class SuitTest {
    
    public SuitTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of values method, of class Suit.
     */
    @Test
    public void testValues() {
        Suit[] expected = {Suit.DIAMONDS, Suit.SPADES, Suit.CLUBS, Suit.HEARTS};
        Suit[] actual = Suit.values();
        Assert.assertArrayEquals(expected, actual);
    }
    /**
     * Test of getID method, of class Suit.
     */
    @Test
    public void testGetIDGood() {
        String expected = "C";
        String actual = Suit.CLUBS.getID();
        Assert.assertEquals(expected, actual);
    }
        /**
     * Test of getID method, of class Suit.
     */
    @Test
    public void testGetIDBad() {
        String expected = "H";
        String actual = Suit.CLUBS.getID();
        Assert.assertThat(expected, not(actual));
    }
    /**
     * Test of getNameofSuit method, of class Suit.
     */
    @Test
    public void testGetNameofSuitGood() {
        String expected = "Hearts";
        String actual = Suit.HEARTS.getNameofSuit();
        Assert.assertEquals(expected, actual);
    }
        /**
     * Test of getNameofSuit method, of class Suit.
     */
    @Test
    public void testGetNameofSuitBad() {
        String expected = "clubs";
        String actual = Suit.HEARTS.getNameofSuit();
        Assert.assertThat(expected, not(actual));
    }

    
}
