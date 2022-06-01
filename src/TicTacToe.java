import Methods.Methods;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class TicTacToe extends JFrame{
    /**
     * A set of 9 buttons and a Jpanel to put those buttons is needed
     */
    private JPanel panel1;
    private JButton button1;
    private JButton button3;
    private JButton button7;
    private JButton button9;
    private JButton button4;
    private JButton button6;
    private JButton button2;
    private JButton button5;
    private JButton button8;

    /**
     * An arrayList of Jbuttons to we can modify the buttons action listener a bit more efficiently
     */
    public ArrayList<JButton> listOfButtons = new ArrayList<JButton>();

    /**
     * An arrayList of Strings this time to access the contents of all the buttons in the form of a list where it reads left to right off the board
     */
    public ArrayList<String> buttonText = new ArrayList<String>();
    public ArrayList<String> getButtonText() { return this.buttonText; }


    /**
     * @param title - This is the name of the window
     * This is the constructor that since this class extends JFrame we can new up a TicTacToe object as if it were a JFrame but we have
     * our own settings for the panel, extending it like this makes is cleaner.
     * We have to call super to make the frame since we are extending it, then we can set our settings for the buttons and sizes etc...
     */
    public TicTacToe(String title){
        super(title);
        //just put all of the buttons into a list
        addButtonsToList();
        //since we extend jframe now this class will ack like a frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(this.panel1);
        this.pack();


        //set the action listener for all of the buttons
        for (JButton button : listOfButtons ){
            button.addActionListener(new ActionListener() {
                /**
                 * @param e
                 * This is the command action where we have a method taking in the action listener class and we are just defining the method
                 * we want to call in this way sort of like execute
                 * This method calls the Methods.changeButtontext(button) - this is passing in the current button in the for each loop
                 * Then the buttons are added to the list and the ai is activated if there is more then one tile open
                 * Then it checks if there is a winner and if so it pops up a dialog letting you know who won
                 * There is a last check that is seeing if it is a tie by saying there is no winner and no open spaces
                 */
                @Override
                public void actionPerformed(ActionEvent e) {
                    Methods.changeButtonText(button);
                    addButtonsTextToList();
                    //need to check if there are no open spaces when a button is pressed then no one wins and it just resets
                    if(openSpaces() > 1)
                    {
                        simpleAIButtonChanger();
                        addButtonsTextToList();
                    }
                    if(Methods.determineWinner(buttonText)){
                        Methods.counter = 0;
                        clearAllButtons();
                    }else if(openSpaces() == 0 && !Methods.determineWinner(buttonText)){
                        System.out.println("No one wins");
                        Methods.setUpWinnerWindow(new JFrame("Winner Window"));
                        Methods.counter = 0;
                        clearAllButtons();
                    }

                }
            });
        }

        }

    /**
     * This method sets all the buttons in the arraylist to be empty and clears the button text list
     */
        public void clearAllButtons(){
            this.buttonText.clear();
            button1.setText("");
            button2.setText("");
            button3.setText("");
            button4.setText("");
            button5.setText("");
            button6.setText("");
            button7.setText("");
            button8.setText("");
            button9.setText("");
        }

    /**
     * This method adds all the buttons' text to the arraylist buttonText
     * By first clearing it then readding all the texts it keeps the numbers of the buttons corresponding to the their place on the board
     */
        public void addButtonsTextToList() {
        buttonText.clear();
        buttonText.add(button1.getText());
        buttonText.add(button2.getText());
        buttonText.add(button3.getText());
        buttonText.add(button4.getText());
        buttonText.add(button5.getText());
        buttonText.add(button6.getText());
        buttonText.add(button7.getText());
        buttonText.add(button8.getText());
        buttonText.add(button9.getText());
    }

    /**
     * This method adds the buttons to a arraylist containing Jbuttons
     */
        public void addButtonsToList() {
        listOfButtons.clear();
        listOfButtons.add(button1);
        listOfButtons.add(button2);
        listOfButtons.add(button3);
        listOfButtons.add(button4);
        listOfButtons.add(button5);
        listOfButtons.add(button6);
        listOfButtons.add(button7);
        listOfButtons.add(button8);
        listOfButtons.add(button9);
    }

    /**
     * This method is a basic form of ai that picks a random number in the array of buttons that isn't already filled
     * and changes the text
     */
        public void simpleAIButtonChanger(){
            Random rand = new Random();
            // so we have the button we have to first get the index of that button
            int randomIndex = rand.ints(0,9).findFirst().getAsInt();

            //we want to find a new random number if the randomindex found contains a letter so is not empty
            while(this.buttonText.get(randomIndex) != "")
            {
                randomIndex = rand.ints(0,9).findFirst().getAsInt();
            }
            Methods.changeButtonText(this.listOfButtons.get(randomIndex));
        }

    /**
     * This method goes through the buttontext arraylist and checks how many empty strings there are.
     * @return an int containing how many empty buttons there are
     */
        public int openSpaces(){
            int openSpaceCounter = 0;
            for (String text: buttonText)
            {
                if(text.equals("")) { openSpaceCounter++; }
            }
            return openSpaceCounter;
        }
}
