/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 * A normal deck of cards' representation of the four suits.
 */
public enum Suit {
    DIAMONDS("Diamonds", "D"),
    SPADES("Spades", "S"),
    CLUBS("Clubs", "C"),
    HEARTS("Hearts", "H");

    private String nameofSuit;
    private String ID;

    Suit(String suitName, String symbol){
        this.nameofSuit = suitName;
        this.ID = symbol;
    }

    /**
     * @return ID
     */
    public String getID(){
        return this.ID;
    }

    /**
     * @return name of suit
     */
    public String getNameofSuit() {
        return this.nameofSuit;
    }

    /**
     * @return ID with String
     */
    @Override
    public String toString() {
        return this.getID();
    }

}



