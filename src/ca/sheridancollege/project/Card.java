package ca.sheridancollege.project;

/**
 * A single playing card is depicted (from a standard 52 card deck).
 */
public class Card implements Comparable<Card> {

    private final Rank rank;
    private final Suit suit;
    private final String card;


    Card(Rank rank, Suit suit) {
        if (rank == null || suit == null) {
            throw new NullPointerException();
        }
        this.rank = rank;
        this.suit = suit;
        this.card = String.format("%s%s", rank.toString(), suit.getID());
    }

    /**
     *
     * @return Enum 
     */
    public Suit getSuit() {
        return this.suit;
    }

    /**
     *
     * @return Shorthand of an objects suit
     */
    public String getLetterofSuit() {
        return this.suit.getID();
    }

    /**
     *
     * @return Enum
     */
    public Rank getRank() {
        return this.rank;
    }

    /**
     * @return Shorthand of an objects rank
     */
    public String getrankOfLetter() {
        return this.rank.toString();
    }

    /**
     *
     * @return Number indicating how many points the card is worth
     */
    public Integer getCardPoints() {
        return this.rank.getValue();
    }

    /**
     *
     * @return Shorthand of an objects rank and suit
     */
    public String getCard() {
        return this.card;
    }

    /**
     * @param: a card object
     */
    public int compareTo(Card other) {

        return this.getCardPoints().compareTo(other.getCardPoints());
    }

    /**
     * @param: a card object
     */
    public boolean findSameSuit(Card other) {
        return this.suit.equals(other.suit);
    }

    /**
     * @param: a card object
     */
    public boolean findingSameRank(Card other) {
        return this.rank.equals(other.rank);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!Card.class.isAssignableFrom(obj.getClass())) {
            return false;
        }
        final Card other = (Card) obj;
        return this.suit == other.suit && this.rank == other.rank;
    }

    
    @Override
    public String toString() {
        return this.rank.getNameofRank() + " of " + this.suit.getNameofSuit();
    }

}


