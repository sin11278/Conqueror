
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
     Card aceClubs, aceClub, twoHearts, twoClubs, aceHearts, nullCard;
    @Before
    public void setUp() {
        aceClubs = new Card(ACE, CLUBS);
        aceClub = new Card(ACE, CLUBS);
        twoHearts = new Card(TWO, HEARTS);
        twoClubs = new Card(TWO, CLUBS);
        aceHearts = new Card(ACE, HEARTS);
    }

    /**
     * Test of getSuitGood  method, of class Card.
     */
    @Test
    public void testGetSuitGood() {
        System.out.println("getSuitGood");
        Suit expected = CLUBS;
        Suit actual = aceClubs.getSuit();
        Assert.assertEquals(expected, actual);
    }
    
   /**
     * Test of getSuitBad method, of class Card.
     */
    @Test
    public void testGetSuitBad() {
        System.out.println("getSuitBad");
        Suit expected = HEARTS;
        Suit actual = aceClubs.getSuit();
        Assert.assertThat(expected, not(actual));
    }
    /**
     * Test of getLetterofSuitGood method, of class Card.
     */
    @Test
    public void testGetLetterofSuitGood() {
        System.out.println("getLetterofSuitGood");
        String expected = "C";
        String actual = aceClubs.getLetterofSuit();
        Assert.assertEquals(expected, actual);
    }
    /**
     * Test of getLetterofSuitBad method, of class Card.
     */
    @Test
    public void testGetLetterofSuitBad() {
        System.out.println("getLetterofSuitBad");
        String expected = "H";
        String actual = aceClubs.getLetterofSuit();
        Assert.assertThat(expected, not(actual));
    }

    /**
     * Test of getRankGood method, of class Card.
     */
    @Test
    public void testGetRankGood() {
        System.out.println("getRankGood");
         Rank expected = ACE;
         Rank actual = aceClubs.getRank();
         Assert.assertEquals(expected, actual);
    }
    /**
     * Test of getRankBad method, of class Card.
     */
    @Test
    public void testGetRankBad() {
        System.out.println("getRankBad");
         Rank expected = TWO;
         Rank actual = aceClubs.getRank();
         Assert.assertThat(expected, not(actual));
    }
    /**
     * Test of getrankOfLetterGood method, of class Card.
     */
    @Test
    public void testGetrankOfLetterGood() {
        System.out.println("getrankOfLetterGood");
        String expected = "A";
        String actual = aceClubs.getrankOfLetter();
        Assert.assertEquals(expected, actual);
    }
    /**
     * Test of getrankOfLetterBad method, of class Card.
     */
    @Test
    public void testGetrankOfLetterBad() {
        System.out.println("getrankOfLetterBad");
        String expected = "T";
        String actual = aceClubs.getrankOfLetter();
        Assert.assertThat(expected, not(actual));
    }

    /**
     * Test of getCardPointsGood method, of class Card.
     */
    @Test
    public void testGetCardPointsGood() {
        System.out.println("getCardPointsGood");
        Integer expected = 14;
        Integer actual = aceClubs.getCardPoints();
        Assert.assertEquals(expected, actual);
    }
    /**
     * Test of getCardPointsBad method, of class Card.
     */
    @Test
    public void testGetCardPointsBad() {
        System.out.println("getCardPointsBad");
        Integer expected = 20;
        Integer actual = aceClubs.getCardPoints();
         Assert.assertThat(expected, not(actual));
    }

    /**
     * Test of getCardGood method, of class Card.
     */
    @Test
    public void testGetCardGood() {
        System.out.println("getCardGood");
        String expected = "AC";
        String actual = aceClubs.getCard();
        Assert.assertEquals(expected, actual);
    }
    /**
     * Test of getCardBad method, of class Card.
     */
    @Test
    public void testGetCardBad() {
        System.out.println("getCardBad");
        String expected = "TW";
        String actual = aceClubs.getCard();
        Assert.assertThat(expected, not(actual));
    }

    /**
     * Test of compareToGood method, of class Card.
     */
    @Test
    public void testCompareToGood() {
        System.out.println("compareToGood");
        int expected = 0;
        Card card1 = aceClubs;
        Card card2 = aceClub;
        int actual = card1.compareTo(card2);
        Assert.assertEquals(expected, actual);
    }
    /**
     * Test of compareToBad method, of class Card.
     */
    @Test
    public void testCompareToBad() {
        System.out.println("compareToBad");
        int expected = 1;
        Card card1 = aceClubs;
        Card card2 = aceClub;
        int actual = card1.compareTo(card2);
        Assert.assertThat(expected, not(actual));
    }

    /**
     * Test of findSameSuitGood method, of class Card.
     */
    @Test
    public void testFindSameSuitGood() {
        System.out.println("findSameSuitGood");
        Card card1 = aceClubs;
        Card card2 = aceClub;
        boolean actual = card1.findSameSuit(card2);
        Assert.assertTrue(actual);
    }
    /**
     * Test of findSameSuitBad method, of class Card.
     */
     @Test
    public void testFindSameSuitbad() {
        System.out.println("findSameSuitBad");
        Card card1 = aceClubs;
        Card card2 = aceHearts;
        boolean actual = card1.findSameSuit(card2);
        Assert.assertFalse(actual);
    }
    /**
     * Test of findingSameRankGood method, of class Card.
     */
    @Test
    public void testFindingSameRankGood() {
        System.out.println("findingSameRankGood");
          Card card1 = aceClubs;
        Card card2 = aceClub;
        boolean actual = card1.findingSameRank(card2);
        Assert.assertTrue(actual);
    }

    /**
     * Test of findingSameRankBad method, of class Card.
     */
    @Test
    public void testFindingSameRankBad() {
        System.out.println("findingSameRankBad");
        Card card1 = aceClubs;
        Card card2 = twoClubs;
        boolean actual = card1.findingSameRank(card2);
        Assert.assertFalse(actual);
    }

   
    
}
