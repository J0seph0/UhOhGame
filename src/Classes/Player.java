package Classes;

import Observer.Observable;
import Observer.Observer;

import java.util.ArrayList;

public class Player implements Observable {

    private String name;

    private final ArrayList<Observer> observers;

    public Player() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyObservers(Event ev) {
        for (Observer o: observers) {
            o.OnNotify(ev);
        }
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
}
