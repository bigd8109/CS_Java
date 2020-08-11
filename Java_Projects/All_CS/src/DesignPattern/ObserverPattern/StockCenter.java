package DesignPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

interface Observer {
    public void update(String[] stockPrice);
}

public class StockCenter {
    List<Observer> listeners = new ArrayList<Observer>();

    public void register(Observer listener) {
        if (listener != null) {
            listeners.add(listener);
        }
    }

    public void unregister(Observer listener) {

        int index = listeners.indexOf(listener);
        if (index >=0 )
            listeners.remove(index);

    }

    public void notifyChanges(String[] stockPrice) {
        for (Observer lis: listeners) {
            lis.update(stockPrice);
        }
    }
}
