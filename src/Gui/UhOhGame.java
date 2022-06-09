package Gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UhOhGame extends JFrame{

    public JButton ticTacToeButton;
    private JPanel panel1;
    private JTextField intialText;
    private JLabel titleLabel;


    /**
     * @param title - this is the title of the window
     *  This is the constructor that extends JFrame so that we can make a window by creating an UhOhGame object rather than a Jframe
     *  This window just needs a way to say hello and let you open tic tac toe if you would like
     */
    public UhOhGame(String title){
        //going to create a basic controller just a setup to see what it'll be like
        super(title);
        //since we extend jframe now this class will ack like a frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(this.panel1);
        this.pack();

        // Do something button that
        ticTacToeButton.addActionListener(new ActionListener() {
            /**
             * @param e
             * This is the action assignment for the button
             * We want this button to delete this window and then open the tictactoe frame
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                UhOhGame.super.dispose();
                JFrame ticTacToeScreen = new TicTacToe("TicTacToe");
                ticTacToeScreen.setSize(1000, 700);
                ticTacToeScreen.setVisible(true);
                System.out.println("Hello console");
            }
        });


    }//end of UhOhConstructor

}
