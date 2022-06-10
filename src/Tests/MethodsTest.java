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

    @Test
    public void whichIsWinner_Test_counterEqual1_returnO_orNot() {
        if (Methods.counter == 1) {
            assertEquals("O", Methods.whichIsWinner());
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

    @Test
    public void determineWinner_Test_returnTrue_orNot_case1_036areEquals () {

        //winner is X
        buttons.add(0, "X");
        buttons.add(1, "O");
        buttons.add(2, "O");
        buttons.add(3, "X");
        buttons.add(4, "O");
        buttons.add(5, "O");
        buttons.add(6, "X");

        Boolean result = Methods.determineWinner(buttons);
        assertTrue(result);
        buttons.clear();
    }

    @Test
    public void determineWinner_Test_returnTrue_orNot_case2_678areEquals () {

        //winner is X
        buttons.add(0, "O");
        buttons.add(1, "O");
        buttons.add(2, "X");
        buttons.add(3, "O");
        buttons.add(4, "X");
        buttons.add(5, "O");
        buttons.add(6, "X");
        buttons.add(7, "X");
        buttons.add(8, "X");

        Boolean result = Methods.determineWinner(buttons);
        assertTrue(result);
        buttons.clear();
    }

    @Test
    public void determineWinner_Test_returnTrue_orNot_case2_258areEquals () {

        //winner is X
        buttons.add(0, "X");
        buttons.add(1, "O");
        buttons.add(2, "X");
        buttons.add(3, "O");
        buttons.add(4, "X");
        buttons.add(5, "X");
        buttons.add(6, "O");
        buttons.add(7, "O");
        buttons.add(8, "X");

        Boolean result = Methods.determineWinner(buttons);
        assertTrue(result);
        buttons.clear();
    }

    @Test
    public void determineWinner_Test_returnTrue_orNot_case3_246areEquals () {

        //2, 4, 6 are equals
        //winner is X
        buttons.add(0, "O");
        buttons.add(1, "O");
        buttons.add(2, "X");
        buttons.add(3, "O");
        buttons.add(4, "X");
        buttons.add(5, "O");
        buttons.add(6, "X");
        buttons.add(7, "O");
        buttons.add(8, "O");


        Boolean result = Methods.determineWinner(buttons);
        assertTrue(result);
        buttons.clear();
    }

    @Test
    public void determineWinner_Test_returnTrue_orNot_case3_048areEquals () {
        //0, 4, 8 are equals
        //winner is X
        buttons.add(0, "X");
        buttons.add(1, "O");
        buttons.add(2, "O");
        buttons.add(3, "O");
        buttons.add(4, "X");
        buttons.add(5, "O");
        buttons.add(6, "O");
        buttons.add(7, "O");
        buttons.add(8, "X");

        Boolean result = Methods.determineWinner(buttons);
        assertTrue(result);
        buttons.clear();
    }

    @Test
    public void determineWinner_Test_returnTrue_orNot_case3_345areEquals () {
        //winner is X
        buttons.add(0, "O");
        buttons.add(1, "X");
        buttons.add(2, "O");
        buttons.add(3, "X");
        buttons.add(4, "X");
        buttons.add(5, "X");
        buttons.add(6, "O");
        buttons.add(7, "X");
        buttons.add(8, "O");

        Boolean result = Methods.determineWinner(buttons);
        assertTrue(result);
        buttons.clear();
    }

}