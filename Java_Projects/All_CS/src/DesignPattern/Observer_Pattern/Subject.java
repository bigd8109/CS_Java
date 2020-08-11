package DesignPattern.Observer_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    public interface Observer {
        public void update();
    }
    int state = 0;

    List<Observer> observersList = new ArrayList<Observer>();

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    public int getState() {
        return state;
    }
    public void setObserver(Observer observer) {
        if (observersList != null) {
            observersList.add(observer);
        }
    }

    public void removeObserver(Observer observer) {
        if (observersList != null && observersList.contains(observer)) {
            observersList.remove(observer);
        }
    }

    public void notifyObservers() {
        for (int i = 0; i < observersList.size(); i++) {
            observersList.get(i).update();
        }
    }
}
