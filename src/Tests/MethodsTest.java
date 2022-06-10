package Tests;

import Gui.TicTacToe;
import Methods.Methods;
import org.junit.jupiter.api.*;
import javax.swing.*;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class MethodsTest {

    @Test
    public void changeButtonText_Test_counterEqual0_returnXorNot () {
        //test if counter is 0, does it set to x and then turn to o?
        //test if counter is 1, does it set to o
        if (Methods.counter == 0) {
            JButton button = new JButton();
            assertEquals("X", Methods.changeButtonText(button) );
        }
    }

    @Test
    public void cchangeButtonText_Test_ounterEqual1_returnO_orNot () {
        //test if counter is 1, does it set to o
        if (Methods.counter == 1) {
            JButton button = new JButton();
            assertEquals("O", Methods.changeButtonText(button) );
        }
    }

}
