import Classes.Achievements;
import Classes.Event;
import Methods.Methods;
import Observer.Observer;

import javax.imageio.stream.FileCacheImageInputStream;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import Classes.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new UhOhGame("Main Title");
        frame.setSize(1000, 1000);
        frame.setVisible(true);
        Player p1 = new Player();
        Achievements achievements = new Achievements();
        p1.addObserver(achievements);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                p1.notifyObservers(Event.TIME_10);
            }
        }, 10000);

        //end of basic setting for the gui


    }


}
