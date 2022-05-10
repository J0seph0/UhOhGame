package Methods;
import Classes.*;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.*;
import java.util.ArrayList;

public class Methods {

    JButton[] jButtons = new JButton[9];

    //this is just a class for useful methods
    private static int counter = 0;
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

    //method for determining if someone has won by checking some conditions
    public static void determineWinner(ArrayList<String> buttons){
//We need to check 3 locations, indexes: 0, 4, 8
        Player p1 = new Player(); // Player 1 is X
        Player p2 = new Player(); // Player 2 is O
        Achievements achievements = new Achievements();
        p1.addObserver(achievements);
        p2.addObserver(achievements);

//check for the top left corner
        if((buttons.get(0).equals(buttons.get(1)) && buttons.get(0).equals(buttons.get(2))) && buttons.get(0) != "" ||
                (buttons.get(0).equals(buttons.get(3)) && buttons.get(0).equals(buttons.get(6)) && buttons.get(0) != "")) {
            System.out.println(buttons.get(0) + " is the winner!");
            if(buttons.get(0).equals("X")) {
                achievements.OnNotify(Event.PLAYER_WINS);
            }
        }

//check for the bottom right corner _|
        if((buttons.get(8).equals(buttons.get(7))  && buttons.get(8).equals(buttons.get(6))) & buttons.get(8) != ""  ||
                (buttons.get(8).equals(buttons.get(5))  && buttons.get(8).equals(buttons.get(2)) && buttons.get(8) != "")) {
            System.out.println(buttons.get(8) + " is the winner!");
            if(buttons.get(0).equals("X")) {
                achievements.OnNotify(Event.PLAYER_WINS);
            }
        }

//check for diagonal
        if((buttons.get(2).equals(buttons.get(4))  && buttons.get(4).equals(buttons.get(6))) & buttons.get(2) != ""  ||
                (buttons.get(0).equals(buttons.get(4))  && buttons.get(8).equals(buttons.get(4)) && buttons.get(4) != "") ||
                (buttons.get(1).equals(buttons.get(4))  && buttons.get(7).equals(buttons.get(4)) && buttons.get(4) != "") ||
                (buttons.get(3).equals(buttons.get(4))  && buttons.get(5).equals(buttons.get(4)) && buttons.get(4) != "")) {
            System.out.println(buttons.get(4) + " is the winner!");
            if(buttons.get(0).equals("X")) {
                achievements.OnNotify(Event.PLAYER_WINS);
            }
        }
    }

    public boolean checkIfGridIsFull() {
        boolean gridsFull = true;
        for (int i = 0; i < 9; i++) {
            if (jButtons[i].getText().equals("")) {
                gridsFull = false;
            }
        }
        return gridsFull;
    }





}
