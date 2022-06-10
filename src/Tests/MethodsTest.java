package Tests;

import Gui.TicTacToe;
import Methods.Methods;
import org.junit.jupiter.api.*;
import javax.swing.*;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class MethodsTest {

    @Test
    public void changeButtonText_Test_counterEqual0_returnX_orNot () {
        //test if counter is 0, does it set to x and then turn to o?
        if (Methods.counter == 0) {
            JButton button = new JButton();
            assertEquals("X", Methods.changeButtonText(button) );
        }
    }

    @Test
    public void changeButtonText_Test_counterEqual1_returnO_orNot () {
        //test if counter is 1, does it set to o
        if (Methods.counter == 1) {
            JButton button = new JButton();
            assertEquals("O", Methods.changeButtonText(button) );
        }
    }

    @Test
    public void whichIsWinner_Test_counterEqual0_returnX_orNot () {
        if (Methods.counter == 0) {
            assertEquals("X", Methods.whichIsWinner());
        }
    }

    @Test
    public void determineWinner_Test_returnTrue_orNot_case1 () {
        /*
        check for the top left corner
        if((buttons.get(0).equals(buttons.get(1)) && buttons.get(0).equals(buttons.get(2))) && buttons.get(0) != "" ||
                (buttons.get(0).equals(buttons.get(3)) && buttons.get(0).equals(buttons.get(6)) && buttons.get(0) != ""))
        {
         */
        ArrayList<String> buttons = new ArrayList<>();
        buttons.add(0, "O");
        buttons.add(1, "O");
        buttons.add(2, "O");
        buttons.add(3, "O");
        buttons.add(4, "X");
        buttons.add(5, "X");
        buttons.add(6, "O");
        Boolean result = Methods.determineWinner(buttons);
        {
            assertTrue(result);
        }
    }



}
