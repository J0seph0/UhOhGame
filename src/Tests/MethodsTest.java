package Tests;

import Gui.TicTacToe;
import Methods.Methods;
import org.junit.jupiter.api.*;
import javax.swing.*;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class MethodsTest {

    /*
    //this sets x or o depending on whos turn it is
    public static void changeButtonText(JButton button) {
        if(button.getText().isBlank()) {
            if (counter == 0)
            {
                button.setText("X");
                counter = 1;
            }
            else
            {
                button.setText("O");
                counter = 0;
            }
            return;
        }
    }//end of change button text
     */
    @Test
    public void counterEqual0_returnXorNot () {
        //test if counter is 0, does it set to x and then turn to o?
        //test if counter is 1, does it set to o
        if (Methods.counter == 0) {
            JButton button = new JButton();
            assertEquals("X", Methods.changeButtonText(button) );
        }
    }

    @Test
    public void counterEqual1_returnO_orNot () {
        //test if counter is 1, does it set to o
        if (Methods.counter == 1) {
            JButton button = new JButton();
            assertEquals("O", Methods.changeButtonText(button) );
        }
    }

}
