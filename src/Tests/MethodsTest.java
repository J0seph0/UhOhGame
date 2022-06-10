package Tests;

import Gui.TicTacToe;
import Methods.Methods;
import org.junit.jupiter.api.*;
import javax.swing.*;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class MethodsTest {

    @Test
    public void changeButtonText_Test_counterEqual0_returnX_orNot() {
        //test if counter is 0, does it set to x and then turn to o?
        if (Methods.counter == 0) {
            JButton button = new JButton();
            assertEquals("X", Methods.changeButtonText(button));
        }
    }

    @Test
    public void changeButtonText_Test_counterEqual1_returnO_orNot() {
        //test if counter is 1, does it set to o
        if (Methods.counter == 1) {
            JButton button = new JButton();
            assertEquals("O", Methods.changeButtonText(button));
        }
    }

    @Test
    public void whichIsWinner_Test_counterEqual0_returnX_orNot() {
        if (Methods.counter == 0) {
            assertEquals("X", Methods.whichIsWinner());
        }
    }

    ArrayList<String> buttons = new ArrayList<>();

    @Test
    public void determineWinner_Test_returnTrue_orNot_case1_012areEquals() {

        //winner is O
        buttons.add(0, "O");
        buttons.add(1, "O");
        buttons.add(2, "O");
        buttons.add(3, "X");
        buttons.add(4, "X");
        buttons.add(5, "X");
        buttons.add(6, "X");

        Boolean result = Methods.determineWinner(buttons);
        assertTrue(result);

        buttons.clear();
    }

}