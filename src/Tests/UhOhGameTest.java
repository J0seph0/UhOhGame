package Tests;

import Gui.TicTacToe;
import Gui.UhOhGame;
import Methods.Methods;
import org.junit.jupiter.api.*;
import javax.swing.*;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class UhOhGameTest {
    UhOhGame window;
    @BeforeEach
    void setUp(){
        window = new UhOhGame("New Test");
    }
    @Test
    void constructorTitleWorks(){
        assertEquals("New Test", window.getTitle());
    }
    @Test
    void test(){
        window.ticTacToeButton.doClick();
        assertFalse(window.isDisplayable());
    }
}
