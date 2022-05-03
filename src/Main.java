import javax.swing.*;


public class Main {

    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("UhOhGame");
        //settings for window but not the actual things inside the window
        mainFrame.setSize(500,500);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setContentPane(new UhOhGame().getPanel1());
        mainFrame.pack();
        mainFrame.setVisible(true);
        //end of basic setting for the gui


    }


}
