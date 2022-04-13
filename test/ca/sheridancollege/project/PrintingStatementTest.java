
package ca.sheridancollege.project;

import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Admin
 */
public class PrintingStatementTest {
    
    public PrintingStatementTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of startingMessage method, of class PrintingStatement.
     */
    @Test
    public void testStartingMessage() {
        System.out.println("startingMessage");
        PrintingStatement instance = new PrintingStatement();
        instance.startingMessage();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of showWinner method, of class PrintingStatement.
     */
    @Test
    public void testShowWinner() {
        System.out.println("showWinner");
    
        Player player = new Player("Sidhu");
        PrintingStatement instance = new PrintingStatement();
        instance.showWinner(player);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    

    /**
     * Test of roundHeader method, of class PrintingStatement.
     */
    @Test
    public void testRoundHeader() {
        System.out.println("roundHeader");
        Player playerOne = new Player("playerOne");
        Player playerTwo = new Player("playerTwo");
        PrintingStatement instance = new PrintingStatement();
        instance.roundHeader(playerOne, playerTwo);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of showDraw method, of class PrintingStatement.
     */
    @Test
    public void testShowDraw() {
        System.out.println("showDraw");
        PrintingStatement instance = new PrintingStatement();
        instance.showDraw();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of showRound method, of class PrintingStatement.
     */
    @Test
    public void testShowRound() {
        System.out.println("showRound");
        PrintingStatement instance = new PrintingStatement();
        instance.showRound();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of startedMessage method, of class PrintingStatement.
     */
    @Test
    public void testStartedMessage() {
        System.out.println("startedMessage");
       
        Player player = new Player("Sidhu");
        PrintingStatement instance = new PrintingStatement();
        instance.startedMessage(player);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
