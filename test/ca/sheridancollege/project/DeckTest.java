
package ca.sheridancollege.project;

import static org.hamcrest.CoreMatchers.not;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Admin
 */
public class DeckTest {
    
    public DeckTest() {
    }
    
     Deck testDeck;

    @Before
    public void setUpBefore() {
        testDeck = new Deck();
    }

    /**
     * Test of shufflingDeck method, of class Deck.
     */
    @Test
    public void testShufflingDeckGood() {
        System.out.println("shufflingDeck");
       Assert.assertEquals(new Deck().getCards(), testDeck.getCards());
    }


    /**
     * Test of getCardsCount method, of class Deck.
     */
    @Test
    public void testGetCardsCountGoodd() {
        int expected = 50;
        testDeck.handlingCard();
        testDeck.handlingCard();
        int actual = testDeck.getCardsCount();
        Assert.assertEquals(expected, actual);
    }
   /**
     * Test of getCardsCount method, of class Deck.
     */
    @Test
    public void testGetCardsCountBad() {
        int expected = 89;
        testDeck.handlingCard();
        testDeck.handlingCard();
        int actual = testDeck.getCardsCount();
        Assert.assertThat(expected, not(actual));
    }
    /**
     * Test of handlingCard method, of class Deck.
     */
    @Test
    public void testHandlingCard() {
        Suit sExpected = Suit.HEARTS;
        Rank rExpected = Rank.ACE;
        Card actual = testDeck.handlingCard();
        Suit sActual = actual.getSuit();
        Rank rActual = actual.getRank();
        Assert.assertEquals(sExpected, sActual);
        Assert.assertEquals(rExpected, rActual);
        System.out.println(testDeck.handlingCard());
    }

    
    
}
