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

        //winner is O

        ArrayList<String> buttons = new ArrayList<>();
        buttons.add(0, "O");
        buttons.add(1, "O");
        buttons.add(2, "O");
        buttons.add(3, "O");
        buttons.add(4, "X");
        buttons.add(5, "X");
        buttons.add(6, "O");
        Boolean result = Methods.determineWinner(buttons);

        assertTrue(result);

    }

    @Test
    public void determineWinner_Test_returnTrue_orNot_case2 () {

        //winner is X

        ArrayList<String> buttons2 = new ArrayList<>();
        buttons2.add(0, "O");
        buttons2.add(1, "O");
        buttons2.add(2, "X");
        buttons2.add(3, "O");
        buttons2.add(4, "O");
        buttons2.add(5, "X");
        buttons2.add(6, "X");
        buttons2.add(7, "X");
        buttons2.add(8, "X");

        Boolean result = Methods.determineWinner(buttons2);
        assertTrue(result);
    }

    @Test
    public void determineWinner_Test_returnTrue_orNot_case3 () {

        ArrayList<String> buttons3 = new ArrayList<>();

        //2, 4, 6 are equals
        buttons3.add(0, "O");
        buttons3.add(1, "O");
        buttons3.add(2, "X");
        buttons3.add(3, "O");
        buttons3.add(4, "X");
        buttons3.add(5, "O");
        buttons3.add(6, "X");
        buttons3.add(7, "O");
        buttons3.add(8, "O");


        Boolean result = Methods.determineWinner(buttons3);
        assertTrue(result);

        //0, 4, 8 are equals
        buttons3.clear();

        buttons3.add(0, "X");
        buttons3.add(1, "O");
        buttons3.add(2, "O");
        buttons3.add(3, "O");
        buttons3.add(4, "X");
        buttons3.add(5, "O");
        buttons3.add(6, "O");
        buttons3.add(7, "O");
        buttons3.add(8, "X");

        Boolean result2 = Methods.determineWinner(buttons3);
        assertTrue(result2);

        //3, 4, 5 are equals
        buttons3.clear();

        buttons3.add(0, "O");
        buttons3.add(1, "O");
        buttons3.add(2, "O");
        buttons3.add(3, "X");
        buttons3.add(4, "X");
        buttons3.add(5, "X");
        buttons3.add(6, "O");
        buttons3.add(7, "O");
        buttons3.add(8, "O");

        Boolean result3 = Methods.determineWinner(buttons3);
        assertTrue(result3);
    }



}
