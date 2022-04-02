
package ca.sheridancollege.project;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Representative of Deck of cards. 
 */
public class Deck {

    private final List<Card> cards = new ArrayList<Card>();

    Deck() {
        createDeck();
    }

    private void createDeck() {
        for (Suit s : Suit.values()) {
            for (Rank r : Rank.values()) {
                cards.add(new Card(r, s));
            }
        }
    }

    /**
     * Shuffles the deck so that the locations of the cards are random.
     */
    public void shufflingDeck() {
        Collections.shuffle(this.cards);
    }

    /**
     * @return List of type Card
     */
    public List<Card> getCards() {
        return this.cards;
    }

    /**
     * @return number of cards left in the deck
     */
    public int getCardsCount() {
        return this.cards.size();
    }

    public Card handlingCard() {
       
      return this.cards.remove(this.cards.size() - 1);
    }

    /**
     * @param special the card to be added to the bottom of the deck,
     */
    public void addCard(Card special) {
        this.cards.add(0, special);
    }
    @Override
    public String toString() {
        return this.cards.toString();
    }
}


