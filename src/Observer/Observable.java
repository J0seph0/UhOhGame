package Observer;
import Classes.Event;

public interface Observable {
    public void addObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers(Event ev);
}
