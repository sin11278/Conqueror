
package ca.sheridancollege.project;



import java.util.ArrayList;
import java.util.List;

/**
 * An solitary card from a deck of cards. War, in particular, begins with 26 cards.
 */
public class Hand {

    private List<Card> givenCards; //Individual givenCards for each player


    public Hand() {
        this.givenCards = new ArrayList<Card>();
    }

    /**
     * Add a second hand to this one.
     *
     * @param otherHand
     */
    public void mergingHand(Hand otherHand) {
        for (Card c : otherHand.givenCards) {
            this.addingcardtoBelow(c);
        }
    }


    /**
     * Take N givenCards
     *
     * @param numbersofCards
     * @return
     */
    public List<Card> fetch(int numbersofCards) {
        if (numbersofCards > this.sizeOfHand()) {
            return null;
        }

        List<Card> remove = new ArrayList<>();
        for (int i = 0; i < numbersofCards; i++) {
            remove.add(this.givenCards.remove(this.sizeOfHand() - 1));
        }

        return remove;
    }

    /**
     * @param: special single Card object added to end of Array
     */
    public void addingcardtoUpper(Card special) {
        if (special == null) {
            throw new NullPointerException("There cannot be null cards.");
        }
        givenCards.add(special);
    }

    /**
     * adds a number of givenCards to the hand at once
     *
     * @param cds givenCards added to hand as array
     */
    public void addingcardstoUpper(List<Card> cds) {
        this.givenCards.addAll(cds);
    }

    /**
     * @param special A single Card object is added to the Array's beginning.
     */
    public void addingcardtoBelow(Card special) {
        givenCards.add(0, special);
    }

    /**
     * the card is removed from the array's last index
     */
    public Card removingCardfromUpper() {
        if (sizeOfHand() < 1) {
            return null;
        }
        return givenCards.remove(sizeOfHand() - 1);
    }

    /**
     * card is removed from the array's first index
     */
    public Card removingCardFromBelow() {
        if (sizeOfHand() < 1) {
            return null;
        }
        return givenCards.remove(0);
    }

    /**
     * The number of givenCards in the givenCards collection is returned.
     */
    public int sizeOfHand() {
        return givenCards.size();
    }

}






