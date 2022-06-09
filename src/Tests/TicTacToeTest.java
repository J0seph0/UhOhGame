package Tests;

import Gui.TicTacToe;
import Methods.Methods;
import org.junit.jupiter.api.*;
import javax.swing.*;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    TicTacToe window;
    JButton testButton;

    @BeforeEach
    void setUp(){
        window = new TicTacToe("Test Window");
        testButton = window.listOfButtons.get(0);
    }

    @Test
    public void testNormalConstructorUse(){
        //checks if all buttons are on the screen and that the title is correct meaning it made a correct super call
        assertEquals(window.listOfButtons.size(), 9);
        assertEquals(window.getTitle(), "Test Window");

    }

    @Test
    void buttonPressChangesTextCorrectly(){
        testButton.doClick();
        assertEquals(testButton.getText(), "X");
    }

    @Test
    void buttonPressAIChangesText(){
        testButton.doClick();
        // since you clicked a box and then the ai clicks a box then there are only 7 open boxes left
        assertEquals(window.openSpaces(), 7);
    }
    @Test
    void clearAllButtonsWorks(){
        boolean workingBlankTest = true;
        window.listOfButtons.get(0).setText("X");
        window.listOfButtons.get(3).setText("X");
        window.listOfButtons.get(1).setText("X");
        window.clearAllButtons();
        for(JButton button : window.listOfButtons){
            if(button.getText() != ""){
                workingBlankTest = false;
            }
        }
        assertTrue(workingBlankTest);
    }
    @Test
    void addButtonTextToAListWorksCorrectly(){
        //if I set the buttons text all alone then the buttontext list wouldn't be updated so I have to update it
        window.addButtonsToList();
        window.listOfButtons.get(5).setText("O");
        if(window.buttonText.size() == 0 ){
            window.addButtonsTextToList();
        }
        assertTrue(window.buttonText.get(5).equals("O"));
    }


    //next few tests will check the win conditions here is a square to help visualize it
    /*
    |0|1|2|
    |3|4|5|
    |6|7|8|

    */
    @Test
    void gameWinConditionTopThree(){
        testButton.doClick();
        window.buttonText.set(1,"X");
        window.buttonText.set(2,"X");

        assertTrue(Methods.determineWinner(window.buttonText));
    }
    @Test
    void gameWinConditionLeftSide(){
        testButton.doClick();
        window.buttonText.set(3,"X");
        window.buttonText.set(6,"X");

        assertTrue(Methods.determineWinner(window.buttonText));
    }
    @Test
    void gameWinConditionTopLeftDiaganol(){
        testButton.doClick();
        window.buttonText.set(4,"X");
        window.buttonText.set(8,"X");

        assertTrue(Methods.determineWinner(window.buttonText));
    }
    //test area from the bottom right corner
    @Test
    void gameWinConditionRightSide(){
        window.listOfButtons.get(8).doClick();
        window.buttonText.set(2,"X");
        window.buttonText.set(5,"X");

        assertTrue(Methods.determineWinner(window.buttonText));
    }
    @Test
    void gameWinConditionBottomRow(){
        window.listOfButtons.get(8).doClick();
        window.buttonText.set(6,"X");
        window.buttonText.set(7,"X");

        assertTrue(Methods.determineWinner(window.buttonText));
    }
    @Test
    void gameWinConditionMiddleRowVertical(){
        window.listOfButtons.get(4).doClick();
        window.buttonText.set(1,"X");
        window.buttonText.set(7,"X");

        assertTrue(Methods.determineWinner(window.buttonText));
    }
    @Test
    void gameWinConditionMiddleRowHorizontal(){
        window.listOfButtons.get(4).doClick();
        window.buttonText.set(3,"X");
        window.buttonText.set(5,"X");

        assertTrue(Methods.determineWinner(window.buttonText));
    }
    @Test
    void gameWinConditionRightDiaganol(){
        window.listOfButtons.get(4).doClick();
        window.buttonText.set(6,"X");
        window.buttonText.set(2,"X");

        assertTrue(Methods.determineWinner(window.buttonText));
    }
}