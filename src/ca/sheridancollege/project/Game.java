/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!--+/*+- 
 */
package ca.sheridancollege.project;


import java.util.List;
import java.util.Scanner;

public class Game {

    
    private Deck deck;
    private static PrintingStatement printUtil = new PrintingStatement();
    
    private Player user;
    private Player computer;
    public void commencingGame() {
        printUtil.startingMessage();


        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        this.user = new Player(name);
        this.computer = new Player("Computer");
        printUtil.startedMessage(user);
        deck = new Deck();
        deck.shufflingDeck();
        user.setHand(new Hand());
        computer.setHand(new Hand());
        dealCards(user.getHand());
        dealCards(computer.getHand());
         printUtil.roundHeader(user, computer);

        int maxRounds = 27;
        Player winner = null;
        while (battle(user, computer, null)) {
            maxRounds--;

          
            if (user.getHand().sizeOfHand() == 0) {

                winner = computer;
                break;
            } else if (computer.getHand().sizeOfHand() == 0) {

                
                winner = user;
                break;
            }

            if (maxRounds < 0) {
                break;
            }
        }

        if (winner != null) {

           
        } else if (user.getHand().sizeOfHand() > computer.getHand().sizeOfHand()) {
            winner = user;
        } else if (computer.getHand().sizeOfHand() > user.getHand().sizeOfHand()) {
            winner = computer;
        } else {

        
            printUtil.showDraw();
            return;
        }
        printUtil.showWinner(winner);
    }
    public void dealCards(Hand hand) {
        for (int i = 0; i < 26; i++) {
            hand.addingcardtoUpper(deck.handlingCard());
        }
    }
    public boolean battle(Player user1, Player user2, Hand set) {
        Card user1FaceUp = user1.getHand().removingCardfromUpper();
        if (user1FaceUp == null) {
            return false;
        }

        Card user2FaceUp = user2.getHand().removingCardfromUpper();
        if (user2FaceUp == null) {
            return false;
        }
        if (set == null) {
            set = new Hand();
        }
        set.addingcardtoUpper(user1FaceUp);
        set.addingcardtoUpper(user2FaceUp);

        int result = user1FaceUp.compareTo(user2FaceUp);
        switch (result) {
            case 0:
                printUtil.showRound();

                
                List<Card> warUserOneset = user1.getHand().fetch(3);
                if (warUserOneset == null) {
                    return false;
                }
                set.addingcardstoUpper(warUserOneset);

                List<Card> warUserTwoSet = user2.getHand().fetch(3);
                if (warUserTwoSet == null) {
                    return false;
                }
                set.addingcardstoUpper(warUserTwoSet);

                return battle(user1, user2, set);


            case 1:

                user1.getHand().mergingHand(set);
                printUtil.showRoundWinner(user1, user1FaceUp, user2, user2FaceUp, user1.getName());
                break;
            case -1:
              
                user2.getHand().mergingHand(set);
                printUtil.showRoundWinner(user1, user1FaceUp, user2, user2FaceUp, user2.getName());
                break;
        }

        return true;
    }
}







