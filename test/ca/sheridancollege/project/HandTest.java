
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.CoreMatchers.not;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class HandTest {
    
    public HandTest() {
    }
    Hand handTest, handTest2;
    Card testCard1, testCard2, testCard3, testCard4;

    
    @Before
    public void setUp() {
        handTest = new Hand();
        testCard1 = new Card(Rank.ACE, Suit.SPADES);
        testCard2 = new Card(Rank.KING, Suit.HEARTS);
        testCard3 = new Card(Rank.QUEEN, Suit.DIAMONDS);
        testCard4 = new Card(Rank.JACK, Suit.CLUBS);

        handTest2 = new Hand();
        handTest2.addingcardtoUpper(testCard1);
        handTest2.addingcardtoUpper(testCard2);
        handTest2.addingcardtoUpper(testCard3);
    }
    /**
     * Test of fetch methodGood, of class Hand.
     */
    @Test
    public void testFetchGood() {
        System.out.println("fetchGood");
        List<Card> cards = handTest2.fetch(2);
        Assert.assertEquals(handTest2.sizeOfHand(), 1);
        Assert.assertEquals(cards.get(0), testCard3);
        Assert.assertEquals(cards.get(1), testCard2);
        
    }

    /**
     * Test of addingcardtoUpperGood method, of class Hand.
     */
    @Test
    public void testAddingcardtoUpperGood() {
        System.out.println("addingcardtoUpperGood");
        Card expected = testCard3;
        Card actual = handTest2.removingCardfromUpper();
        Assert.assertEquals(expected, actual);
        
    }
    /**
     * Test of addingcardtoUpperBad method, of class Hand.
     */
    @Test
    public void testAddingcardtoUpperBad() {
        System.out.println("addingcardtoUpperBad");
        Card expected = testCard4;
        Card actual = handTest2.removingCardfromUpper();
        Assert.assertThat(expected, not(actual));
        
    }

    /**
     * Test of addingcardstoUpper method, of class Hand.
     */
    @Test
    public void testAddingcardstoUpper() {
        System.out.println("addingcardstoUpper");
         Card expected = new Card(Rank.SEVEN, Suit.SPADES);
        List<Card> cards = new ArrayList<>(Arrays.asList(
                new Card(Rank.THREE, Suit.DIAMONDS),
                new Card(Rank.TEN, Suit.HEARTS),
                expected
        ));

        handTest2.addingcardstoUpper(cards);
        Assert.assertEquals(handTest2.sizeOfHand(), 6);
        Assert.assertEquals(expected, handTest2.removingCardfromUpper());
       
    }

    /**
     * Test of addingcardtoBelowGood method, of class Hand.
     */
    @Test
    public void testAddingcardtoBelowGood() {
        Card expected = testCard4;
        handTest2.addingcardtoBelow(testCard4);
        Card actual = handTest2.removingCardFromBelow();
        Assert.assertEquals(expected, actual);
        
        
    }
     /**
     * Test of addingcardtoBelowBad method, of class Hand.
     */
    @Test
    public void testAddingcardtoBelowBad() {
        Card expected = testCard1;
        handTest2.addingcardtoBelow(testCard4);
        Card actual = handTest2.removingCardFromBelow();
       Assert.assertThat(expected, not(actual));
        
        
    }

    /**
     * Test of removingCardfromUpperGood method, of class Hand.
     */
    @Test
    public void testRemovingCardfromUpperGood() {
        System.out.println("removingCardfromUpperGood");
        Card expected = testCard3;
        Card actual = handTest2.removingCardfromUpper();
        assertEquals(expected, actual);
       
    }
     
    /**
     * Test of removingCardFromBelowGood method, of class Hand.
     */
    @Test
    public void testRemovingCardFromBelowGood() {
        System.out.println("removingCardFromBelowGood");
        Card expected = testCard1;
        Card actual = handTest2.removingCardFromBelow();
        Assert.assertEquals(expected, actual);
        
    }

    
      
    /**
     * Test of removingCardFromBelowBad method, of class Hand.
     */
    @Test
    public void testRemovingCardFromBelowBad() {
        System.out.println("removingCardFromBelowBad");
        Card expected = testCard4;
        Card actual = handTest2.removingCardFromBelow();
       Assert.assertThat(expected, not(actual));
        
    }
    /**
     * Test of sizeOfHandGood method, of class Hand.
     */
    @Test
    public void testSizeOfHandGood() {
        System.out.println("sizeOfHandGood");
        Hand instance = new Hand();
        int expResult = 0;
        int result = instance.sizeOfHand();
        assertEquals(expResult, result);
        
    }
        /**
     * Test of sizeOfHandBad method, of class Hand.
     */
    @Test
    public void testSizeOfHandBad() {
        System.out.println("sizeOfHandBad");
        Hand instance = new Hand();
        int expResult = 2;
        int result = instance.sizeOfHand();
        Assert.assertThat(expResult, not(result));
     
        
    }
    
}
