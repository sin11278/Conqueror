
package ca.sheridancollege.project;

import static org.hamcrest.CoreMatchers.not;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Admin
 */
public class RankTest {
    
    public RankTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of values method, of class Rank.
     */
    @Test
    public void testValues() {
                Rank[] expected = {Rank.TWO, Rank.THREE, Rank.FOUR, Rank.FIVE, Rank.SIX, Rank.SEVEN,
                Rank.EIGHT, Rank.NINE, Rank.TEN, Rank.JACK, Rank.QUEEN, Rank.KING, Rank.ACE};
                Rank[] actual = Rank.values();
        Assert.assertArrayEquals(expected, actual);
    }
    /**
     * Test of getNameofRank method, of class Rank.
     */
    @Test
    public void testGetNameofRankGood() {
        System.out.println("getNameofRank");
       String expected = "Two";
        String actual = Rank.TWO.getNameofRank();
        Assert.assertEquals(expected, actual);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    @Test
    public void testGetNameofRankBad() {
        System.out.println("getNameofRank");
        String expected = "Three";
        String actual = Rank.TWO.getNameofRank();
       Assert.assertThat(expected, not(actual));
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getValue method, of class Rank.
     */
    @Test
    public void testGetValueGood() {
        System.out.println("getValue");
         int expected = 2;
        int actual = Rank.TWO.getValue();
        Assert.assertEquals(expected, actual);
        // TODO review the generated test code and remove the default call to fail.
      
    }
        /**
     * Test of getValue method, of class Rank.
     */
    @Test
    public void testGetValueBad() {
        System.out.println("getValue");
         int expected = 3;
        int actual = Rank.TWO.getValue();
       Assert.assertThat(expected, not(actual));
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
    /**
     * Test of toString method, of class Rank.
     */
    @Test
    public void testToStringGood() {
        String expected = "A";
        String actual = Rank.ACE.toString();
        Assert.assertEquals(expected, actual);
        // TODO review the generated test code and remove the default call to fail.
       
    }
     /**
     * Test of toString method, of class Rank.
     */
    @Test
    public void testToStringBad() {
        String expected = "H";
        String actual = Rank.ACE.toString();
         Assert.assertThat(expected, not(actual));
        // TODO review the generated test code and remove the default call to fail.
       
    }

    
}
