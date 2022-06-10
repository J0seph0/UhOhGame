package Methods;
import Classes.Achievements;
import Classes.Event;
import Classes.Player;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.util.ArrayList;

public class Methods {

    /**
     * This is just a string that needs to be static to be accessed in a static method
     * is is default to tie so if no one ever wins it is a tie since it wasn't set to X or O
     */
    public static String winnerString = "Tie";

    /**
     * This is a int that is being made static so that it can be accessed and manipulated in other classes and by static methods
     * it is just the X or O counter
     */
    public static int counter = 0;

    /**
     * @param button - this is to take in the current button that is being changed
     * This method with put either an X or an O it just counts everyother one or click
     */
    //this sets x or o depending on whos turn it is
    public static String changeButtonText(JButton button) {
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
        }
        return button.getText();
    }//end of change button text

    /**
     * @param buttons - this takes in an arraylist of strings in order to know who has played where
     *
     * This method as some if statements checking three different lcations within the tictactoe board for equals
     * The top left is check and then the bottom right corner, and finally the middle winning positions
     * @return true or false depending on if someone has won the game
     */
    public static boolean determineWinner(ArrayList<String> buttons){
        //We need to check 3 locations, indexes: 0, 4, 8
        Player p1 = new Player();
        Achievements achievements = new Achievements();
        p1.addObserver(achievements);

        //case 1
        //check for the top left corner
        if((buttons.get(0).equals(buttons.get(1)) && buttons.get(0).equals(buttons.get(2))) && buttons.get(0) != "" ||
                (buttons.get(0).equals(buttons.get(3)) && buttons.get(0).equals(buttons.get(6)) && buttons.get(0) != ""))
        {

            System.out.println(buttons.get(0) + " is the winner!");
            //observer pattern checking for the achievement
            if(buttons.get(0).equals("X")) {
                p1.notifyObservers(Event.PLAYER_WINS);
            } else {
                p1.notifyObservers(Event.PLAYER_LOSES);
            }

            winnerString = buttons.get(0);
            //winner window
            setUpWinnerWindow(new JFrame("Winner Window"));
            return true;
        }

        //case 2
        //check for the bottom right corner _|
        if((buttons.get(8).equals(buttons.get(7))  && buttons.get(8).equals(buttons.get(6))) & buttons.get(8) != ""  ||
                (buttons.get(8).equals(buttons.get(5))  && buttons.get(8).equals(buttons.get(2)) && buttons.get(8) != ""))
        {
            System.out.println(buttons.get(8) + " is the winner!");
            //observer checking
            if(buttons.get(8).equals("X")) {
                p1.notifyObservers(Event.PLAYER_WINS);
            } else {
                p1.notifyObservers(Event.PLAYER_LOSES);
            }

            winnerString = buttons.get(8);
            //makes a new window to tell the winner of the game
            setUpWinnerWindow(new JFrame("Winner Window"));
            return true;
        }

        //case 3
        //check for diagonal
        if((buttons.get(2).equals(buttons.get(4))  && buttons.get(4).equals(buttons.get(6))) & buttons.get(2) != ""  ||
                (buttons.get(0).equals(buttons.get(4))  && buttons.get(8).equals(buttons.get(4)) && buttons.get(4) != "") ||
                (buttons.get(1).equals(buttons.get(4))  && buttons.get(7).equals(buttons.get(4)) && buttons.get(4) != "") ||
                (buttons.get(3).equals(buttons.get(4))  && buttons.get(5).equals(buttons.get(4)) && buttons.get(4) != ""))
        {
            System.out.println(buttons.get(4) + " is the winner!");
            //observer
            if(buttons.get(4).equals("X")) {
                p1.notifyObservers(Event.PLAYER_WINS);
            } else {
                p1.notifyObservers(Event.PLAYER_LOSES);
            }

            winnerString = buttons.get(4);
            setUpWinnerWindow(new JFrame("Winner Window"));
            return true;
        }

        //returns false if none of the winning conditions are met
        return false;
    }


    /**
     * @param window
     * This is a static method to be called that it sets up a option pane for the player when you win
     */
    public static void setUpWinnerWindow(JFrame window){
        JOptionPane winnerPane = new JOptionPane(" is the winner" );
        String optionString = "The winner is: ";
        if(winnerString.equals("Tie")) { optionString = "It's a "; }
        winnerPane.showMessageDialog(null, optionString + winnerString);

    }

    /**
     * @return a string containg the player that won the game so either X or O
     */
    public static String whichIsWinner(){
        return  (counter == 0) ? "X" : "O";
    }
}
