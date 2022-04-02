
package ca.sheridancollege.project;



public class PrintingStatement {
//  Showing the started message
    public void startingMessage() {
        System.out.println("It's a war of cards!\n" +  "We will play with computer.\n");
      
        System.out.println("Player Name?");
        
    }
//    show the message who will be winner
   public void showWinner(Player player) {
        System.out.printf("The winner is %s!", player.getName());
    }
//   sshowing the round Winner
    public void showRoundWinner(Player player1, Card card1, Player player2, Card card2, String winner) {
        System.out.printf("%-20s %-20s %-20s %-20s %s is winner.\n", card1.toString(), player1.getHand().sizeOfHand(), card2.toString(), player2.getHand().sizeOfHand(), winner);
    }
//     showing the round Header
    public void roundHeader(Player playerOne, Player playerTwo) {
        String header = "#CardsInHand";
        String winner = "Round Winner";
        System.out.printf("%-20s %-20s %-20s %-20s %-20s \n", playerOne.getName(), header, playerTwo.getName(), header, winner);
    }
//    showing the Draw
    public void showDraw() {
        System.out.printf("There ia a draw.");
    }
//    Showing the Round
    public void showRound() {
        System.out.println("WAR Ocurred.");
    }
//    Showing the Started message
    public void startedMessage(Player player) {
        System.out.printf("%s ,let's Play!\n", player.getName());
    }

}
