import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UhOhGame {

    private JButton doSomethingButton;
    private JPanel panel1;
    private JTextField intialText;
    private JLabel titleLabel;

    public UhOhGame(){
        // Do something button that
        doSomethingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //this is where you add what you want to happen when you click the button
                titleLabel.setText(intialText.getText());
                System.out.println("Hello console");
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here

    }
    public JPanel getPanel1(){return this.panel1; }
}
