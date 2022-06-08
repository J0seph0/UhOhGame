package Classes;

import Observer.Observable;
import Observer.Observer;

import java.util.ArrayList;
import java.util.Timer;

public class Player implements Observable {

    private String name;

    private final ArrayList<Observer> observers; //Observers to track achievements for player

    public Player() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyObservers(Event ev) { //Checks if any of the observers can make use of event
        for (Observer o: observers) {
            o.OnNotify(ev);
        }
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

}
