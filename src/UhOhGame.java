import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UhOhGame {

    private JButton doSomethingButton;
    private JPanel panel1;

    public UhOhGame(){
        doSomethingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello console");
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here

    }
    public JPanel getPanel1(){return this.panel1; }
}
