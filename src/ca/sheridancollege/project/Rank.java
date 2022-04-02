package ca.sheridancollege.project;
/**
 * In a regular deck of cards, this is a representation of the 13 potential ranks.
 */
public enum Rank {
    TWO("Two", 2),
    THREE("Three", 3),
    FOUR("Four", 4),
    FIVE("Five", 5),
    SIX("Six", 6),
    SEVEN("Seven", 7),
    EIGHT("Eight", 8),
    NINE("Nine", 9),
    TEN("Ten", 10),
    JACK("Jack", 11),
    QUEEN("Queen", 12),
    KING("King", 13),
    ACE("Ace",14);

    private String nameofRank;
    private int value;

    Rank (String rankName, int pointValue) {
        this.value = pointValue;
        this.nameofRank = rankName;
    }

    /**
     * @return a lengthy hand of rank
     */
    public String getNameofRank() {
        return this.nameofRank;
    }

    /**
     * @return int rank from 2 to 14
     */
    public int getValue() {
        return this.value;
    }

    /**
     * @return shortHand of rank
     */
    @Override
    public String toString() {
        if(this.getValue() > 10){
            return this.getNameofRank().substring(0,1);
        }
        return String.valueOf(this.getValue());
    }

}
