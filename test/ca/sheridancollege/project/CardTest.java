
package ca.sheridancollege.project;

import static ca.sheridancollege.project.Rank.ACE;
import static ca.sheridancollege.project.Rank.TWO;
import static ca.sheridancollege.project.Suit.CLUBS;
import static ca.sheridancollege.project.Suit.HEARTS;
import static org.hamcrest.CoreMatchers.not;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class CardTest {
    
    public CardTest() {
    }
     Card happyPath, dup, lowestVal, difRankSameSuit, sameRankDifSuit, nullCard;
    @Before
    public void setUp() {
        happyPath = new Card(ACE, CLUBS);
        dup = new Card(ACE, CLUBS);
        lowestVal = new Card(TWO, HEARTS);
        difRankSameSuit = new Card(TWO, CLUBS);
        sameRankDifSuit = new Card(ACE, HEARTS);
    }

    /**
     * Test of getSuit method, of class Card.
     */
    @Test
    public void testGetSuit() {
        System.out.println("getSuit");
        Suit expected = CLUBS;
        Suit actual = happyPath.getSuit();
        Assert.assertEquals(expected, actual);
    }
    
   /**
     * Test of getSuit method, of class Card.
     */
    @Test
    public void testGetSuitBad() {
        System.out.println("getSuit");
        Suit expected = HEARTS;
        Suit actual = happyPath.getSuit();
        Assert.assertThat(expected, not(actual));
    }
    /**
     * Test of getLetterofSuit method, of class Card.
     */
    @Test
    public void testGetLetterofSuitGood() {
        System.out.println("getLetterofSuit");
        String expected = "C";
        String actual = happyPath.getLetterofSuit();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetLetterofSuitBad() {
        System.out.println("getLetterofSuit");
        String expected = "H";
        String actual = happyPath.getLetterofSuit();
        Assert.assertThat(expected, not(actual));
    }

    /**
     * Test of getRank method, of class Card.
     */
    @Test
    public void testGetRankGood() {
        System.out.println("getRank");
         Rank expected = ACE;
         Rank actual = happyPath.getRank();
         Assert.assertEquals(expected, actual);
    }
    /**
     * Test of getRank method, of class Card.
     */
    @Test
    public void testGetRankBad() {
        System.out.println("getRank");
         Rank expected = TWO;
         Rank actual = happyPath.getRank();
         Assert.assertThat(expected, not(actual));
    }
    /**
     * Test of getrankOfLetter method, of class Card.
     */
    @Test
    public void testGetrankOfLetterGood() {
        System.out.println("getrankOfLetter");
        String expected = "A";
        String actual = happyPath.getrankOfLetter();
        Assert.assertEquals(expected, actual);
    }
    /**
     * Test of getrankOfLetter method, of class Card.
     */
    @Test
    public void testGetrankOfLetterBad() {
        System.out.println("getrankOfLetter");
        String expected = "T";
        String actual = happyPath.getrankOfLetter();
        Assert.assertThat(expected, not(actual));
    }

    /**
     * Test of getCardPoints method, of class Card.
     */
    @Test
    public void testGetCardPointsGood() {
        System.out.println("getCardPoints");
        Integer expected = 14;
        Integer actual = happyPath.getCardPoints();
        Assert.assertEquals(expected, actual);
    }
    /**
     * Test of getCardPoints method, of class Card.
     */
    @Test
    public void testGetCardPointsBad() {
        System.out.println("getCardPoints");
        Integer expected = 20;
        Integer actual = happyPath.getCardPoints();
         Assert.assertThat(expected, not(actual));
    }

    /**
     * Test of getCard method, of class Card.
     */
    @Test
    public void testGetCardGood() {
        System.out.println("getCard");
        String expected = "AC";
        String actual = happyPath.getCard();
        Assert.assertEquals(expected, actual);
    }
    /**
     * Test of getCard method, of class Card.
     */
    @Test
    public void testGetCardBad() {
        System.out.println("getCard");
        String expected = "TW";
        String actual = happyPath.getCard();
        Assert.assertThat(expected, not(actual));
    }

    /**
     * Test of compareTo method, of class Card.
     */
    @Test
    public void testCompareToGood() {
        System.out.println("compareTo");
        int expected = 0;
        Card card1 = happyPath;
        Card card2 = dup;
        int actual = card1.compareTo(card2);
        Assert.assertEquals(expected, actual);
    }
    /**
     * Test of compareTo method, of class Card.
     */
    @Test
    public void testCompareToBad() {
        System.out.println("compareTo");
        int expected = 1;
        Card card1 = happyPath;
        Card card2 = dup;
        int actual = card1.compareTo(card2);
        Assert.assertThat(expected, not(actual));
    }

    /**
     * Test of findSameSuit method, of class Card.
     */
    @Test
    public void testFindSameSuitGood() {
        System.out.println("findSameSuit");
        Card card1 = happyPath;
        Card card2 = dup;
        boolean actual = card1.findSameSuit(card2);
        Assert.assertTrue(actual);
    }
     @Test
    public void testFindSameSuitbad() {
        Card card1 = happyPath;
        Card card2 = sameRankDifSuit;
        boolean actual = card1.findSameSuit(card2);
        Assert.assertFalse(actual);
    }
    /**
     * Test of findingSameRank method, of class Card.
     */
    @Test
    public void testFindingSameRankGood() {
        System.out.println("findingSameRankGood");
          Card card1 = happyPath;
        Card card2 = dup;
        boolean actual = card1.findingSameRank(card2);
        Assert.assertTrue(actual);
    }

    /**
     * Test of findingSameRank method, of class Card.
     */
    @Test
    public void testFindingSameRankBad() {
        System.out.println("findingSameRankBad");
        Card card1 = happyPath;
        Card card2 = difRankSameSuit;
        boolean actual = card1.findingSameRank(card2);
        Assert.assertFalse(actual);
    }

   
    
}
