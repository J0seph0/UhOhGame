import Actions.GenericActions;
import Classes.GenericController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UhOhGame extends JFrame{

    private JButton ticTacToeButton;
    private JPanel panel1;
    private JTextField intialText;
    private JLabel titleLabel;


    public UhOhGame(String title){
        //going to create a basic controller just a setup to see what it'll be like
        super(title);
        GenericController controller = new GenericController();
        controller.setAction(new GenericActions());

        //since we extend jframe now this class will ack like a frame
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(this.panel1);
        this.pack();

        // Do something button that
        ticTacToeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UhOhGame.super.dispose();
                JFrame ticTacToeScreen = new TicTacToe("TicTacToe");
                ticTacToeScreen.setVisible(true);
                System.out.println("Hello console");
            }
        });




    }//end of UhOhConstructor

    private void createUIComponents() {
        // TODO: place custom component creation code here

    }
    public JPanel getPanel1(){return this.panel1; }
}
