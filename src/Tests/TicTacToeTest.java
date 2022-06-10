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
    void gameWinConditionTopThree(){
        window.listOfButtons.get(0).doClick();
        window.listOfButtons.get(1).doClick();
        window.listOfButtons.get(2).doClick();

        //assertEquals();
    }

}