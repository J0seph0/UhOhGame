import Actions.GenericActions;
import Classes.GenericController;
import Methods.Methods;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TicTacToe extends JFrame{
    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;

    public static ArrayList<String> buttonText = new ArrayList<String>();



    public void addButtonsToList() {
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

    public TicTacToe(String title){
        super(title);
        GenericController controller = new GenericController();
        controller.setAction(new GenericActions());
        //just put all of the buttons into a list
        addButtonsToList();
        //since we extend jframe now this class will ack like a frame
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(this.panel1);
        this.pack();


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Methods.changeButtonText(button1);
                addButtonsToList();

            }
        });button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Methods.changeButtonText(button2);
                addButtonsToList();

            }
        });button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Methods.changeButtonText(button3);
                addButtonsToList();

            }
        });button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Methods.changeButtonText(button4);
                addButtonsToList();

            }
        });button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Methods.changeButtonText(button5);
                addButtonsToList();

            }
        });button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Methods.changeButtonText(button6);
                addButtonsToList();

            }
        });button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Methods.changeButtonText(button7);
                addButtonsToList();

            }
        });button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Methods.changeButtonText(button8);
                addButtonsToList();

            }
        });button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Methods.changeButtonText(button9);
                addButtonsToList();

            }
        });

        }



}
